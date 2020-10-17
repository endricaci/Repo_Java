package basics;

import java.util.Scanner;

public class homeWorkAug12Two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter item : ");
            String input = scanner.nextLine();

            if ("Milk".equalsIgnoreCase(input)) {
                System.out.println("Aisle Eight");
                break;
            } else if ("Eggs".equalsIgnoreCase(input)) {
                System.out.println("Aisle Eight");
            } else if ("French Feries".equalsIgnoreCase(input)) {
                System.out.println("Aisle Seven");
            } else if ("Candy".equalsIgnoreCase(input)) {
                System.out.println("Aisle Three");
            } else if ("Frozen Pizza".equalsIgnoreCase(input)) {
                System.out.println("Aisle Seven");
            } else if ("Donuts".equalsIgnoreCase(input)) {
                System.out.println("Aisle Eight");
            } else if ("Diapers".equalsIgnoreCase(input)) {
                System.out.println("Aisle One");
            } else if ("Apple".equalsIgnoreCase(input)) {
                System.out.println("Aisle Tow");
            } else if ("Orange".equalsIgnoreCase(input)) {
                System.out.println("Aisle Two");
            }

            System.out.println("input : " + input);
            System.out.println("-----------\n");
        }

        scanner.close();
    }

    }
