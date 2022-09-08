package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Tom", "Tomas", (byte) 25);
        userService.saveUser("John", "Johnson", (byte) 45);
        userService.saveUser("Charly", "Chaplin", (byte) 28);
        userService.saveUser("Ben", "Stiller", (byte) 55);
        System.out.println();

        userService.getAllUsers().forEach(System.out :: println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
