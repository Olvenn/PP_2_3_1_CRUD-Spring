package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void addUser(User user);

    User getUser(long id);

    void updateUser(long id, User user);

    void deleteUser(long id);
}
