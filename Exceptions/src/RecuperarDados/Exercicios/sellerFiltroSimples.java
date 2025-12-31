package RecuperarDados.Exercicios;

import RecuperarDados.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sellerFiltroSimples {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("Select * from seller where BaseSalary >= 3000");

            System.out.println("Vendedores cujo salário base é maior ou igual a 3000: ");
            while (rs.next()){
                System.out.println("\n\nNome: " + rs.getString("name") + "\nSalário Base: " + rs.getDouble("BaseSalary"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeConnection();
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
    }
}
