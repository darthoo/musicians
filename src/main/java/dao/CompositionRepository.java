package dao;

import entity.Composition;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Odyniuk on 21/03/2017.
 */
public interface CompositionRepository extends CrudRepository<Composition, Integer> {
}
