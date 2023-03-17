import java.util.HashMap;
public class HashMapDemo {
    public static void main(String args[]) {
        // Creating a HashMap to store product information
        HashMap<String, Double> product = new HashMap<String, Double>();
        // Adding product information to the HashMap
        product.put("Laptop", 999.99);
        product.put("Tablet", 399.99);
        product.put("Phone", 699.99);
        // Displaying the product HashMap
        System.out.println("Product HashMap: " + product);
        // Accessing an element from the product HashMap
        double price = product.get("Tablet");
        System.out.println("Tablet's price: " + price);
        // Removing an element from the product HashMap
        System.out.println("The Size of Product HashMap is :"+product.size());
        product.remove("Phone");
        System.out.println("After removing Phone From HashMap: " + product);
    }
}
