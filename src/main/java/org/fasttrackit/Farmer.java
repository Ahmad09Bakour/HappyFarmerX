package org.fasttrackit;

import java.util.List;

public class Farmer {
    private String nameFa;
    private double ageFa;
    public int budget;    // per $
    private List<BuyingClass> availableProducts;

    public static final int Amount_Of_Monay_InBudget = 4000;

    public String getNameFa() {
        return nameFa;
    }

    public void setNameFa(String nameFa) {
        this.nameFa = nameFa;
    }

    public double getAgeFa() {
        return ageFa;
    }

    public void setAgeFa(double ageFa) {
        this.ageFa = ageFa;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void buyProduct(BuyingClass product) {
        budget -= product.getCost();
        availableProducts.add(product);
    }
}
