package org.fasttrackit;

public class Nutrient {
    private String nameNu;
    private double amountkg;    // amount per kg
    double amountlr;    // amount per litre

    public String getNameNu() {
        return nameNu;
    }

    public void setNameNu(String nameNu) {
        this.nameNu = nameNu;
    }

    public double getAmountkg() {
        return amountkg;
    }

    public void setAmountkg(double amountkg) {
        this.amountkg = amountkg;
    }

    public double getAmountlr() {
        return amountlr;
    }

    public void setAmountlr(double amountlr) {
        this.amountlr = amountlr;
    }

}
