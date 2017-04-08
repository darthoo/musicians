package dao.impl;

import dao.AreaDao;
import entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 15.03.2017.
 */
@Repository
public class AreaDaoJdbcTemplate implements AreaDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Area findById(Integer id) { return null; }

    public List<Area> findAll() {
        return jdbcTemplate.query("select * from area", new RowMapper<Area>() {
            public Area mapRow(ResultSet resultSet, int i) throws SQLException {
                Area area = new Area();
                area.setId(resultSet.getInt("id"));
                area.setName(resultSet.getString("name"));
                area.setAddress(resultSet.getString("address"));
                area.setNumOfPlaces(resultSet.getInt("places"));
                return area;
            }
        });
    }

    public void save(Area area) {}

    public void delete(Integer id) {}

}
