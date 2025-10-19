
// this class is all about storing the product info but but .....here firstly i used the concept of 
// encapsulation by making all the data private like...the data that relates with eachOther😎
public class Product {
    private int id;
    private String name;
    private double price;

    // here below i used the concpet of constructor overloading liek two scanarios:
    // 1)user will enter the whole info like id ,price,name
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // 2)and here I am performing constructor oveloading :in sense if use will enter
    // just id and name so it will handle by
    // this constructor
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 0.5;
    }
    // for getting private variables we use getter methods okhay...so we have
    // created three for our three ifo's

    public int getProductId() {
        return this.id;
    }

    public String getProductName() {
        return this.name;
    }

    public double getProductPrice() {
        return this.price;
    }

    // after that i have created the setter but the user will not be able to set new
    // id ...we can just set new price or new name
    // the id cannot be modified ..so we do not have any setter for the id🙄
    public void setProductNewName(String newName) {
        this.name = newName;
    }

    public void setProductNewPrice(double newPrice) {
        this.price = newPrice;
    }

}
