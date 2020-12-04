package mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class Test1 implements RowMapper<User>{


    @Override
    public User map(ResultSet resultSet) throws SQLException {
        return null;
    }
}
