package classes_objects;

public class Invoice {


    private String partNumber;
    private String partDescription;
    private int itemQty;
    private double itemPrice;

    public Invoice(String partNumber, String partDescription, int itemQty, int itemPrice) {

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQty = itemQty;
        this.itemPrice = itemPrice;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getInvoiceAmount() {

        var v = itemPrice * itemQty;
        if (v <= 0) {
            System.out.println("0");
        }if (v< 0 ) {
            System.out.println(v);
        }return v;
    }


}
