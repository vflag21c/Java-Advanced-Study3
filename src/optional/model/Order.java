package optional.model;

public class Order {
    private Long id;
    private Delivery delivery;

    public Order(Long id, Delivery delivery) {
        this.id = id;
        this.delivery = delivery;
    }

    public Long id() {
        return id;
    }

    public Delivery delivery() {
        return delivery;
    }
}
