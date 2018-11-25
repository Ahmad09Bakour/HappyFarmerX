package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Trees tree1 = new Trees();
        tree1.age = 6;
        SweetFr sweetFr = new SweetFr(tree1);
        sweetFr.name = "Cherry";
        System.out.println(sweetFr.name);

        Trees tree2 = new Trees();
        tree2.age = 5;
        SweetFr sweetFr1 = new SweetFr(tree2);
        sweetFr1.name = "Watermelon";
        sweetFr1.color = "Green";
        System.out.println(sweetFr1.name);


        Trees tree3 = new Trees();
        tree3.age = 5;
        SweetFr sweetFr2 = new SweetFr(tree3);
        sweetFr2.name = "Peach";
        sweetFr2.color = "Red";
        System.out.println(sweetFr2.name);
        double costsweetFr2 = sweetFr2.production(2);
        System.out.println("The cost of 2 dozens of Peaches is: " + costsweetFr2 + " $");

        Farmer farmer1 = new Farmer();
        farmer1.nameFa = "Mark";
        farmer1.ageFa = 37;
        farmer1.nationality = "Spanish";
        sweetFr2.farmer = farmer1;
        System.out.println(sweetFr2.name + " trees will be looked after by: " + farmer1.nameFa);
    }
}
