package basics;

public class homeWorkTwo {

    public static void main(String[] args) {

        boolean isGuestOneVegan = true;
        boolean isGuesttwoVegan = false;

        if (isGuestOneVegan && isGuesttwoVegan) {
            System.out.println("Only offer up vegan dishes");
        } else if (isGuestOneVegan || isGuesttwoVegan) {
            System.out.println("Make sure offer up some vegan options");
        } else {
            System.out.println("Offer anything in the menu");
        }


    }
}
