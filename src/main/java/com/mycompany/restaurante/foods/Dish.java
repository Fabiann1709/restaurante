
package com.mycompany.restaurante.foods;

import com.mycompany.restaurante.values.DishTypes;
import com.mycompany.restaurante.values.DishVariation;

public class Dish {
    DishTypes type;
    int stock;
    int price;
    DishVariation variation;
    String name;

    public Dish(String name,DishTypes type, int stock, int price, DishVariation variation) {
        this.name = name;
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.variation = variation;
    }
    
}
