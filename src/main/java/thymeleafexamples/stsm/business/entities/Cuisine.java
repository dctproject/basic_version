package thymeleafexamples.stsm.business.entities;

/**
 * Created by buress on 12/1/16.
 */
public class Cuisine {
    private String imgurl;
    private String name;
    private String description;
    private String price;
    private String url;

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    private String amount;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Cuisine() {

    }
    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void copy(Cuisine obj) {
        this.setUrl(obj.getUrl());
        this.setPrice(obj.getPrice());
        this.setName(obj.getName());
        this.setImgurl(obj.getImgurl());
        this.setDescription(obj.getDescription());
    }
}
