package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.mariadb.jdbc.ClientSidePreparedStatement;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DogTypes {

    DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country) {
        List<String> result = new ArrayList<>();
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement("select name from dog_types where country = ?");
            statement.setString(1, country.toUpperCase());
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                result.add(rs.getString("name").toLowerCase());
            }
            Collections.sort(result);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
}
