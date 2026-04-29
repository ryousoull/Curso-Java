package entities_;

import entities.enums.OrderStatus;
import entities_enuns.OrderStatus_;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order_ {

    private Date moment;
    private OrderStatus_ status;

    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    public Order_() {
    }

    public Order_(Client client, OrderStatus_ status, Date moment) {
        this.client = client;
        this.status = status;
        this.moment = moment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderStatus_ getStatus() {
        return status;
    }

    public void setStatus(OrderStatus_ status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }
}
