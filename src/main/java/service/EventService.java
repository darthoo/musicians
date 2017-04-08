package service;

import dao.EventDao;
import entity.Band;
import entity.Event;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by kowalskiy on 15.03.17.
 */
public class EventService {

    @Autowired
    EventDao eventDao;

    public Event findById(int id) {
        System.out.println("EventService: findByid() method");
        return eventDao.findById(id);
    }

    public List<Event> findAll() { return eventDao.findAll(); }

    public void save (Event event) { eventDao.save(event); }

    public void delete(int id) { eventDao.delete(id); }
}
