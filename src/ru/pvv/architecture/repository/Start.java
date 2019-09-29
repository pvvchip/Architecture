package ru.pvv.architecture.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Start {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "DBC_DATABASE_URL:jdbc:mysql://localhost:3306/my_db?createDatabaseIfNotExist=true&allowPublicKeyRetrieval",
                "root", "root");
        UserRepository userRepository = new UserRepository(conn);

        userRepository.insert(new User("user1", "pass1"));
        userRepository.update(new User("user1", "pass2"));
        userRepository.delete(new User("user1", "pass2"));
    }
}
