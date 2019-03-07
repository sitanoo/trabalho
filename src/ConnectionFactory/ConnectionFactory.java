package ConnectionFactory;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class ConnectionFactory {

    public static Connection main(String[] args) {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1/sistema_gestao", "root", "");
        } catch (SQLException e){
            throw new RuntimeException (e);
        }       
    }
    
}
