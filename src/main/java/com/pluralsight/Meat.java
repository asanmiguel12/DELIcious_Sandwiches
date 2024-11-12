package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class Meat implements PremiumToppings{
    private String name;
    private double price;
    static List<String> meats = List.of("Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon");

    public Meat(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Meat(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Scanner scanner = new Scanner(System.in);
    public String getMeat() {
        System.out.println("Please Enter The Type Of Meat You Want:" + "\n" +
                "\"Steak\", \"Ham\", \"Salami\", \"Roast Beef\", \"Chicken\", \"Bacon\"");

        String meatChoice = scanner.nextLine();
        int meatCount = 0;

        for (String meatName : meats) {
            if (meatChoice.equalsIgnoreCase(meatName)) {
                meatCount++;
                System.out.println("Meat: " + meatChoice + " " + "x" + meatCount);
                return "Meat: " + meatChoice + " " + "x" + meatCount;
            }

            }

        return null;
    }


    @Override
    public double isPremium() {
        return price = 1 ;

    }
}
