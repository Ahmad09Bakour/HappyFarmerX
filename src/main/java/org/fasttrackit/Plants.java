package org.fasttrackit;

public class Plants {
    private String name;              // apple or orange or cherry or banana.......
    private String color;
    private double sweetnessLev;



    double production(double cost, double tastinessLev) {
        System.out.println("The cost of a dozen is 12 $");
        return cost * 12 + tastinessLev;    //  cost per $, tastiness level of the fruit, ...
    }
    double production(double cost) {
        System.out.println("The cost of a dozen is 12 $, Plant's sweetness is unknown!");
        return  cost *12 + 0;     // overloading the cost method, when the plant is vegetable, then sweetness is zero.
    }

    void ProductionSeason(String season){

    }
    public double getSweetnessLev() {
        return sweetnessLev;
    }

    public void setSweetnessLev(double sweetnessLev) {
        this.sweetnessLev = sweetnessLev;
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

    @Override
    public String toString() {
        return "Plants{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", sweetnessLev=" + sweetnessLev +
                '}';
    }
}
