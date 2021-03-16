package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DogTypes {

    private DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country) {
        List<String> result = new ArrayList<>();
        String countryLowerCase = country.toLowerCase();
        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("select name from dog_types where country = ? order by name desc")
        ) {
            stmt.setString(1,countryLowerCase);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String name = rs.getString("name").toLowerCase();
                result.add(name);
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect database",sqlException);
        }
        return result;
    }
}
