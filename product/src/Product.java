public class Product {
    private String name;
    private double price;

    // constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public static void main(String[] args) {
        // creating objects (objects are created through a process called instantiation)
      Product product1 = new Product("MacBook Air", 1199.9);
      Product product2 = new Product("Samsung S22", 2000.8);

      // printing
      System.out.println(product1.name + ": $" + product1.price);
      System.out.println(product2.name + ": $" + product2.price);


    }
}