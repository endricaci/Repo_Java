package classes_objects;

public class PrinterObjectHomeWork {

    public static void main(String[] args) {

        PrinterObjectHomeWork printer = new PrinterObjectHomeWork(99);

        printer.setPrint(20);
        System.out.println(printer.printedPages);

    }


    private int tonerLever;
    private int printedPages;
    private int maxPrintPages = 100;

    public PrinterObjectHomeWork(int tonerLevel) {
        this.tonerLever = tonerLevel;
        if (this.tonerLever >-1 && this.tonerLever <=100) {
            this.tonerLever = tonerLevel;
        } else {
            this.tonerLever = -1;
        }
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public int doublePagePrint(boolean yesNo ) {

        if (true) {
            printedPages = printedPages / 2;
        } else {
            printedPages = printedPages;
        }return printedPages;
    }

    public int getTonerLever() {
        return tonerLever;
    }

    public void setPrint (int numberOfPages) {
        printedPages += numberOfPages;
    }




}
