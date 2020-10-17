package basics;

import javax.swing.text.StringContent;
import java.util.Scanner;

public class ClassWork15th {
    public static void main(String[] args) {

//        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//
//        for (String month : months) {
//            if (month.equalsIgnoreCase("august")) {
//                System.out.println("August");
//                break;
//            }
//            }
//        }

//        for (int i = 100; i >= 0; i -= 5) {
//            System.out.println(i);
//        }


        for (int i = 100; i>=0; i-=5) {
            System.out.println(i);
        }



        String str = "kokok";
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("String: " + str);
        System.out.println("Reversed string: " + reverse);

        if (str.equals(reverse)) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }

        String [] words = {"Artificial Tech", "TECHNICAL", "teChnology"};

        for (int i = 0; i < words.length; i++ ) {

            String word = words[i];
            boolean result = word.toLowerCase().startsWith("tech");
                if (result){
                    System.out.println(result);
                }
            }
        }










        }







