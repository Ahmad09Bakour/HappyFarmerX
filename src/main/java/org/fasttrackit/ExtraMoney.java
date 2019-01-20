package org.fasttrackit;

public class ExtraMoney extends Plants{
    @Override
    public double production(double cost, double tastinessLev) {
        System.out.println("The process of transferring EXTRA money is loading... ha ha ha");
        return cost * 12 * tastinessLev;
        //gaining more money by multiplying the cost of a dozen with the tastiness level instead of adding it to it
    }
    public void gainExMon(){
        System.out.println("Congrats, You're rich! ha ha ha");
        // method used to demonstrate
    }
}
