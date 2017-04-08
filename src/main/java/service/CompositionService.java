package service;

import dao.CompositionRepository;
import entity.Composition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Odyniuk on 21/03/2017.
 */
@Service
public class CompositionService {

    @Autowired
    CompositionRepository compositionRepository;

    public Composition findById(Integer id) {
        return compositionRepository.findOne(id);
    }

    public List<Composition> findAll() {
        return (List<Composition>) compositionRepository.findAll();
    }

    public void save(Composition composition) {
        compositionRepository.save(composition);
    }

    public void delete(Integer id) {
        compositionRepository.delete(id);
    }
}
