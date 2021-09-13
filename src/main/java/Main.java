/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the price of item 1:");
        Scanner input = new Scanner(System.in);
        float price1 = input.nextFloat();

        System.out.println("Enter the quantity of item 1:");
        Scanner input2 = new Scanner(System.in);
        int quantity1 = input2.nextInt();

        System.out.println("Enter the price of item 2:");
        Scanner input3 = new Scanner(System.in);
        float price2 = input3.nextFloat();

        System.out.println("Enter the quantity of item 2:");
        Scanner input4 = new Scanner(System.in);
        int quantity2 = input4.nextInt();

        System.out.println("Enter the price of item 3:");
        Scanner input5 = new Scanner(System.in);
        float price3 = input5.nextFloat();

        System.out.println("Enter the quantity of Item 3:");
        Scanner input6 = new Scanner(System.in);
        int quantity3 = input6.nextInt();

        float subtotal = price1*quantity1 + price2*quantity2 + price3*quantity3;
        double rate = 0.055;
        double tax = subtotal*rate;
        double total = subtotal + tax;

        System.out.println("Item list");
        System.out.printf("%d units of Item 1 at $%.2f \n", quantity1, price1);
        System.out.printf("%d units of Item 2 at $%.2f \n", quantity2, price2);
        System.out.printf("%d units of Item 3 at $%.2f \n", quantity3, price3);
        System.out.printf("Subtotal: $%.2f \n", subtotal);
        System.out.printf("Tax: $%.2f \n", tax);
        System.out.printf("Total: $%.2f \n", total);
    }
}