package InserirDados.Exercicios;

import InserirDados.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InsercaoDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("insert into seller (Name, Email, BirthDate, BaseSalary, " +
                    "DepartmentId)" +
                    "values (?, ?, ?, ?, ?)");
            st.setString(1, "João Mirandinha");
            st.setString(2, "mirandinha@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("15/08/1999").getTime()));
            st.setDouble(4, 13343.21);
            st.setInt(5, 2);
            st.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }
}
