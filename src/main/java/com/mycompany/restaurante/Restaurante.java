

package com.mycompany.restaurante;

import com.mycompany.restaurante.foods.Dish;
import com.mycompany.restaurante.people.User;
import com.mycompany.restaurante.values.UserTypes;
import com.mycompany.restaurante.values.DishVariation;
import com.mycompany.restaurante.values.DishTypes;
import java.awt.Menu;

/**
 *
 * @author SCIS2PC17
 */
public class Restaurante {

    public static void main(String[] args) {
        User student = new User(UserTypes.STUDENT,"Fulanito","1234");
        student.sell();
        
    Menu menu = new Menu();
      
    Dish dish1 = new Dish("huevos pericos", DishTypes.BREAKFAST, 20, 2400, DishVariation.OPTION1);
    Dish dish2 = new Dish("caldo con arepa", DishTypes.BREAKFAST, 20, 2400, DishVariation.OPTION2);
    Dish dish3 = new Dish("aRROZ CHINO", DishTypes.BREAKFAST, 20, 2400, DishVariation.OPTION3);
    
    menu.addDish(dish1);
    menu.addDish(dish2);
    menu.addDish(dish3);
    
    
    }
}
