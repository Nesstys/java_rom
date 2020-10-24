package Chapter3;

public class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double price;

    public Invoice(String partNumber, String partDescription, double price, int quantity) {
        this.partDescription = partDescription;
        this.partNumber = partNumber;

        if (price > 0.0)
            this.price = price;
        if (quantity > 0)
            this.quantity = quantity;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
}
