package entities;

public class Product {
    public String name;
    public Double price;
    public int quantity;

    public double totalValueInSotock() {
        return price * quantity;
    }

    public void addProdocts (int quantity) {
        this.quantity +=quantity;
    }

    public void removeProducts (int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInSotock());
    }
}
