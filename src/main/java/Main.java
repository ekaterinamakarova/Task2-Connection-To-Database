import database.bl.UtilClass;
import database.service.UsersService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        UtilClass util = new UtilClass();
        util.getConnection();
        UsersService usersService=new UsersService();
        usersService.getNameAndPassword();
    }
}
