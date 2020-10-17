package basics;

import java.util.Scanner;

public class secondClassworkAug19Th {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the weather condition for day " + i);
        String weather = scanner.nextLine();

        switch (weather.toLowerCase()) {
            case "sunny":
                System.out.println("Show Sun Icon for Day " + i);
                break;
            case "rainy":
                System.out.println("Show Rain Icon for Day" + i);
                break;
            case "cloudy":
                System.out.println("Show cloud icon for Day" + i);
                break;
            case "windy":
                System.out.println("Show Wind Icon for Day" + i);
                break;
            default:
                System.out.println("Invalid Input; Try again");


        }






}}}


