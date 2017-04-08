package dao;

import dao.AreaDao;
import entity.Area;

import java.util.List;

/**
 * Created by admin on 15.03.2017.
 */
public interface AreaDao {

    Area findById(Integer id);

    List<Area> findAll();

    void save (Area area);

    void delete (Integer id);
}
