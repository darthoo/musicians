package service;

import dao.AreaDao;
import dao.AreaRepository;
import dao.impl.AreaDaoHibernate;
import entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 15.03.2017.
 */
@Service
public class AreaService {

    @Autowired
    AreaRepository areaRepository;

    public Area findById(Integer id) {
        return areaRepository.findOne(id);
    }

    public List<Area> findAll() {
        System.out.println("Amount of available addresses");
        return (List<Area>) areaRepository.findAll();
    }

    public void save(Area area) {
        areaRepository.save(area);
    }

    public void delete(Integer id) {
        areaRepository.delete(id);
    }

    public Area getAreaByName(String name) {
        return  areaRepository.findAreaByNameLike(name);
    }
}
