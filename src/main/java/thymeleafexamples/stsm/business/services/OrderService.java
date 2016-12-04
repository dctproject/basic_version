package thymeleafexamples.stsm.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thymeleafexamples.stsm.business.entities.Order;
import thymeleafexamples.stsm.business.entities.repositories.OrderRepository;

/**
 * Created by buress on 12/3/16.
 */
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public OrderService() {super();}

    public Order findById(Integer id) {
        return this.orderRepository.findById(id);
    }
    public void add(Order order) {
        this.orderRepository.add(order);
    }
    public Integer generateId() {
        return this.orderRepository.generateId();
    }

}
