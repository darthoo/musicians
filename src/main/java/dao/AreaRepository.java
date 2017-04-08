package dao;

import entity.Area;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by eugen on 3/17/17.
 */
public interface AreaRepository extends CrudRepository<Area,Integer>{

    Area findAreaByNameLike(String name);
}
