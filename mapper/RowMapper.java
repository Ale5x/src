package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T> {
    String UNKNOWN_TABLE = "Unknown table = ";

    T map(ResultSet resultSet) throws SQLException;
/*
    static RowMapper<?> create(String table) {
        switch (table) {
            case "table 1":
                return //new UserRowMapper();
            case "table 2":
                return new StudentTaskRowMapper();
            default:
                throw new IllegalArgumentException(UNKNOWN_TABLE + table);
        }

    }
    */
}
