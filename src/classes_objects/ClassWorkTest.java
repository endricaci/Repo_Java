package classes_objects;

import java.sql.Statement;
import java.util.Arrays;

public class ClassWorkTest {

    public static void main(String[] args) {

        ClassWorkTest test = new ClassWorkTest();
        int [] numbers = {10, 15, 8, 5, 1};
        int [] anotherSetOfNumbers = {45, 65, 21, 11, 4};
        System.out.println(Arrays.toString(anotherSetOfNumbers));
        System.out.println(Arrays.toString(getReversedArray(anotherSetOfNumbers)));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(getReversedArray(numbers)));
        System.out.println(getTotalFromArray(numbers));
        System.out.println(getAverageOfArray(numbers));
        System.out.println(getMaxNumber(numbers));
        System.out.println(getMinNumber(numbers));
        System.out.println(getSortedIntegerArray(numbers));


    }

    public static String getReversedString(String stringToReverse) {

        String reverse = "";

        for (int i = reverse.length() - 1; i >= 0; i--) {
            reverse = reverse + reverse.charAt(i);
        }
        return reverse;
    }

    public static int[] getReversedArray(int[] numbersToReverse) {
        int tempNumber = 0;
        int[] reversedNumbers = numbersToReverse.clone();

        for (int i = 0; i <= (reversedNumbers.length / 2); i++) {
            tempNumber = reversedNumbers[i];
            reversedNumbers[i] = reversedNumbers[reversedNumbers.length - 1 - i];
            reversedNumbers[reversedNumbers.length - 1 - i] = tempNumber;
        }
        return reversedNumbers;
    }

    public static int getTotalFromArray(int[] numbersToSum) {
        int total = 0;

        for (int i = 0; i < numbersToSum.length; i++) {
            total += numbersToSum[i];
        }
        return total;
    }

    public static int[] getSortedIntegerArray(int[] numbers) {
        int tempNumber = 0;
        int[] sortedNumbers = numbers.clone();

        for (int i = 0; i < sortedNumbers.length; i++) {

            for (int j = i + 1; j < sortedNumbers.length; j++) {

                if (sortedNumbers[j] < sortedNumbers[i])
                    tempNumber = sortedNumbers[i];
                sortedNumbers[i] = sortedNumbers[j];
                sortedNumbers[j] = tempNumber;
            }
        }return sortedNumbers;


    }

    public static double getAverageOfArray(int [] numbers) {

        int total = getTotalFromArray(numbers);
        return (double) total / numbers.length;
    }

    public static int getMaxNumber(int [] number) {

        int maxNumber = number[0];

        for (int i = 1; i < number.length; i++) {

            if (maxNumber < number[i])
               maxNumber = number[i];
        }return maxNumber;
    }

    public static int getMinNumber(int [] number) {

        int minNumber = number[0];
        for (int i = 1; i < number.length; i++) {

            if (minNumber > number[i])
                minNumber = number[i];
        }return minNumber;
    }





}
