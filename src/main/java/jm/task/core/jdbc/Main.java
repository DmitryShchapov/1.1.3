package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Tom", "Tomas", (byte) 25);
        userService.getLastUser();
        userService.saveUser("John", "Johnson", (byte) 45);
        userService.getLastUser();
        userService.saveUser("Charly", "Chaplin", (byte) 28);
        userService.getLastUser();
        userService.saveUser("Ben", "Stiller", (byte) 55);
        userService.getLastUser();
        System.out.println();

        userService.getAllUsers().forEach(System.out :: println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
