package class_2020;

import java.util.Scanner;

public class lab10162020 {

    public static void main(String[] args) {
//        System.out.println("Please give your input");
//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        System.out.println("Printing... "  + input);

        String [] weatherCon = {"Sunny", "Rainy", "Windy", "Cloudy", "Sunny"};
        for (int i = 0; i <weatherCon.length; i++) {
            String input = weatherCon[i];
            switch (input) {
                case "Sunny":
                    System.out.println("Show Sun Icon");
                    break;
                case "Rainy":
                    System.out.println("Show Rain Icon");
                    break;
                case "Cloudy":
                    System.out.println("Show Cloud Icon");
                    break;
                case "Windy":
                    System.out.println("Show Windy Icon");
                    break;
            }
        }
    }
}
