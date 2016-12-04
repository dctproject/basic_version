package thymeleafexamples.stsm.business.entities.repositories;

import org.springframework.stereotype.Repository;
import thymeleafexamples.stsm.business.entities.Area;
import thymeleafexamples.stsm.business.entities.Cuisine;

import java.util.*;

/**
 * Created by buress on 12/1/16.
 */
@Repository
public class CuisineRepository {
    private Map<String, List<Cuisine>> cuisineByCountry;
    private Map<String, Cuisine> cuisineByName;
    private List<Cuisine> allCuisines;
    public CuisineRepository() {
        super();
        cuisineByCountry = new LinkedHashMap<String, List<Cuisine>>();
        cuisineByName = new HashMap<String, Cuisine>();
        List<Cuisine> list1 = new ArrayList<Cuisine>();
        Cuisine cuisine1 = new Cuisine();
        cuisine1.setDescription("这是一盘菜");
        cuisine1.setImgurl("/images/stsmlogo.png");
        cuisine1.setName("beijingcai");
        cuisine1.setPrice("100");
        cuisine1.setUrl("./cuisines/beijingcai");
        list1.add(cuisine1);
        List<Cuisine> list2 = new ArrayList<Cuisine>();
        Cuisine cuisine2 = new Cuisine();
        cuisine2.setDescription("这是一盘菜");
        cuisine2.setImgurl("/images/stsmlogo.png");
        cuisine2.setName("shanghaicai");
        cuisine2.setPrice("100");
        cuisine1.setUrl("./cuisines/shanghaicai");
        list2.add(cuisine2);
        List<Cuisine> list3 = new ArrayList<Cuisine>();
        Cuisine cuisine3 = new Cuisine();
        cuisine3.setDescription("这是一盘菜");
        cuisine3.setImgurl("/images/stsmlogo.png");
        cuisine3.setName("guangzhoucai");
        cuisine3.setPrice("100");
        cuisine1.setUrl("./cuisines/guangzhoucai");
        list3.add(cuisine3);

        this.cuisineByCountry.put("BEIJING", list1);
        this.cuisineByCountry.put("GUANGZHOU", list2);
        this.cuisineByCountry.put("SHANGHAI", list3);
        cuisineByName.put("guangzhoucai", cuisine3);
        cuisineByName.put("beijingcai", cuisine1);
        cuisineByName.put("shanghaicai", cuisine2);
        this.allCuisines = new ArrayList<Cuisine>(this.cuisineByName.values());

    }
    public List<Cuisine> findByArea(Area area) {
        return findByArea(area.toString());
    }
    public List<Cuisine> findByArea(String area) {
        return this.cuisineByCountry.get(area);
    }
    public Cuisine findByName(String name) {
        return this.cuisineByName.get(name);
    }
    public List<Cuisine> getAllCuisines() {return new ArrayList<Cuisine>(this.allCuisines);}

}
