package com.example.demo_jdbc.dao;

import com.example.demo_jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;
    public List<User> searchUser(String country);

    public User selectUser(int id);

    public List<User> selectAllUsers();
    public List<User> sortAllUsersByName();
}