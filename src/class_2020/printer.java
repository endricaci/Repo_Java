package class_2020;

public class printer<maxTonerLevel> {


    int maxTonnerLevel = 100;
    int maxPagesCapacity = 100;

    public printer(int inputTonerLevel, int inputPagesCapacity) {
        maxTonnerLevel = inputTonerLevel;
        maxPagesCapacity = inputPagesCapacity;

        if (maxTonnerLevel >-1 && maxTonnerLevel<=100) {
            maxTonnerLevel=inputTonerLevel;}
        else maxTonnerLevel = -1;

        if (maxPagesCapacity >-1 && maxPagesCapacity<=100) {
            maxPagesCapacity = inputPagesCapacity;}
        else maxPagesCapacity = -1;
    }


    public void addPages (int input) {
        int newCapacity = input + maxPagesCapacity;
        if (newCapacity  >0 && newCapacity <=100) {
            maxPagesCapacity += input;}
        else maxPagesCapacity=-1;
    }

    public void addToner (int input) {
        if (maxTonnerLevel >0 && maxTonnerLevel<=100) {
            maxTonnerLevel = maxTonnerLevel + input;}
        else maxTonnerLevel =-1;
    }

    public void printSingle (int input) {
        if (input <= maxPagesCapacity && input <= maxTonnerLevel) {
            maxPagesCapacity = maxPagesCapacity - input;
            maxTonnerLevel = maxTonnerLevel - input;
        }else if (maxPagesCapacity < input) {
            System.out.println("You're trying to print " + input + " pages." + " Pages left in the tray: " + maxPagesCapacity + " Please add pages.");
        }else if (maxTonnerLevel < input){
            System.out.println("You're trying to print " + input + " pages." + " Toner level: " + maxTonnerLevel + " Please refill");
        }else System.out.println("-1");
    }

    public void printDouble(int input) {
        int doublePages = input * 2;
        if (doublePages <= maxPagesCapacity && doublePages <= maxTonnerLevel) {
            maxPagesCapacity -= doublePages;
            maxTonnerLevel -= doublePages;
        }else if (maxPagesCapacity < doublePages) {
            System.out.println("You're trying to print " + doublePages + " pages." + " Pages left in the tray: " + maxPagesCapacity + " Please add pages.");
        }else if (maxTonnerLevel < input){
            System.out.println("You're trying to print " + doublePages + " pages." + " Toner level: " + maxTonnerLevel + " Please refill");
        }else System.out.println("-1");
    }

    public void printerSummary  () {
        System.out.println("Tonner level: " + maxTonnerLevel);
        System.out.println("Pages left in the tray: " + maxPagesCapacity);
    }

    public void checkToner () {
        if (maxTonnerLevel<10 && maxTonnerLevel >= 0) {
            System.out.println("Toner level low, add toner");
        }
    }
}
