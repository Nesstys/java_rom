public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("a1bc2", "Samsung SSD 1TB", 200, 1);
        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Total amount: " + invoice.getInvoiceAmount());
    }
}
