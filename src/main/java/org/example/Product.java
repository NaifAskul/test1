package org.example;

public abstract class Product {
    private int id;
    private double price;
    private String name;
    private static int quantity;
    private double weight;

    public Product(int id, double price, String name, double weight){
        this.id = id;
        this.price = price;
        this.name = name;
        this.weight = weight;
        quantity ++;
    }

    public void applySaleDiscount(double percentage){
        this.price = this.price - ((percentage/100) * this.price);
    }

    public final void addToShoppingCart(){

        System.out.println( this.name+ " has been added to the shopping cart.");

    };

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight > 0) {
            this.weight = weight;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public int getTotalQuantity(){

        return quantity;
    }

    public void getSellableStatus(){
        System.out.println("This product is sellable");
    }

    public String toString(){
        return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
                "\tPrice: SR" + this.price+"\t Weight : "+this.weight;
    }
}
