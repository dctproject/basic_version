package thymeleafexamples.stsm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleafexamples.stsm.business.entities.Cuisine;
import thymeleafexamples.stsm.business.entities.Order;
import thymeleafexamples.stsm.business.services.CuisineService;
import thymeleafexamples.stsm.business.services.OrderService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by buress on 12/3/16.
 */

@Controller
public class MenuController {
    @Autowired
    private CuisineService cuisineService;
    @Autowired
    private OrderService orderService;
    @ModelAttribute("allCuisines")
    public List<Cuisine> populateCuisineNames() {return this.cuisineService.getAllCuisines();}

    @RequestMapping(path="/menu")
    public String showMenu(final Order order) {
        return "menu";
    }

    @RequestMapping(value="/menu", params={"select-cuisine"})
    public String addRow(final Order order, final BindingResult bindingResult, final HttpServletRequest req) {
        Cuisine cuisine = new Cuisine();
        cuisine.copy(cuisineService.findByName(req.getParameter("select-cuisine")));
        order.getList().add(cuisine);
        return "menu";
    }
    @RequestMapping(value="/menu", params={"remove-cuisine"})
    public String removeRow(final Order order, final BindingResult bindingResult, final HttpServletRequest req) {
        Integer index = Integer.valueOf(req.getParameter("remove-cuisine"));
        order.getList().remove(index.intValue());
        return "menu";
    }

    @RequestMapping(value="/menu", params={"save"})
    public String saveSeedstarter(final Order order, final BindingResult bindingResult, final ModelMap model) {
        if (bindingResult.hasErrors()) {
            return "menu";
        }
        order.setId(this.orderService.generateId());
        this.orderService.add(order);
        model.clear();
        return "redirect:/order/" + order.getId();
    }
}
