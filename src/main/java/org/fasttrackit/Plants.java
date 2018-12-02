package org.fasttrackit;

public class Plants {
    String name;              // apple or orange or cherry or banana.......
    String color;
    Farmer farmer;

    double production(double cost) {
        System.out.println("The cost of a dozen is 12 $");
        return cost * 12;    //  cost per $

    }
    void ProductionSeason(String season){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }
}
