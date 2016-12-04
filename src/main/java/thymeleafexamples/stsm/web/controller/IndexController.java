package thymeleafexamples.stsm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleafexamples.stsm.business.entities.Area;
import thymeleafexamples.stsm.business.entities.CuisineRecommend;
import thymeleafexamples.stsm.business.services.CuisineService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by buress on 11/30/16.
 */
@Controller
public class IndexController {
    @Autowired
    private CuisineService cuisineService;

    @ModelAttribute("allArea")
    public List<Area> populateArea() {
        return Arrays.asList(Area.ALL);
    }


    @RequestMapping({"/index"})
    public String showDefaultIndex(final CuisineRecommend cuisineRecommend) {
        cuisineRecommend.setCuisines(this.cuisineService.findByArea(cuisineRecommend.getArea().toString()));
        return "index";
    }
}
