package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Farmer {
    private String nameFa;
    private double ageFa;
    public int budget;
    private String namePr;
    private int cost;
    private int valuesBudget;

    @Override
    public String toString() {
        return "Farmer{" +
                "namePr='" + namePr + '\'' +
                ", cost=" + cost +
                '}';
    }

    public String getNamePr() {
        return namePr;
    }

    public void setNamePr(String namePr) {
        this.namePr = namePr;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getValuesBudget() {
        return valuesBudget;
    }

    public void setValuesBudget(int valuesBudget) {
        this.valuesBudget = valuesBudget;
    }

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


    private List<Farmer> seedsList = new ArrayList<>();

    public void getFromSeedsList() {
        Farmer seedsKind1 = new Farmer();
        seedsKind1.setNamePr("Low Quality Seeds");
        seedsKind1.setCost(1500);
        seedsList.add(seedsKind1);

        Farmer seedsKind2 = new Farmer();
        seedsKind2.setNamePr("Medium Quality Seeds");
        seedsKind2.setCost(1700);
        seedsList.add(seedsKind2);

        Farmer seedsKind3 = new Farmer();
        seedsKind3.setNamePr("High Quality Seeds");
        seedsKind3.setCost(2000);
        seedsList.add(seedsKind3);
    }

    private List<Farmer> nutrientsList = new ArrayList<>();

    public void getFromNutrientList() {
        Farmer nutrientKind1 = new Farmer();
        nutrientKind1.setNamePr("Low Quality Nutrients");
        nutrientKind1.setCost(200);
        nutrientsList.add(nutrientKind1);

        Farmer nutrientKind2 = new Farmer();
        nutrientKind2.setNamePr("Medium Quality Nutrients");
        nutrientKind2.setCost(300);
        nutrientsList.add(nutrientKind2);

        Farmer nutrientKind3 = new Farmer();
        nutrientKind3.setNamePr("High Quality Nutrients");
        nutrientKind3.setCost(400);
        nutrientsList.add(nutrientKind3);
    }

    private List<Farmer> orgMattersList = new ArrayList<>();

    public void getFromOrgMattList() {
        Farmer orgMatKind1 = new Farmer();
        orgMatKind1.setNamePr("Low Quality Organic Matters");
        orgMatKind1.setCost(100);
        orgMattersList.add(orgMatKind1);

        Farmer orgMatKind2 = new Farmer();
        orgMatKind2.setNamePr("Medium Quality Organic Matters");
        orgMatKind2.setCost(150);
        orgMattersList.add(orgMatKind2);

        Farmer orgMatKind3 = new Farmer();
        orgMatKind3.setNamePr("High Quality Organic Matters");
        orgMatKind3.setCost(200);
        orgMattersList.add(orgMatKind3);
    }

    private List<Farmer> doctorList = new ArrayList<>();

    public void getFromDoctorList() {
        Farmer doctorKind1 = new Farmer();
        doctorKind1.setNamePr("Low Quality Doctor");
        doctorKind1.setCost(700);
        doctorList.add(doctorKind1);

        Farmer doctorKind2 = new Farmer();
        doctorKind2.setNamePr("Medium Quality Doctor");
        doctorKind2.setCost(800);
        doctorList.add(doctorKind2);

        Farmer doctorKind3 = new Farmer();
        doctorKind3.setNamePr("High Quality Doctor");
        doctorKind3.setCost(900);
        doctorList.add(doctorKind3);
    }

    public void chooseQualitySeeds() {
        System.out.println("Please choose the price of the Seeds that you want cultivate.." + seedsList);
        Farmer farmer = new Farmer();
        farmer.setBudget(Farmer.Amount_Of_Monay_InBudget);
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (Farmer seed : seedsList) {
            if (input == 1500) {
                System.out.println("You have bought Seeds which are low quality!");
                farmer.setBudget(farmer.getBudget() - seed.getCost());
                System.out.println("Now you have in your budget: $" + getBudget());
                break;
            }
        }
        for (Farmer seed : seedsList) {
            if (input == 1700) {
                System.out.println("You have bought Seeds which are medium quality!");
                System.out.println("Now you have in your budget");
                farmer.setBudget(farmer.getBudget() - seed.getCost());
                break;
            }
        }
        for (Farmer seed : seedsList) {
            if (input == 2000) {
                System.out.println("You have bought Seeds which are high quality!");
                System.out.println("Now you have in your budget");
                farmer.setBudget(farmer.getBudget() - seed.getCost());
                break;
            }
        }
    }

    public void chooseQualityNutrients() {
        System.out.println("Please choose the price of the Nutrients that you want to add to your plants.." + nutrientsList);
        Farmer farmer = new Farmer();
        Scanner scannerf1 = new Scanner(System.in);
        int inputf1 = scannerf1.nextInt();
        switch (inputf1) {
            case 200:
                System.out.println("You have bought Nutrients which are low quality!");
                System.out.println(farmer.getBudget() - 200);
                System.out.println("This is what remains in your budget now! ^^");
                break;
            case 300:
                System.out.println("You have bought Nutrients which are medium quality!");
                System.out.println(farmer.getBudget() - 300);
                System.out.println("This is what remains in your budget now! ^^");
                break;
            case 400:
                System.out.println("You have bought Nutrients which are high quality!");
                System.out.println(farmer.getBudget() - 400);
                System.out.println("This is what remains in your budget now! ^^");
                break;
            default:
                System.out.println("Invalid value. Please type the right price!...");
                chooseQualityNutrients();
        }
    }

    public void chooseQualityOrgMat() {
        System.out.println("Please choose the price of the Organic Matters that you want to add to your plants.." + orgMattersList);
        Farmer farmer = new Farmer();
        Scanner scannerf2 = new Scanner(System.in);
        int inputf2 = scannerf2.nextInt();
        switch (inputf2) {
            case 100:
                System.out.println("You have bought Organic Matters which are low quality!");
                System.out.println(farmer.getBudget() - 100);
                System.out.println("This is what remains in your budget now! ^^");
                break;
            case 150:
                System.out.println("You have bought Organic Matters which are medium quality!");
                System.out.println(farmer.getBudget() - 150);
                System.out.println("This is what remains in your budget now! ^^");
                break;
            case 200:
                System.out.println("You have bought Organic Matters which are high quality!");
                System.out.println(farmer.getBudget() - 200);
                System.out.println("This is what remains in your budget now! ^^");
                break;
            default:
                System.out.println("Invalid value. Please type the right price!...");
                chooseQualityOrgMat();
        }
    }

    public void chooseQualityDoctor() {
        System.out.println("Please choose the price that you want to pay to the Doctor to treat your plants.." + doctorList);
        Farmer farmer = new Farmer();
        Scanner scannerf3 = new Scanner(System.in);
        int inputf3 = scannerf3.nextInt();
        switch (inputf3) {
            case 700:
                System.out.println("You have asked such a good Doctor!");
                System.out.println(farmer.getBudget() - 700);
                System.out.println("This is what remains in your budget now! ^^");
                break;
            case 800:
                System.out.println("You have asked such an amazing Doctor!");
                System.out.println(farmer.getBudget() - 800);
                System.out.println("This is what remains in your budget now! ^^");
                break;
            case 900:
                System.out.println("You have asked such a professional Doctor!");
                System.out.println(farmer.getBudget() - 900);
                System.out.println("This is what remains in your budget now! ^^");
                break;
            default:
                System.out.println("Invalid value. Please type the right price!...");
                chooseQualityDoctor();
        }
    }


    private List<Farmer> potentialBudgetLowQuality = new ArrayList<>();

    public void setPotentialBudgetLowQuality() {
        Farmer value1 = new Farmer(); // potential values of the amount of money that the user might have in his budget if he bought :
        value1.setValuesBudget(1000); // low quality seeds + H.Q doctor + H.Q nutrients + H.Q OrgMat then should remain in budget: 1000
        potentialBudgetLowQuality.add(value1);

        Farmer value2 = new Farmer();
        value2.setValuesBudget(1050); // low quality seeds + H.Q doctor + H.Q nutrients + Mid.Q. OrgMat then should remain in budget 1050
        potentialBudgetLowQuality.add(value2);

        Farmer value3 = new Farmer();
        value3.setValuesBudget(1100);
        potentialBudgetLowQuality.add(value3);

        Farmer value4 = new Farmer();
        value4.setValuesBudget(1150);
        potentialBudgetLowQuality.add(value4);

        Farmer value5 = new Farmer();
        value5.setValuesBudget(1200);
        potentialBudgetLowQuality.add(value5);

        Farmer value6 = new Farmer();
        value6.setValuesBudget(1250);
        potentialBudgetLowQuality.add(value6);

        Farmer value7 = new Farmer();
        value7.setValuesBudget(1300);
        potentialBudgetLowQuality.add(value7);

        Farmer value8 = new Farmer();
        value8.setValuesBudget(1350);
        potentialBudgetLowQuality.add(value8);

        Farmer value9 = new Farmer();
        value9.setValuesBudget(1400);
        potentialBudgetLowQuality.add(value9);

        Farmer value10 = new Farmer();
        value10.setValuesBudget(1450);
        potentialBudgetLowQuality.add(value10);

        Farmer value11 = new Farmer();
        value11.setValuesBudget(1500); // low quality seeds + low quality doctor + L.Q nutrients + L.Q OrgMat then should remain in budget 1500....
        potentialBudgetLowQuality.add(value11);
    }

    private List<Farmer> potentialBudgetMidQuality = new ArrayList<>();

    public void setPotentialBudgetMidQuality() {
        Farmer value1 = new Farmer(); // potential values of the amount of money that the user might have in his budget if he bought :
        value1.setValuesBudget(800); // Mid quality seeds + H.Q doctor + H.Q nutrients + H.Q OrgMat then should remain in budget: 800
        potentialBudgetMidQuality.add(value1);

        Farmer value2 = new Farmer();
        value2.setValuesBudget(850); // Mid quality seeds + H.Q doctor + H.Q nutrients + Mid.Q. OrgMat then should remain in budget 850
        potentialBudgetMidQuality.add(value2);

        Farmer value3 = new Farmer();
        value3.setValuesBudget(900);
        potentialBudgetMidQuality.add(value3);

        Farmer value4 = new Farmer();
        value4.setValuesBudget(950);
        potentialBudgetMidQuality.add(value4);

        Farmer value5 = new Farmer();
        value5.setValuesBudget(1000);
        potentialBudgetMidQuality.add(value5);

        Farmer value6 = new Farmer();
        value6.setValuesBudget(1050);
        potentialBudgetMidQuality.add(value6);

        Farmer value7 = new Farmer();
        value7.setValuesBudget(1100);
        potentialBudgetMidQuality.add(value7);

        Farmer value8 = new Farmer();
        value8.setValuesBudget(1150);
        potentialBudgetMidQuality.add(value8);

        Farmer value9 = new Farmer();
        value9.setValuesBudget(1200);
        potentialBudgetMidQuality.add(value9);

        Farmer value10 = new Farmer();
        value10.setValuesBudget(1250);
        potentialBudgetMidQuality.add(value10);

        Farmer value11 = new Farmer();
        value11.setValuesBudget(1300); // Mid quality seeds + L.Q doctor + L.Q nutrients + L.Q OrgMat then should remain in budget 1300....
        potentialBudgetMidQuality.add(value11);
    }

    private List<Farmer> potentialBudgetHighQuality = new ArrayList<>();

    public void setPotentialBudgetHighQuality() {
        Farmer value1 = new Farmer();  // potential values of the amount of money that the user might have in his budget if he bought :
        value1.setValuesBudget(500);  // high quality seeds + H.Q doctor + H.Q nutrients + H.Q OrgMat then should remain in budget: 500
        potentialBudgetHighQuality.add(value1);

        Farmer value2 = new Farmer();
        value2.setValuesBudget(550);  // high quality seeds + H.Q doctor + H.Q nutrients + Mid.Q. OrgMat then should remain in budget 550
        potentialBudgetHighQuality.add(value2);

        Farmer value3 = new Farmer();
        value3.setValuesBudget(600);
        potentialBudgetHighQuality.add(value3);

        Farmer value4 = new Farmer();
        value4.setValuesBudget(650);
        potentialBudgetHighQuality.add(value4);

        Farmer value5 = new Farmer();
        value5.setValuesBudget(700);
        potentialBudgetHighQuality.add(value5);

        Farmer value6 = new Farmer();
        value6.setValuesBudget(750);
        potentialBudgetHighQuality.add(value6);

        Farmer value7 = new Farmer();
        value7.setValuesBudget(800);
        potentialBudgetHighQuality.add(value7);

        Farmer value8 = new Farmer();
        value8.setValuesBudget(850);
        potentialBudgetHighQuality.add(value8);

        Farmer value9 = new Farmer();
        value9.setValuesBudget(900);
        potentialBudgetHighQuality.add(value9);

        Farmer value10 = new Farmer();
        value10.setValuesBudget(950);
        potentialBudgetHighQuality.add(value10);

        Farmer value11 = new Farmer();
        value11.setValuesBudget(1000); // high quality seeds + low quality doctor + L.Q nutrients + L.Q OrgMat then should remain in budget 1000....
        potentialBudgetHighQuality.add(value11);
    }

    public void sellingTheCrop() {

        // according to how much remain in the budget we can decide how much will the user get from selling his crop
        // for the beginning of the my app, I will put just three values to be added to the budget as profit for the user
        int a = 4500;  // the profit that should be added to the budget of selling the crop(high quality seeds, doctor, nutrients and OrgMatt
        int b = 3000;  // the profit that should be added to the budget of selling the crop(medium quality seeds, doctor, nutrients and OrgMatt
        int c = 2000;  // the profit that should be added to the budget of selling the crop(low quality seeds, doctor, nutrients and OrgMatt
        System.out.println("You're a great farmer! Now your crop is ready to be sold!");
        Farmer farmer = new Farmer();
        setPotentialBudgetLowQuality();
        setPotentialBudgetMidQuality();
        setPotentialBudgetHighQuality();
        int i = farmer.getBudget();
        if (potentialBudgetLowQuality.contains(i)) {
            System.out.println("Your crop is low quality.... You will get some money!");
            farmer.setBudget(budget + c);
            System.out.println("You sold your crop for 2000 $, Congratulation!");
            System.out.println("Now you have in your budget: " + getBudget());

        } else if (potentialBudgetMidQuality.contains(i)) {

            System.out.println("WOW your crop is medium quality.... You will get a good amount of money!");
            farmer.budget += b;
            System.out.println("You sold your crop for 3000 $, Congratulation!");
            System.out.println("Now you have in your budget: " + budget);
        } else{
            System.out.println("WOW your crop is high quality.... You will get a lot of money!");
            farmer.budget += a;
            System.out.println("You sold your crop for 4500 $, Congratulation!");
            System.out.println("Now you have in your budget: " + budget);
        }
    }
}