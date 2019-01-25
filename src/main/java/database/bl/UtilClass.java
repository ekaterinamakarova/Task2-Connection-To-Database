package database.bl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilClass {

    private static final String DB_DRIVER="org.postgresql.Driver";
    private static final String DB_URL="jdbc:postgresql://192.168.1.56:5432/dgroops_new";
    private static final String DB_USERNAME="dgroops_user";
    private static final String DB_PASSWORD="dgroops_pass";

    public Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName(DB_DRIVER);
            connection= DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            System.out.println("Connection is OK");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR in connection");
        }
        return connection;
    }
}
