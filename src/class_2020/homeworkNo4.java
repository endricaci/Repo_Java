package class_2020;

public class homeworkNo4 {

    public static void main(String[] args) {

        // Subject - Homework 4
        /**
         * Create variable to store student-score and total-possible-score;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        double studentScore = 150;
        double maxScore = 160;

        double percentage = (studentScore / maxScore) * 100;

        if (percentage >= 91 && percentage <= 100) {
            System.out.println("Grade A");
        } else if (percentage >= 81 && percentage <= 90) {
            System.out.println("Grade B");
        } else if (percentage >= 71 && percentage <= 80) {
            System.out.println("Grade C");
        } else if (percentage >= 61 && percentage <= 70) {
            System.out.println("Grade D");
        } else {
            System.out.println("Invalid Input");
        }



        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */

        int number = 40;

        if (number%3==0) {
            System.out.println("divisible by 3");
        } else if (number%5==0) {
            System.out.println("divisible by 5");
        } else if (number%3==0 && number%5==0) {
            System.out.println("divisible by both");
        } else {
            System.out.println(number);
        }

        /**
         * Checking car mode (P, D, N, R)   // switch
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "put car in car wash"
         * if car mode is R you can "revere the car"
         */

        char carMode = 'P';
        String driveType = "Snow";

        switch (carMode) {
            case 'P':
                System.out.println("you can park the car");
                break;
            case 'D':
                if (driveType.equals("Snow")) {
                    System.out.println("You are on Snow Mode");
                } else if (driveType.equals("Sport")) {
                    System.out.println("You are on Sport mode");
                } else if (driveType.equals("Eco")) {
                    System.out.println("You are on Eco mode");
                }
                break;
            case 'N':
                System.out.println("Put car in Car Wash");
                break;
            case 'R':
                System.out.println("Reverse the car");
                break;
            default:
                System.out.println("invalid command");
        }


    }
    }

