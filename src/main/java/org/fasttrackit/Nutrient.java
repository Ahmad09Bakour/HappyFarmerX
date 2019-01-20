package org.fasttrackit;

public class Nutrient {
    private String nameNu;
    private double amountKg;    // amount per kg
    private double amountLr;    // amount per litre
    public double expenses;

    /*
    public double getExpenses() { return expenses; }

    public void setExpenses(double expenses) { this.expenses = expenses; }
    */
    public String getNameNu() {
        return nameNu;
    }

    public void setNameNu(String nameNu) {
        this.nameNu = nameNu;
    }

    public double getAmountKg() {
        return amountKg;
    }

    public void setAmountKg(double amountKg) {
        this.amountKg = amountKg;
    }

    public double getAmountLr() {
        return amountLr;
    }

    public void setAmountLr(double amountLr) {
        this.amountLr = amountLr;
    }

}
