package class_2020;

public class ConditionalLoops {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 15;
        if (num1 > num2) {
            System.out.println("true");
        } else {
            System.out.println("Doesnt make sense");
        }

        String days = "weekend";
        boolean anyMeetings = true;
        String clothes = "";

        if (days.equalsIgnoreCase("weekdays") && anyMeetings==false) {
            clothes = "formals";
        } else if (days.equals("weekdays") && anyMeetings==true) {
            clothes = "suit"
 ;       } else if (days.equals("weekend")) {
            clothes = "casual";
        }
        System.out.println(clothes);

        int num = 10;

        if (num %2 == 0) {
            System.out.println("even");
        }

        String name = "happy";
        boolean result = true;
        int number = 22;


        if (name.length() > 10 && number > 5 ) {
            System.out.println(name.toUpperCase());
            System.out.println(name.replace("p", "b"));
        } else {
            result = false;
        }
        System.out.println(result);


        String monthName = "SepTemBer";

        switch (monthName.toLowerCase()) {
            case "january":
                case "jebruary":
                case "jarch":
                    System.out.println("Summer");
                    break;
                    case "jpril":
                        case "jay":
                            case "june":
                    System.out.println("Fall");
                    break;
                    case "july":
                        case "august":
                            case "september":
                    System.out.println("Spring");
                    break;
                    case "october":
                        case "november":
                case "december":
                    System.out.println("Winter");
                    break;
                default:
                    System.out.println("invalid month");
        }

        if (monthName.equals("December") || monthName.equals("January") || monthName.equals("February")) {
            System.out.println("Winter");
        }else if (monthName.equals("March") || monthName.equals("April") || monthName.equals("May")) {
            System.out.println("Summer");
        } else if ((monthName.equals("June") || monthName.equals("July") || monthName.equals("August"))) {
            System.out.println("Fall");
        } else if (monthName.equals("September") || monthName.equals("October") || monthName.equals("November")) {
            System.out.println();
        } else {
            System.out.println("Invalid Month");
        }













    }
}
