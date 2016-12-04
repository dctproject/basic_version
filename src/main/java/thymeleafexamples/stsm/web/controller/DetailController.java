package thymeleafexamples.stsm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleafexamples.stsm.business.entities.Cuisine;
import thymeleafexamples.stsm.business.services.CuisineService;
import thymeleafexamples.stsm.business.services.OrderService;

/**
 * Created by buress on 12/2/16.
 */
@Controller
public class DetailController {
    @Autowired
    private CuisineService cuisineService;
    @Autowired
    private OrderService orderService;

    public DetailController() {super();}
    @RequestMapping(path = "/cuisine_detail/{name}")
    public String showCuisineDetail(@PathVariable String name,  final Cuisine cuisine) {
        cuisine.copy(this.cuisineService.findByName(name));
        return "cuisinedetail";
    }
}
