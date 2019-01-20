package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BuyingClass {

    private int cost;
    private String nameco;

    public String getNameco() {
        return nameco;
    }

    public void setNameco(String nameco) {
        this.nameco = nameco;
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<BuyingClass> seedsQuality = new ArrayList<>();
    public void addToSeedsQuality(){
        BuyingClass seedsKind1 = new BuyingClass();
        seedsKind1.setNameco("Low Quality Seeds");
        seedsKind1.setCost(1500);
        seedsQuality.add(seedsKind1);

        BuyingClass seedsKind2 = new BuyingClass();
        seedsKind2.setNameco("Medium Quality Seeds");
        seedsKind2.setCost(1700);
        seedsQuality.add(seedsKind2);

        BuyingClass seedsKind3 = new BuyingClass();
        seedsKind3.setNameco("High Quality Seeds");
        seedsKind3.setCost(2000);
        seedsQuality.add(seedsKind3);
    }

    public List<BuyingClass> nutrientQuality = new ArrayList<>();
    public void addToNutrientQuality(){
        BuyingClass nutrientKind1 = new BuyingClass();
        nutrientKind1.setNameco("Low Quality Nutrients");
        nutrientKind1.setCost(200);
        nutrientQuality.add(nutrientKind1);

        BuyingClass nutrientKind2 = new BuyingClass();
        nutrientKind2.setNameco("Medium Quality Nutrients");
        nutrientKind2.setCost(300);
        nutrientQuality.add(nutrientKind2);

        BuyingClass nutrientKind3 = new BuyingClass();
        nutrientKind3.setNameco("High Quality Nutrients");
        nutrientKind3.setCost(400);
        nutrientQuality.add(nutrientKind3);
    }

    public List<BuyingClass> orgMatQuality = new ArrayList<>();
    public void addToOrgMatQuality(){
        BuyingClass orgMatKind1 = new BuyingClass();
        orgMatKind1.setNameco("Low Quality Organic Matters");
        orgMatKind1.setCost(100);
        orgMatQuality.add(orgMatKind1);

        BuyingClass orgMatKind2 = new BuyingClass();
        orgMatKind2.setNameco("Medium Quality Organic Matters");
        orgMatKind2.setCost(150);
        orgMatQuality.add(orgMatKind2);

        BuyingClass orgMatKind3 = new BuyingClass();
        orgMatKind3.setNameco("High Quality Organic Matters");
        orgMatKind3.setCost(200);
        orgMatQuality.add(orgMatKind3);
    }

    public List<BuyingClass> doctorQuality = new ArrayList<>();
    public void addToDoctorQuality(){
        BuyingClass doctorKind1 = new BuyingClass();
        doctorKind1.setNameco("Low Quality Doctor");
        doctorKind1.setCost(700);
        doctorQuality.add(doctorKind1);

        BuyingClass doctorKind2 = new BuyingClass();
        doctorKind2.setNameco("Medium Quality Doctor");
        doctorKind2.setCost(800);
        doctorQuality.add(doctorKind2);

        BuyingClass doctorKind3 = new BuyingClass();
        doctorKind3.setNameco("High Quality Doctor");
        doctorKind3.setCost(900);
        doctorQuality.add(doctorKind3);
    }


    public void chooseQualitySeeds() {
        System.out.println("Please choose the price of the Seeds that you want cultivate.." + seedsQuality);
        Farmer farmer = new Farmer();
        int i = farmer.getBudget();
        int f = 1500;
        int z = i - f;
        Scanner scannerf = new Scanner(System.in);
        int inputf = scannerf.nextInt();
        switch (inputf){
            case 1500:
                System.out.println("You have bought Seeds which are low quality!");
                Farmer farmer1 = new Farmer();
                farmer1.getBudget() -= seedsQuality.get(getCost(1500));
                farmer1.getBudget() -= seedsQuality.get(seedsKind1.getCost);
                // I don't know how to call the cost of the variable "seedsKind1" to reduce the budget with cost of that kind
                // I don't know how to call a variable fom a list ???????
                System.out.println("Now you have in your budget: $" + z);
                break;
            case 1700:
                System.out.println("You have bought Seeds which are medium quality!");
                System.out.println(farmer.getBudget() - 1700);
                System.out.println("This is what remains in your budget now! ^^");
                break;
            case 2000:
                System.out.println("You have bought Seeds which are high quality!");
                System.out.println(farmer.getBudget() - 2000);
                System.out.println("This is what remains in your budget now! ^^");
                break;
                default:
                    System.out.println("Invalid value. Please type the right price!...");
                    chooseQualitySeeds();
        }
    }
    public void chooseQualityNutrients() {
        addToNutrientQuality();
        System.out.println("Please choose the price of the Nutrients that you want to add to your plants.." + nutrientQuality);
        Farmer farmer = new Farmer();
        Scanner scannerf1 = new Scanner(System.in);
        int inputf1 = scannerf1.nextInt();
        switch (inputf1){
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
    public void chooseQualityOrgMat(){
        addToOrgMatQuality();
        System.out.println("Please choose the price of the Organic Matters that you want to add to your plants.." + nutrientQuality);
        Farmer farmer = new Farmer();
        Scanner scannerf2 = new Scanner(System.in);
        int inputf2 = scannerf2.nextInt();
        switch (inputf2){
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
    public void chooseQualityDoctor(){
        addToDoctorQuality();
        System.out.println("Please choose the price that you want to pay to the Doctor to treat your plants.." + nutrientQuality);
        Farmer farmer = new Farmer();
        Scanner scannerf3 = new Scanner(System.in);
        int inputf3 = scannerf3.nextInt();
        switch (inputf3){
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
}
