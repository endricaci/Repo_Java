package basics;

import javafx.scene.control.skin.CellSkinBase;

public class homeWorkAug12 {

    public static void main(String[] args) {

        String carTransmission = "N";
        String parkingType = "Parallel";

        System.out.println("The car gear is set to:" + " " + carTransmission + " " + "gear" + " " + "and it's parked" + " " + parkingType + " " + "so:");

        if (carTransmission.equalsIgnoreCase("P")){
            if (parkingType.equalsIgnoreCase("Parallel")) {
                System.out.println("I can park between two cars");
            }
        } else if (carTransmission.equalsIgnoreCase("D")) {
            System.out.println("I can put my car in Snow Type, Sport Type or Regular Type");
        } else if (carTransmission.equalsIgnoreCase("N")) {
            System.out.println("I can put the car in car wash station");
        }else if (carTransmission.equalsIgnoreCase("R")) {
            System.out.println("You can only reverse the car and the car will turn on the back camera");
        }else {
            System.out.println("Invalid command");
        }



    }
}
