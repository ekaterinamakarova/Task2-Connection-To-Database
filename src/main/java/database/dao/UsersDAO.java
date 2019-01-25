package database.dao;

import database.entity.Users;

import java.sql.SQLException;

public interface UsersDAO {

    Users getNameAndPassword() throws SQLException;

}
