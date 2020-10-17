package basics;

public class OtherLoop {

    public static void main(String[] args) {

        int [] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        String [] names = {"James", "Larry", "Tom", "Lucy"};

        for (String name : names) {
            if (name.equalsIgnoreCase("James")) {
                System.out.println("James is in this class");
                break;
            } else {
                System.out.println("James is not in this class");
                break;
            }

        }


    }
}
