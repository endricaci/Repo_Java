//package class_2020;
//
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class homework7 {
//
////    public static void main(String[] args) {
////        System.out.println(checkForPrime(21));
////        System.out.println(isPalindrome("racecar"));
////        System.out.println(printDuplicates("Endri","endri","aldo", "Robert");
////
////
////
////    }
////
//
//
//    /**
//     * 1. Create a method to add all the numbers in a array with double-values
//     */
//
//
//    /**
//     * 2. Create a method to verify if the input-int-number is prime or not
//     * prime number: number divisible by 1 and itself
//     * eg: 7 -> prime
//     * 21 -> not a prime
//     */
//    static boolean checkForPrime(int inputNumber) {
//        boolean isItPrime = true;
//
//        if (inputNumber <= 1) {
//            isItPrime = false;
//
//            return isItPrime;
//        } else {
//            for (int i = 2; i <= inputNumber / 2; i++) {
//                if ((inputNumber % i) == 0) {
//                    isItPrime = false;
//
//                    break;
//                }
//
//            }
//        }
//        return isItPrime;
//    }
//
//    /**
//     * 3. Create a method to find if given string is palindrome.
//     * Palindrome: string which reads the same in reverse.
//     * racecar  ->  racecar
//     * level    ->  level
//     */
//
//    static boolean isPalindrome (String input) {
//        String reverseString = "";
//        boolean isString = false;
//        for (int i = input.length() - 1; i >= 0; i--) {
//            reverseString = reverseString + input.charAt(i);
//        }
//        if (reverseString.equalsIgnoreCase(input)) {
//            isString = true;
//        }else {
//            isString = false;
//        }
//            return isString;
//        }
//    /**
//     * 4. Write a method to print(no return) the duplicate values in a given String array.
//     * Input String array -> {"hello", "peace", "happy" , "hello", "Happy", "hello"}
//     * Method should print -> hello, happy
//     * hello
//     * happy
//     * @param s
//     * @param endri
//     * @param aldo
//     * @param input
//     */
//
////    public static void printDuplicates(String s, String endri, String aldo, String input) {
////
////        for (int i = 0; i < input.length; i++) {
////            for (int j = 1; j < input.length; i++) {
////                if (input[i] == input[j]) {
////                    System.out.println(input[i]);
////                }
////            }
////        }
////
////
////    }}
//
//
//    /**
//     * 5. Write a method to print(no return) the common values between two arrays (string arrays)
//     * Input arrays:
//     *  arr1 -> {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"}
//     *  arr2 -> {"hello", "grow", "laugh" , "peace"}
//     * Method should print -> hello, peace, laugh
//     * hello
//     * peace
//     * laugh
//     */
//
//
