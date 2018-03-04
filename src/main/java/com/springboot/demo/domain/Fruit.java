package com.springboot.demo.domain;

/**
 * Created by Paige on 3/4/18.
 */
public class Fruit {

    private String name;
    private Number price;
    private String country;
    private Number sweetness;
    private String colour;

    public Fruit(String name, Number price, String country, Number sweetness, String colour) {
        this.name = name;
        this.price = price;
        this.country = country;
        this.sweetness = sweetness;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public Number getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }

    public Number getSweetness() {
        return sweetness;
    }

    public String getColour() {
        return colour;
    }
}
