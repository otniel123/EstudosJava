package RecuperarDados.Exercicios;

import RecuperarDados.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class listarSellers {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        Integer id = 5;
        String query = "select * from seller where Id = " + id;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println("ID Vendedor: " + rs.getInt("Id") + "\nNome vendedor: " + rs.getString("Name") + "\nEmail Vendedor: "
                        + rs.getString("Email") + "\nBaseSalary Vendedor: " + rs.getDouble("BaseSalary"));
                System.out.println("\n\n");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
            DB.closeConnection();
        }

    }
}
