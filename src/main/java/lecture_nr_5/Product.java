package lecture_nr_5;

public class Product {

    String name;
    float price;
    int quantity;

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public float calculateSum(){
        float result = price * quantity;
        return result;
    }
}
