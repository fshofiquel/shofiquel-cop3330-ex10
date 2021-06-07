package base;/*
 *  UCF COP3330 Summer 2021 Assignment <INSERTNUM> Solution
 *  Copyright 2021 Fazlur Shofiquel
 */

import java.util.Scanner;

public class App
{
    public static final double TAXRATE = 0.055;
    static Scanner oneIn = new Scanner(System.in);
    static Scanner twoIn = new Scanner(System.in);
    static Scanner threeIn = new Scanner(System.in);
    static Scanner item1In = new Scanner(System.in);
    static Scanner item2In = new Scanner(System.in);
    static Scanner item3In = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();
        int priceOne = 0;
        int quantOne = 0;
        int priceTwo = 0;
        int quantTwo = 0;
        int priceThree = 0;
        int quantThree = 0;
        int subTotal;
        double tax;
        double total;

        myApp.inputs(priceOne, priceTwo, priceThree, quantOne, quantTwo, quantThree);
        subTotal = myApp.calcSub(priceOne, priceTwo, priceThree, quantOne, quantTwo, quantThree);
        tax = myApp.calculate(subTotal);
        total = subTotal + tax;
        System.out.printf("Subtotal: %d", subTotal);
        System.out.printf("Tax: %.2f", tax);
        System.out.printf("Total: %.2f", total);
    }

    public void inputs(int priceOne, int priceTwo, int priceThree, int quantOne, int quantTwo, int quantThree)
    {
        System.out.print("Enter the price of item 1: ");
        priceOne = oneIn.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        quantOne = item1In.nextInt();

        System.out.print("Enter the price of item 2: ");
        priceTwo = twoIn.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        quantTwo = item2In.nextInt();

        System.out.print("Enter the price of item 3: ");
        priceThree = threeIn.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        quantThree = item3In.nextInt();
    }

    public int calcSub(int priceOne, int priceTwo, int priceThree, int quantOne, int quantTwo, int quantThree)
    {
        return (priceOne * quantOne) + (priceTwo * quantTwo) + (priceThree * quantThree);
    }


    public double calculate(int subTotal)
    {
        return subTotal * TAXRATE;
    }
}
