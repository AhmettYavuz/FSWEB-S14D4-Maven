package org.example.model;

public class Coke extends ProductForSale{

    private String cok;

    public Coke(String type, double price, String description, String cok) {
        super(type, price, description);
        this.cok = cok;
    }
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(cok);
        System.out.println(getType());
        System.out.println(getPrice());
        System.out.println(getDescription());
    }
}
