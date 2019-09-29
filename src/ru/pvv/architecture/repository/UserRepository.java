package ru.pvv.architecture.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepository {
    private final Connection conn;

    public UserRepository(Connection conn) throws SQLException {
        this.conn = conn;
        createTableIfNotExist(conn);
    }

    private void createTableIfNotExist(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("create table if not exists user ()" +
                    "id int auto_increment primary key ," +
                    "login varchar (25)," +
                    "password varchar (25)," +
                    "unique index uq_login(login));");
        }
    }

    public void insert(User person) {
        // использование методов чистого JDBC
    }

    public void update(User person) {
        // использование методов чистого JDBC
    }

    public void delete(User person) {
        // использование методов чистого JDBC
    }
}
