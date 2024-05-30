package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] product = new ProductForSale[] {
                new Chocolate("asd",5.1,"qweqwe","rtyrty"),
                new Coke("qwe",4.1,"qweqweqwe","gfdgfd"),
                new Bread("zxc",3.1,"zxczxc","vbn")};
        listProducts(product);
    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product : products) {
            product.showDetails();
        }

    }
}