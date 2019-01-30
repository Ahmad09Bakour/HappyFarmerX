package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Store extends Farmer{
    public List<Fruit> availableFruits = new ArrayList<>();
    public void addToAvailableFruits(){
        Fruit fruit1 = new Fruit();
        fruit1.setName("Apple");
        fruit1.setColor("Red");
        fruit1.setSweetnessLev(8.5);
        availableFruits.add(fruit1);

        Fruit fruit2 = new Fruit();
        fruit2.setName("Banana");
        fruit2.setColor("Yellow");
        fruit2.setSweetnessLev(6.5);
        availableFruits.add(fruit2);

        Fruit fruit3 = new Fruit();
        fruit3.setName("Orange");
        fruit3.setColor("Orange");
        fruit3.setSweetnessLev(5.5);
        availableFruits.add(fruit3);

        Fruit fruit4 = new Fruit();
        fruit4.setName("Cherry");
        fruit4.setColor("Maroon");
        fruit4.setSweetnessLev(9);
        availableFruits.add(fruit4);

        Fruit fruit5 = new Fruit();
        fruit5.setName("Peach");
        fruit5.setColor("Fiery");
        fruit5.setSweetnessLev(7.5);
        availableFruits.add(fruit5);
    }
    public List<Vegetables> availableVege = new ArrayList<>();

    public void addToAvailableVege(){
        Vegetables vegetables1 = new Vegetables();
        vegetables1.setName("Tomato");
        vegetables1.setColor("Red");
        vegetables1.setSweetnessLev(1.5);
        availableVege.add(vegetables1);

        Vegetables vegetables2 = new Vegetables();
        vegetables2.setName("Potato");
        vegetables2.setColor("Brown");
        vegetables2.setSweetnessLev(4.5);
        availableVege.add(vegetables2);

        Vegetables vegetables3 = new Vegetables();
        vegetables3.setName("Onion");
        vegetables3.setColor("White");
        vegetables3.setSweetnessLev(2);
        availableVege.add(vegetables3);

        Vegetables vegetables4 = new Vegetables();
        vegetables4.setName("Cucumber");
        vegetables4.setColor("Green");
        vegetables4.setSweetnessLev(5.5);
        availableVege.add(vegetables4);

        Vegetables vegetables5 = new Vegetables();
        vegetables5.setName("Spinach");
        vegetables5.setColor("Dark-Green");
        vegetables5.setSweetnessLev(3);
        availableVege.add(vegetables5);
    }


    double plantProd(String plantName, double cost, double amount, double sweetLev) {
        if (amount == 12) {
            System.out.println("The cost of a dozen of " + plantName + " is: ");
        }

        System.out.println("The cost of " + plantName + " is: ");
        return (cost * amount) + sweetLev;
    }
}
