package thymeleafexamples.stsm.business.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by buress on 12/2/16.
 */
public class Order {
    private String user = null;
    private Integer id = null;
    private List<Cuisine> list = new ArrayList<Cuisine>();

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Cuisine> getList() {
        return this.list;
    }
    public Boolean hasOrdered(Cuisine cuisine) {
        for (Cuisine c:this.list
             ) {
            if (c.getName().equals(cuisine.getName())) return true;
        }
        return false;
    }
}
