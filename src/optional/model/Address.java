package optional.model;

public class Address {
    private String street;

    public Address(String street) {
        this.street = street;
    }

    public String street() {
        return street;
    }
}
