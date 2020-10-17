package basics;

import java.util.Scanner;

public class NonPrimitive {

    public static void main(String[] args) {

//
//        Scanner scanner = new Scanner(System.in);
//        //System.out.println("Please enter your name");
//
//        //String name = scanner.nextLine();
//        //System.out.println("My Name is: " + name);
//
//        Person person = new Person();
//        String name = person.name;
//        System.out.println(name);
//
//
//    }
//
//
//    class Person {
//
//        String name = "Endri";
//        int age = 28;
////
//        String firstName = "Endri";
//        String lastName = "Caci";
////
//////        //Combine strings into single variable
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);



//        //Find the length of a string (in this case full name)
//
//
//        System.out.println(fullName.length());
////
////        //this is  variable for name length
//        int nameLength = fullName.length();
//
//
//        //this is on how to re-assign and then trim the useless spaces
//        String greeting = "  Hello World  ";
//        greeting = greeting.trim();
//        System.out.println(greeting);
//
//        //Escape notation
//        String message = "This is \"my\" message";
//        System.out.println(message);
//
//        //Convert string to uppercase
//        String nameUpperCase = fullName.toUpperCase();
//        System.out.println(nameUpperCase);
//
//
//        //convert string to lower case
//        String nameLowerCase = fullName.toLowerCase();
//        System.out.println(nameLowerCase);
//
//        String password = "test1234";
//        boolean isContains = password.contains("endri");
//        System.out.println(isContains);
//
//        //find if string is empty
//        boolean isEmpty = password.isEmpty();
//        System.out.println(isEmpty);

        //Split string words into array
//        String [] words = message.split("");
//        for (String word ; words) {
//            System.out.println(word);


        //Class work
//        String myStatement = "i am a good programmer";
//
//
//        System.out.println(myStatement.length());
//        System.out.println(myStatement.toLowerCase());
//
//        boolean isContains = myStatement.contains("mohamad");
//        System.out.println(isContains);
//
//        char characterAtIndex = myStatement.charAt(5);
//        System.out.println(characterAtIndex);
//
//        boolean isEmpty = myStatement.isEmpty();
//        System.out.println(isEmpty);
//
//        boolean isEqual = myStatement.equalsIgnoreCase("technosoft");
//        System.out.println(isEqual);
//
//        boolean endsWith = myStatement.endsWith("Good Bye");
//        System.out.println(endsWith);
//
//        boolean startsWith = myStatement.startsWith("Welcome");
//        System.out.println(startsWith);



        String myStatement = "I am a good programmer";
        int length = myStatement.length();
        String lowerCase = myStatement.toLowerCase();
        String upperCase = myStatement.toUpperCase();
        Boolean isContains = myStatement.contains("mohammad");
        char fifthIndex =myStatement.charAt(5);
        boolean isEmpty = myStatement.isEmpty();
        Boolean compare = myStatement.equalsIgnoreCase("technosoft");
        boolean startsWith = myStatement.startsWith("welcom");
        boolean endsWith = myStatement.endsWith("goodbye");


        System.out.println(length);
        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(isContains);
        System.out.println(fifthIndex);
        System.out.println(isEmpty);
        System.out.println(compare);
        System.out.println(startsWith);
        System.out.println(endsWith);



//        /**
//         * Class work:
//         * 1. String myStatment = "I am a good programmer"
//         * 2. Find the length of of "myStatment"
//         * 3. Convert all values to lowercase
//         * 4. See if statment contains mohammad
//         * 5. find the 5th index of the statement
//         * 6. find if the statment is empty
//         * 7. compare the "myStatement" with "technosoft"
//         * 8. Check if message starts with "Welcome"
//         * 9. Check if message ends with "Good Bye"










//        }







    }
}