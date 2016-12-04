package thymeleafexamples.stsm.business.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by buress on 12/2/16.
 */
public class CuisineRecommend {
    private Area area = Area.BEIJING;

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Cuisine> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<Cuisine> cuisines) {
        this.cuisines = cuisines;
    }

    private List<Cuisine> cuisines = new ArrayList<Cuisine>();

    public CuisineRecommend() {super();}
}
