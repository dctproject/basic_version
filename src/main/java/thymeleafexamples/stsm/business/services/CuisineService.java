package thymeleafexamples.stsm.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thymeleafexamples.stsm.business.entities.Cuisine;
import thymeleafexamples.stsm.business.entities.repositories.CuisineRepository;

import java.util.List;

/**
 * Created by buress on 12/2/16.
 */
@Service
public class CuisineService {
    @Autowired
    private CuisineRepository cuisineRepository;

    public CuisineService() {super();}
    public List<Cuisine> findByArea(String area) {
        return this.cuisineRepository.findByArea(area);
    }
    public Cuisine findByName(String name) {
        return this.cuisineRepository.findByName(name);
    }
    public List<Cuisine> getAllCuisines() {return this.cuisineRepository.getAllCuisines();}
}
