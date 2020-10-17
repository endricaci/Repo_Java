package basics;

import javax.swing.*;

public class homeworkNoOne {

    public static void main(String[] args) {

        double accountBalance = 1000;
        int iphoneAvailability = 10;
        int creditScore = 649;

        if (accountBalance >= 1000 && iphoneAvailability > 0){
            JOptionPane.showMessageDialog(null, "You can go to the store and purchase the iPhone");
        } else if (creditScore >= 650 || accountBalance >= 1000) {
            JOptionPane.showMessageDialog(null, "You are elegible to purchase the iPhone");
        } else {
            JOptionPane.showMessageDialog(null, "You are not elegible for the iPhone");
        }

        }
    }


