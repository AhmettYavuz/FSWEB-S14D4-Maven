package org.example.model;

public class Chocolate extends ProductForSale{

    private String cho;

    public Chocolate(String type, double price, String description, String cho) {
        super(type, price, description);
        this.cho = cho;
    }
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(cho);
        System.out.println(getType());
        System.out.println(getPrice());
        System.out.println(getDescription());
    }
}
