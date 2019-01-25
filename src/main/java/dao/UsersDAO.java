package dao;

import tables.Users;

import java.util.List;

public interface UsersDAO {

    //create
    void add(Users users);

    //read
    List<Users> getAll();

    Users getById(int id);

    //update
    void update(Users users);

    //delete
    void dalete(Users users);
}
