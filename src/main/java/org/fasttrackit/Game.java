package org.fasttrackit;

import java.util.Scanner;

public class Game extends Store {
    private Farmer[] farmers = new Farmer[15];


    public void addFarmers(int index) {
        Farmer farmer = new Farmer();
        Scanner scannerxx = new Scanner(System.in);
        String inputxx = scannerxx.nextLine();
        farmer.setNameFa(inputxx);
        farmers[index] = farmer;
    }

    public void startGame() {
        System.out.println("Please write your name then press Enter ...");
        addFarmers(0);
//        addFarmers(1);
//        addFarmers(2);
//        addFarmers(3);
//        addFarmers(4);
//        addFarmers(5);
        welcomeMessage();

        addToAvailableFruits();
        addToAvailableVege();
        getFromSeedsList();
        getFromNutrientList();
        getFromOrgMattList();
        getFromDoctorList();


        int input = selectProductNums();


        selectKindOfPlant();
        gettingKindOfSeeds();
        //gettingNutrientsAndOrgMat();
        //gettingDoctorHelp();

    }

    private void welcomeMessage() {
        for (int i = 0; i < farmers.length; i++) {
            if (farmers[i] != null) {
                System.out.println("You're Welcome, " + farmers[i].getNameFa() + "! Let's start building your farm!");
            }
        }
    }

    private int selectProductNums() {
        System.out.println("Please enter the number of plants that you want to cultivate...");
        Scanner scanner1 = new Scanner(System.in);
        int input1 = scanner1.nextInt();
        System.out.println("You chose: " + input1 + " Plants to cultivate..");
        return input1;
    }

    private void selectKindOfPlant(){
        System.out.println("Please choose the type of Plants that you want to cultivate: 'Fruits' OR 'Vegetables'...");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("Fruits")) {
            fruitChosen();
        }
        else if (input.equals("Vegetables")) {
            vegetablesChosen();
        }
        else {
            System.out.println("Invalid value. Please type the Name of the Fruit and try again...");
            selectKindOfPlant();
        }
    }

    private void fruitChosen() {

            System.out.println("Please choose the Name of Fruit that you want to cultivate from the following list... " + availableFruits);
            Scanner scanner2 = new Scanner(System.in);
            String input2 = scanner2.nextLine();
            switch (input2) {
                case "Apple":
                    System.out.println("You chose 'Apple'! Good choice!..");
                    break;
                case "Banana":
                    System.out.println("You chose 'Banana'! Good choice!..");
                    break;
                case "Orange":
                    System.out.println("You chose 'Orange'! Good choice!..");
                    break;
                case "Cherry":
                    System.out.println("You chose 'Cherry'! Good choice!..");
                    break;
                case "Peach":
                    System.out.println("You chose 'Peach'! Good choice!..");
                    break;
                default:
                    System.out.println("Invalid value. Please type the Name of the Fruit and try again...");
                    fruitChosen();
            }
    }

    public void vegetablesChosen() {
             System.out.println("Please choose the kind of Vegetable that you want to cultivate from the following list... " + availableVege);
             Scanner scanner3 = new Scanner(System.in);
             String input3 = scanner3.nextLine();
             switch (input3) {
                 case "Tomato":
                     System.out.println("You chose 'Tomato'! Good choice!..");
                     break;
                 case "Potato":
                     System.out.println("You chose 'Potato'! Good choice!..");
                     break;
                 case "Onion":
                     System.out.println("You chose 'Onion'! Good choice!..");
                     break;
                 case "Cucumber":
                     System.out.println("You chose 'Cucumber'! Good choice!..");
                     break;
                 case "Spinach":
                     System.out.println("You chose 'Spinach'! Good choice!..");
                     break;
                 default:
                     System.out.println("Invalid value. Please type the Name of the Vegetable and try again..");
                     vegetablesChosen();
             }
    }

    public void gettingKindOfSeeds() {
        System.out.println("You have in your budget " + Farmer.Amount_Of_Monay_InBudget + " $, which you should use to build your farm!");
        Farmer farmer = new Farmer();
        farmer.setBudget(Farmer.Amount_Of_Monay_InBudget);
        System.out.println("First you will need to buy Seeds to start cultivating!.. yaaaay ^_^");
        chooseQualitySeeds();
    }

    public void gettingNutrientsAndOrgMat(){
        System.out.println("Now you need to get some Nutrients to help your plants grow faster...");
        chooseQualityNutrients();
        System.out.println("You did amazing so far!... Now you need to get some Organic Matters to improve the quality of your plants..");
        chooseQualityNutrients();
    }
    public void gettingDoctorHelp(){
        System.out.println("WOW!!! You such an amazing farmer! You're doing so well!!" );
        System.out.println("Hold on!... Now you need to contact a Doctor to check up on your plants quickly..");
        chooseQualityDoctor();
    }
}
