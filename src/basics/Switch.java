package basics;

import javax.swing.*;

public class Switch {

    public static void main(String[]args){

        //We are going to be using something called switch

        String month = "July";

        switch  (month) {
            case "December" :
            case "January" :
            case "February" :
                System.out.println("Winter");
                break;
            case "March" :
            case "April":
            case "May" :
                System.out.println("Spring");
                break;
            case "June" :
            case "July" :
            case "August" :
                System.out.println("Summer");
                break;
            case "September" :
            case "October" :
            case "November" :
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month");
        }
        System.out.println(month);
    }

}
