package dao.impl;

import dao.AreaDao;
import entity.Area;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by eugen on 3/17/17.
 */
@Repository
public class AreaDaoHibernate implements AreaDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Area findById(Integer id) {
        return null;
    }

    public List<Area> findAll() {
        Session session = sessionFactory.openSession();
        List<Area> areas = session.createQuery("from Area").list();
        session.close();
        return areas;
    }

    public void save(Area area) {

    }

    public void delete(Integer id) {

    }
}
