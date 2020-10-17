package class_2020;

public class homework {
    public static void main(String[] args) {

        /**
         * Store your full name in a variable, and display the following:
         *     1. Display length of the first name.
         *     2. Does your last name starts with "K" (Ignoring cases)
         *     3. print the last alphabet of your first name
         *     4. Does your last name ends with "M" (Ignoring cases)
         */

        String fullName = "Endri Caci";

        String [] firstLast = fullName.split(" ");
        int firstLength = firstLast[0].length();
        boolean startsWithK = firstLast[1].toLowerCase().startsWith("k");
        String firstNamesLastLetter = firstLast[0].substring(firstLast[0].length()-1);
        boolean lastEndsM = firstLast[1].toLowerCase ().endsWith("m");


        System.out.println("Full name is: " + fullName);
        System.out.println(fullName + " After split becomes: " + firstLast[0] + " " + firstLast[1]);
        System.out.println("Does " + firstLast[1] + " start with K? -->" + startsWithK);
        System.out.println("Last letter of " + firstLast[0] + " is: " + firstNamesLastLetter);
        System.out.println("Does " + firstLast[1] + " end with M? (ignore cases): " + lastEndsM);

        /**
         * String myStatment = "I am a good programmer";
         * Use string methods to do following tasks:
         * 	1. Display the total number of words in the myStatement.
         * 	2. replace all the 'r' characters with 'f' characters.
         */




        /**
         * Store your first name in a string variable.
         * Calculate the length of your first name, without using length() method of String class.
         */



        /**
         * String strNew = "hello dear, how are you?";
         *
         * Assign result (boolean) as true if length of strNew if greater than 10
         * else assign false.
         *
         * print the result value.
         *
         */



        /**
         * String threeWordsSentence =  "hApPY nEW yeAr";
         * sout(threeWordsSentence);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence);  // Happy New Year
         */


        /**
         * Create abbreviation:
         * String threeWordsSentence =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */






    }
}
