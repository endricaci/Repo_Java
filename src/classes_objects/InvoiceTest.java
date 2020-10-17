package classes_objects;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("1352Q", "spark plug", 10, 15 );

        System.out.println("item price: " + invoice.getItemPrice());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());



    }
}
