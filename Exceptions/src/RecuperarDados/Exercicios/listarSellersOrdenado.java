package RecuperarDados.Exercicios;

import RecuperarDados.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class listarSellersOrdenado {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("Select * from seller order by Name");

            while (rs.next()){
                System.out.println("Nome vendedor: " + rs.getString("Name") + "\nEmail vendedor: " + rs.getString("Email"));
                System.out.println("\n\n");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
