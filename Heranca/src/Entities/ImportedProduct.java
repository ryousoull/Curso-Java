package Entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFree() {
        return customsFee;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFee = customsFree;
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return """
                %s $ %.2f (Customns free: $ %.2f)
                """.formatted(getName(), totalPrice(), customsFee);
    }
}
