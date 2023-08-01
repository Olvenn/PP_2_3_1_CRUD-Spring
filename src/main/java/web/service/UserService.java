package web.service;

import web.models.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    void addUser(User user);
    User getUser(long id);
    void updateUser(long id, User user);
    void deleteUser(long id);
}
