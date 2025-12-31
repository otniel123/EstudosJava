package DeletarDados.application;

import AtualizarDados.db.DB;
import DeletarDados.db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();

            st = conn.prepareStatement("delete from department " +
                                            "where " +
                                            "Id = ?");
            st.setInt(1, 5);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }
        finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
