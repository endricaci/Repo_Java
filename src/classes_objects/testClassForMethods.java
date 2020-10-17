package classes_objects;

public class testClassForMethods {

    public static void main(String[] args) {
        User user = new User();
        user.setUserDetails("Endri", 33);
//        user.getAccountSummary();
        user.setIncome(1000);
        user.setIncome(500);
        System.out.println(user.getAccountBalance());
        user.setExpense(20);
        user.setExpense(30000);
        System.out.println(user.getAccountBalance());

        user.resetBalance();
        System.out.println(user.getAccountBalance());


    }


}
