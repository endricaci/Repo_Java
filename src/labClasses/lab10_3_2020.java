package labClasses;

public class lab10_3_2020 {
    public static void main(String[] args) {

        String fanName = "Maryna";

//        switch (fanName) {
//            case "Maryna":
//            case "Ash":
//                System.out.println(fanName + " is a Basketball fan");
//                break;
//            case "Sikder":
//            case "Dmitri":
//            case "Agha":
//            case "Nargis":
//            case "Rasel":
//            case "Endri":
//                System.out.println(fanName + " is a Football fan");
//                break;
//            case "Ahsan":
//                System.out.println(fanName + " is a Cricket fan");
//                break;
//            case "Alex":
//                System.out.println(fanName + " is an undecided fan");
//                break;
//            default:
//                System.out.println(fanName + " is not a match");
//        }

        if (fanName.equals("Endri") || fanName.equals("Sikder") || fanName.equals("Agha") || fanName.equals("Nargis") || fanName.equals("Rasel") || fanName.equals("Dmitri")) {
            System.out.println(fanName + " is a Football fan");
        }else if (fanName.equals("Maryna") || fanName.equals("Ash")) {
            System.out.println(fanName + " is a Basketball fan");
        }else if (fanName.equals("Ahsab")) {
            System.out.println(fanName + " is a Cricket fan");
        }else if (fanName.equals("Alex")) {
            System.out.println(fanName + " is an undecided fan");
        }else {
            System.out.println(fanName + " is not a match");
        }


    }
}