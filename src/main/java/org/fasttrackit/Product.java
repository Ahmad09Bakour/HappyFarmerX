package org.fasttrackit;

public class Product {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void sellingProducts(){
        int x[] = {500, 550, 600, 650, 700, 750, 800, 850, 900, 950, 1000};
        // potential values of the amount of money that the user might have in his budget if he bought :
        // high quality seeds + H.Q doctor + H.Q nutrients + H.Q OrgMat then should remain in budget: 500
        // high quality seeds + H.Q doctor + H.Q nutrients + Mid.Q. OrgMat then should remain in budget 550
        // high quality seeds + low quality doctor + L.Q nutrients + L.Q OrgMat then should remain in budget 1000....
        int y[] = {800, 850, 900, 950, 1000, 1050, 1100, 1150, 1200, 1250, 1300};
        // potential values of the amount of money that the user might have in his budget if he bought :
        // Mid quality seeds + H.Q doctor + H.Q nutrients + H.Q OrgMat then should remain in budget: 800
        // Mid quality seeds + H.Q doctor + H.Q nutrients + Mid.Q. OrgMat then should remain in budget 850
        // Mid quality seeds + L.Q doctor + L.Q nutrients + L.Q OrgMat then should remain in budget 1300....
        int z[] = {1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500};
        // potential values of the amount of money that the user might have in his budget if he bought :
        // low quality seeds + H.Q doctor + H.Q nutrients + H.Q OrgMat then should remain in budget: 1000
        // low quality seeds + H.Q doctor + H.Q nutrients + Mid.Q. OrgMat then should remain in budget 1050
        // low quality seeds + low quality doctor + L.Q nutrients + L.Q OrgMat then should remain in budget 1500....

        // according to how much remain in the budget we can decide how much will the user get from selling his crop
        // for the beginning of the my app, I will put just three values to be added to the budget as profit for the user
        int a = 4500;  // the profit that should be added to the budget of selling the crop(high quality seeds, doctor, nutrients and OrgMatt
        int b = 3000;  // the profit that should be added to the budget of selling the crop(medium quality seeds, doctor, nutrients and OrgMatt
        int c = 2000;  // the profit that should be added to the budget of selling the crop(low quality seeds, doctor, nutrients and OrgMatt
        System.out.println("You're a great farmer! Now your crop is ready to be sold!");
        Farmer farmer = new Farmer();
        int i = farmer.getBudget();
        switch (i) {
            case i = x[]:  // I didn't know how check if the budget contains money like what is mentioned in the array x
                System.out.println("WOW your crop is high quality.... You will get a lot of money!");
                farmer.budget += a;
                System.out.println("You sold your crop for 4500 $, Congratulation!");
                System.out.println("Now you have in your budget: " + farmer.getBudget());
                break;
            case i = y[]:  // I didn't know how to check if the budget contains money like what is mentioned in the array y
                System.out.println("WOW your crop is medium quality.... You will get a good amount of money!");
                farmer.budget += b;
                System.out.println("You sold your crop for 3000 $, Congratulation!");
                System.out.println("Now you have in your budget: " + farmer.getBudget());
                break;
            case i = z[]: // I didn't know how to check if the budget contains money like what is mentioned in the array z
                System.out.println("Your crop is low quality.... You will get some money!");
                farmer.budget += c;
                System.out.println("You sold your crop for 2000 $, Congratulation!");
                System.out.println("Now you have in your budget: " + farmer.getBudget());
                break;
        }
    }
}
