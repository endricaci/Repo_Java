//package classes_objects;
//
//import java.util.Arrays;
//
//public class classWork {
//    ​
//        public static void main(String[] args) {
//​
//            String stringToTest = "Sample document";
//            String anotherStringToTest = "object oriented programming";
//​
//            int[] numbers = {25, 15, 3, 2, 40};
//            int[] anotherSetOfNumbers = {32, 14, 56, 148, 24, 78, 24};
//​
//            System.out.println("Exercise 1a: Reverse the string \"" + stringToTest + "\": " + getReverseString(stringToTest));
//            System.out.println("Exercise 1b: Reverse the string \"" + anotherStringToTest + "\": " + getReverseString(anotherStringToTest) + "\n");
//​
//            System.out.println("Exercise 2a: Reverse the array " + Arrays.toString(numbers) + ": " + Arrays.toString(getReverseIntegerArray(numbers)));
//            System.out.println("Exercise 2b: Reverse the array " + Arrays.toString(anotherSetOfNumbers) + ": " + Arrays.toString(getReverseIntegerArray(anotherSetOfNumbers)) + "\n");
//​
//            System.out.println("Exercise 3a: Get the total from integer array " + Arrays.toString(numbers) + ": " + getTotalFromIntegerArray(numbers));
//            System.out.println("Exercise 3b: Get the total from integer array " + Arrays.toString(anotherSetOfNumbers) + ": " + getTotalFromIntegerArray(anotherSetOfNumbers) + "\n");
//​
//            System.out.println("Exercise 4a: Sort the integer array " + Arrays.toString(numbers) + ": " + Arrays.toString(getSortedIntegerArray(numbers)));
//            System.out.println("Exercise 4b: Sort the integer array " + Arrays.toString(anotherSetOfNumbers) + ": " + Arrays.toString(getSortedIntegerArray(anotherSetOfNumbers)) + "\n");
//​
//            System.out.println("Exercise 5a: Get the average from an integer array " + Arrays.toString(numbers) + ": " + getAverage(numbers));
//            System.out.println("Exercise 5b: Get the average from an integer array " + Arrays.toString(anotherSetOfNumbers) + ": " + getAverage(anotherSetOfNumbers) + "\n");
//​
//            System.out.println("Exercise 6a: Get the largest value from an integer array " + Arrays.toString(numbers) + ": " + getMaxNumber(numbers));
//            System.out.println("Exercise 6b: Get the largest value from an integer array " + Arrays.toString(anotherSetOfNumbers) + ": " + getMaxNumber(anotherSetOfNumbers) + "\n");
//​
//            System.out.println("Exercise 7a: Get the smallest value from an integer array " + Arrays.toString(numbers) + ": " + getMinNumber(numbers));
//            System.out.println("Exercise 7b: Get the smallest value from an integer array " + Arrays.toString(anotherSetOfNumbers) + ": " + getMinNumber(anotherSetOfNumbers) + "\n");
//​
//            System.out.println("Exercise 8a: Abbreviate the string \"" + stringToTest + "\": " + getAbbreviation(stringToTest));
//            System.out.println("Exercise 8b: Abbreviate the string \"" + anotherStringToTest + "\": " + getAbbreviation(anotherStringToTest) + "\n");
//​
//            int startNumber = 1;
//            int totalNumInSeries = 6;
//            int anotherStartNumber = 4;
//            int anotherTotalNumInSeries = 7;
//​
//            System.out.print("Exercise 9a: Get the fibonacci sequence starting from " + startNumber + " up to " + totalNumInSeries + " numbers: ");
//            printFibonacciSequence(startNumber, totalNumInSeries);
//            System.out.print("Exercise 9a: Get the fibonacci sequence starting from " + anotherStartNumber + " up to " + anotherTotalNumInSeries + " numbers: ");
//            printFibonacciSequence(anotherStartNumber, anotherTotalNumInSeries);
//            System.out.println();
//​
//            double[] studentMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
//            String [] students = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky", "Hannah" , "David", "Gia"};
//​
//            double[] anotherSetOfStudentMarks = {50.1, 9, 79, 25.3, 33};
//            String [] anotherSetOfStudents = {"Bob", "Lynne", "Tina", "Gene", "Louise"};
//​
//            System.out.println("Exercise 10a: Get student with highest mark from marks array and student array:");
//            System.out.println("Marks array: " + Arrays.toString(studentMarks));
//            System.out.println("Student array: " + Arrays.toString(students));
//            printTopStudentByMark(studentMarks, students);
//            System.out.println();
//​
//            System.out.println("Exercise 10b: Get student with highest mark from marks array and student array:");
//            System.out.println("Marks array: " + Arrays.toString(anotherSetOfStudentMarks));
//            System.out.println("Student array: " + Arrays.toString(anotherSetOfStudents));
//            printTopStudentByMark(anotherSetOfStudentMarks, anotherSetOfStudents);
//            System.out.println();
//​
//            int numberToAddUpTo = -5;
//            int anotherNumberToAddUpTo = 10;
//​
//            System.out.println("Exercise 11a: Add up digits starting from 0 up to " + numberToAddUpTo + ": " + getTotalUpToValue(numberToAddUpTo));
//            System.out.println("Exercise 11b: Add up digits starting from 0 up to " + anotherNumberToAddUpTo + ": " + getTotalUpToValue(anotherNumberToAddUpTo));
//        }
//​
//        /**
//         * 1. Reverse a string
//         *  *         Eg: Input to method : Sample
//         *  *               Output/Return from method : elpmaS
//         * @param stringToReverse
//         * @return
//         */
//        public static String getReverseString(String stringToReverse)
//        {
//            String reversedString = "";
//​
//            for (int i = stringToReverse.length() - 1; i >= 0; i--)
//                reversedString += stringToReverse.charAt(i);
//​
//            return  reversedString;
//        }
//​
//        /**
//         * 2. Reverse an array (fyi: length of input array can vary)
//         *  *         Eg: Input to method : [25, 15, 3, 2, 40] or [20, 10, 44]
//         *  *               Output/Return from method : [40, 2, 3, 15, 25] or [44, 10, 20]
//         */
//        public static int[] getReverseIntegerArray(int[] numbersToReverse)
//        {
//            int tempNumber = 0;
//            int[] reversedNumbers = numbersToReverse.clone();
//​
//            for (int i = 0; i < (reversedNumbers.length / 2 ); i++)
//            {
//                tempNumber = reversedNumbers[i];
//                reversedNumbers[i] = reversedNumbers[reversedNumbers.length - i - 1];
//                reversedNumbers[reversedNumbers.length - i - 1] = tempNumber;
//            }
//​
//            return reversedNumbers;
//        }
//​
//        /**
//         * 3. Add all numbers in a given array (fyi: length of input array can vary)
//         *  *         Eg: Input to method : [20, 10, 40, 44]
//         *  *               Output/Return from method : 114
//         */
//        public static int getTotalFromIntegerArray(int[] numbersToAdd)
//        {
//            int total = 0;
//​
//            for (int i = 0; i < numbersToAdd.length ; i++)
//                total += numbersToAdd[i];
//​
//            return total;
//        }
//​
//        /**
//         * 4. Sort an array
//         *  *         Eg: Input to method : [20, 10, 40, 44]
//         *  *               Output/Return from method : [10, 20, 40, 44]
//         */
//        public static int[] getSortedIntegerArray (int[] numbers)
//        {
//            int tempNumber = 0;
//            int[] sortedNumbers = numbers.clone();
//​
//            for (int i = 0; i < sortedNumbers.length; i++)
//            {
//                for (int j = i+1; j < sortedNumbers.length; j++)
//                {
//                    if (sortedNumbers[j] < sortedNumbers[i]) {
//​
//                        tempNumber = sortedNumbers[i];
//                        sortedNumbers[i] = sortedNumbers[j];
//                        sortedNumbers[j] = tempNumber;
//                    }
//                }
//            }
//​
//            return sortedNumbers;
//        }
//​
//        /**
//         * 5. Find Average of a given array
//         *  *         Eg: Input to method : [20, 10, 40, 44]
//         *  *               Output/Return from method : 28.5
//         */
//        public static double getAverage(int[] numbersToAverage)
//        {
//            int total = getTotalFromIntegerArray(numbersToAverage);
//​
//            return (double) total / numbersToAverage.length;
//​
//        }
//​
//        /**
//         * 6. Find maximum number in given array
//         *  *         Eg: Input to method : [20, 10, 40, 44, 32]
//         *  *               Output/Return from method : 44
//         * @param numbers
//         */
//        public static int getMaxNumber(int[] numbers)
//        {
//            int maxNumber = numbers[0];
//​
//            for(int i = 1; i < numbers.length; i++)
//            {
//                if (maxNumber < numbers[i])
//                    maxNumber = numbers[i];
//            }
//​
//            return maxNumber;
//        }
//​
//        /**
//         * 7. Find minimum number in given array
//         *  *         Eg: Input to method : [20, 10, 40, 44]
//         *  *               Output/Return from method : 10
//         */
//        public static int getMinNumber(int[] numbers)
//        {
//            int minNumber = numbers[0];
//​
//            for(int i = 1; i < numbers.length; i++)
//            {
//                if (minNumber > numbers[i])
//                    minNumber = numbers[i];
//            }
//​
//            return minNumber;
//        }
//​
//        /**
//         * 8. Create abbreviation for any string
//         *  *         Eg: Input to method : Outfit of the day ( or Good morning or Happy new year)
//         *  *               Output/Return from method : OOTD ( or GM or HMY)
//         */
//        public static String getAbbreviation(String stringToAbbreviate)
//        {
//            String[] stringArray = stringToAbbreviate.split("\\s");
//            String abbreviatedString = "";
//​
//            for (int i = 0; i < stringArray.length; i++)
//                abbreviatedString += stringArray[i].charAt(0);
//​
//            return abbreviatedString.toUpperCase();
//        }
//​
//        ​
//        public static void printFibonacciSequence (int startNumber, int totalNumInSeries)
//        {
//            if (totalNumInSeries < 1)
//                System.out.println("Unable to execute. Total number in series must be greater than 0");
//            else if (startNumber < 0)
//                System.out.println("Unable to execute. Start number must be positive integer or 0");
//            else
//                System.out.println(Arrays.toString(getFobanacciSequence(startNumber, totalNumInSeries)));
//        }
//​
//        /**
//         * 9. Create fibonacci series for given start number and given length of series
//         *  *         Eg: Input to method : start = 1 , totalNumInSeries = 6
//         *  *               Output/Return from method : [1, 1, 2, 3, 5, 8, 13]
//         *
//         */
//        public static int[] getFobanacciSequence(int startNumber, int totalNumInSeries)
//        {
//            int[] fibonacciSequence = new int[totalNumInSeries + 1];
//​
//            fibonacciSequence[0] = startNumber;
//            fibonacciSequence[1] = fibonacciSequence[0];
//​
//            for (int i = 2; i <= totalNumInSeries; i++)
//                fibonacciSequence[i] = fibonacciSequence[i-1] + fibonacciSequence[i-2];
//​
//            return fibonacciSequence;
//        }
//​
//        public static void printTopStudentByMark(double[] marks, String[] students)
//        {
//            if(students.length == marks.length)
//                System.out.println("Top student is: " + getTopStudentByMark(marks, students));
//            else
//                System.out.println("Unable to determine as arrays need to be the same length");
//        }
//​
//        /**
//         * 10. Given two arrays, one contains total marks of 11 students of a class; second array contains their names in same order as marks-array.
//         *  *     double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
//         *  *     String [] sNames = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky", "Hannah" , "David", "Gia"};
//         *  *     Create a method which takes both array as parameters, and returns name of student who scored maximum marks in the class.
//         *  *     For above example : method should return "Hannah"
//         */
//        public static String getTopStudentByMark(double[] marks, String[] names)
//        {
//            int indexOfMaxMark = 0;
//​
//            double maxMark = marks[0];
//​
//            for (int i = 0; i < marks.length; i++) {
//                if (maxMark < marks[i]) {
//                    maxMark = marks[i];
//                    indexOfMaxMark = i;
//                }
//            }
//​
//            return names[indexOfMaxMark];
//        }
//​
//        ​
//        /**
//         * 11. Create a method to add numbers from 0 to given number, and return the result
//         *  *     Example : addUpto(5)  -> method should return 15 (bcz, 0+1+2+3+4+5 = 15)
//         *  *     Parameter can be negative or positive
//         */
//        public static int getTotalUpToValue(int numberToAddUpTo)
//        {
//            int total = 0;
//            int upperLimit;
//​
//            if(numberToAddUpTo < 0)
//                upperLimit = numberToAddUpTo * -1;
//            else
//                upperLimit = numberToAddUpTo;
//​
//            for (int i = 0; i <= upperLimit; i++)
//                total += i;
//​
//            if(numberToAddUpTo < 0)
//                total = total * -1;
//​
//            return total;
//​
//​}
//    }
//}