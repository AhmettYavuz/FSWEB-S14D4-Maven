package org.example.model;

public class Bread extends ProductForSale{

    private String bre;

    public Bread(String type, double price, String description, String bre) {
        super(type, price, description);
        this.bre = bre;
    }
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {
        System.out.println(bre);
        System.out.println(getType());
        System.out.println(getPrice());
        System.out.println(getDescription());
    }
}
