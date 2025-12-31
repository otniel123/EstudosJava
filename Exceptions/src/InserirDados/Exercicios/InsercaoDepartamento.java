package InserirDados.Exercicios;

import InserirDados.db.DB;

import java.sql.*;

public class InsercaoDepartamento {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("insert into department (Name) values " +
                    "(?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, "Almoxarife");

            if (st.executeUpdate() > 0){
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()){
                    System.out.println("ID gerado para o departamento: " + rs.getInt(1));
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
