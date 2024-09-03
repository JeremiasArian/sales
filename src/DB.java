import java.sql.*;

public class DB {
    public static Connection connect() throws SQLException {
        try {
            var jdbcUrl = DatabaseConfig.getDbUrl();
            var user = DatabaseConfig.getDbUsername();
            var password = DatabaseConfig.getDbPassword();

            return DriverManager.getConnection(jdbcUrl, user, password);

        }

        catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
