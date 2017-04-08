package service;

import dao.BandDao;
import entity.Band;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ������� on 12.03.2017.
 */
public class BandService {

    @Autowired
    BandDao bandDao;

    public Band findById(Integer id) {
        System.out.println("Method findById from bandService");
        return bandDao.findById(id);
    }

    public List<Band> findAll() {
        return bandDao.findAll();
    }

    public void save(Band band) {
        bandDao.save(band);
    }


    public void delete(Integer id) {
        bandDao.delete(id);
    }

}
