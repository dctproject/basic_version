package thymeleafexamples.stsm.business.entities.repositories;

import org.springframework.stereotype.Repository;
import thymeleafexamples.stsm.business.entities.Order;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by buress on 12/3/16.
 */
@Repository
public class OrderRepository {
    private Map<Integer, Order> orderById = new HashMap<Integer, Order>();

    public OrderRepository() {super();}

    public Order findById(Integer id) {
        return this.orderById.get(id);
    }

    public void add(Order order) {
        this.orderById.put(order.getId(), order);
    }
    public Integer generateId() {
        return this.orderById.size();
    }

}
