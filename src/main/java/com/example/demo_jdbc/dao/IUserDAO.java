package com.example.demo_jdbc.dao;

import com.example.demo_jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    void insertUser(User user) throws SQLException;

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> searchUser(String country);

    //----------------------------------------------------------------
    List<User> selectAllUsers();

    List<User> sortAllUsersByName();

    //----------------------------------------------------------------
    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;
//    --------------------------------


    void addUserTransaction(User user, int[] permision);

    void insertUpdateWithoutTransaction();

    void insertUpdateUseTransaction();

//    --------------------------------

    List<User> callGetAllUsers();
    boolean callUpdateUser(User user) throws SQLException;
    boolean callDeleteUser(int id) throws SQLException;
}