package thymeleafexamples.stsm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleafexamples.stsm.business.entities.Order;

/**
 * Created by buress on 12/3/16.
 */
@Controller
public class OrderController {
    public OrderController() {super();}

    @RequestMapping(path="/order/{id}")
    public String showOrderDetail(@PathVariable String id,  final Order order) {
        return "order";
    }
}
