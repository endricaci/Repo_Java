package basics;

import javax.swing.*;

public class NesterIfs {
    public static void main(String[] args) {

        int temperature = 74;
        String weatherCondition2 = "hot";

        if (temperature < 32) {
            if (weatherCondition2.equals("snow")) {
                System.out.println("please wear boots cause it's snowing");
            } else {
                System.out.println("It's not snowing, it's only cold outside");
            }
            System.out.println("It's freezing outside");
        } else if (temperature >= 45 && temperature < 75) {
            System.out.println("Dont wear a jacket cause it's warm outside");

            if (weatherCondition2.equals("hot")) {
                System.out.println("Please take a water bottle with you");
            } else if (weatherCondition2.equals("rain")) {
                System.out.println("Please take an umbrella cause it'sraining");
            } else {
                System.out.println("Wahtever");
            }
        } else {
            System.out.println("Invalid weather condition");
        }
        System.out.println("I run after the if statement");


    }
}