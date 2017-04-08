package dao;

import entity.Event;

import java.util.List;

/**

 * Created by kowalskiy on 15.03.17.
 */
public interface EventDao {

    Event findById(int id);

    List<Event> findAll();

    void save (Event event);

    void delete(int id);
}
