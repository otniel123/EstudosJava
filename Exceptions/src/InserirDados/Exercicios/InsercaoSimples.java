package InserirDados.Exercicios;

import InserirDados.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InsercaoSimples {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("insert into seller (Name, Email, BirthDate, BaseSalary, " +
                    "DepartmentId) values (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, "Otniel Marques");
            st.setString(2, "otnielmarques3@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("12/06/2006").getTime()));
            st.setDouble(4, 78000);
            st.setInt(5, 4);

            int rowsAffected= st.executeUpdate();

            if (rowsAffected > 0){
                System.out.println("Rows affected: " + rowsAffected + "\nGenerated ID's: ");
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()){
                    int id = rs.getInt(1);
                    System.out.println(id);
                }
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
