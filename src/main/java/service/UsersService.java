package service;

import dao.UsersDAO;
import tables.Users;

import javax.rmi.CORBA.Util;
import java.util.List;

public class UsersService extends Util  implements UsersDAO{

    @Override
    public void add(Users users) {

    }

    @Override
    public List<Users> getAll() {
        return null;
    }

    @Override
    public Users getById(int id) {
        return null;
    }

    @Override
    public void update(Users users) {

    }

    @Override
    public void dalete(Users users) {

    }
}
