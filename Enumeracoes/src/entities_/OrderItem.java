package entities_;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Produto produto;

    public OrderItem(){}

    public OrderItem(Integer quantity, Double price, Produto produto) {
        this.quantity = quantity;
        this.price = price;
        this.produto = produto;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return """
                %s, $%.2f, Quantity: %d, Subtotal: %.2f
                """.formatted(getProduto().getName(), price, quantity, subTotal());
    }
}
