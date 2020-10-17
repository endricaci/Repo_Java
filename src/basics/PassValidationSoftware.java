package basics;

import java.util.Scanner;

public class PassValidationSoftware {
    public static void main(String[] args) {


        //Build a password validation software
        //Allow user to have max of 10 invalid tries (take input from consoole)
        //Once user reahces mis try, prompt user with below error message
        //Your account will be locked for 15 minutes due to maximum tries in password

        //Instance of scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username");
        System.out.println("Please enter your password");
        String actualUsername = scanner.nextLine();
        String actualPassword = scanner.nextLine();
        String expectedUsername = "endri2019";
        String expectedPassword = "techno1234";

        for (int i = 0; i < 10; i++) {
            if (!expectedUsername.equals(actualUsername) && !actualPassword.equals (expectedPassword)) {
                //subtracting the count by iteration so user will have less tries (-1 every time)
                int count = 5 - i;
                System.out.println("Username or Password is wrong");
                System.out.println("You have: " + count + " more tries left");
                actualUsername = scanner.nextLine();
                actualPassword = scanner.nextLine();
                if (i == 5) {
                    System.out.println("your system will be locked for 10 minutes");

                }
            } else  {
                System.out.println("Logged in successfully");
                System.out.println("Welcome to Homepage");
                break;

            }


        }



    }
}
