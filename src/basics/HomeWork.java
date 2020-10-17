package basics;

import java.sql.SQLOutput;
import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {


        //First homework
        String myName = "Endri";
        int nameLength = myName.length();
        Boolean startsWithS = myName.startsWith("S");
        char firstLetter = myName.charAt(0);
        Boolean endsWithD = myName.endsWith("D");
        //char fifthCharacter = myName.charAt(5);

        System.out.println("Name:" + " " + myName);
        System.out.println("Name length:" + " " + nameLength);
        System.out.println("Does my name start with S letter?:" + " " + startsWithS);
        System.out.println("First letter:" + " " + firstLetter);
        System.out.println("Does my name end with D letter?:" + " " + endsWithD);


        //Second homework
        String[] myFriends = new String[]{"Jake", "Eldi", "Erica", "Jenny", "John"};

        int arrayLength = myFriends.length;
        String thirdName = myFriends[2];
        String secondName = myFriends[1];
        Boolean startWithA = secondName.startsWith("A");

        System.out.println("Array length:" + " " + arrayLength);
        System.out.println("Third name:" + " " + thirdName);
        System.out.println("Second name:" + " " + secondName);
        System.out.println("Does my name start with \"A\" letter:" + " " + startWithA);
        System.out.println("All names:" + " " + Arrays.asList(myFriends));

    }
}