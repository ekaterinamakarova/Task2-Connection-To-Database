package database.service;

import database.bl.UtilClass;
import database.dao.UsersDAO;
import database.entity.Users;

import javax.xml.crypto.NoSuchMechanismException;
import java.sql.*;


public class UsersService extends UtilClass implements UsersDAO{

    Connection connection = getConnection();
    private NoSuchMechanismException e;

    @Override
    public Users getNameAndPassword() throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "SELECT name, password FROM users";

        Users users = new Users();
        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()){
                String str = "Name: " + resultSet.getString("name" ) + " Parrword: " + resultSet.getString("password");
                System.out.println(str);
            }
            resultSet.close();
            stmt.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
     finally {
        connection.close();

        return users;

    }

}
}

