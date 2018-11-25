package org.fasttrackit;

public class Plants {
    String name;              // apple or orange or cherry or banana.......
    String color;
    Farmer farmer;

    double production(double cost) {
        System.out.println("The cost of a dozen is 12 $");
        return cost * 12;    //  cost per $

    }
    void productionSeason(String season){

    }
}
