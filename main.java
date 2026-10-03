import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(id + ". " + name + " - Rs." + price);
    }
}

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Headphones", 2000);
        Product p3 = new Product(3, "Keyboard", 1500);

        System.out.println("Available Products:");

        p1.display();
        p2.display();
        p3.display();

        System.out.print("\nEnter Product ID: ");
        int choice = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Product selected = null;

        if (choice == 1)
            selected = p1;
        else if (choice == 2)
            selected = p2;
        else if (choice == 3)
            selected = p3;
        else
            System.out.println("Invalid Product ID");

        if (selected != null) {
            double total = selected.price * quantity;

            System.out.println("\n===== BILL =====");
            System.out.println("Product : " + selected.name);
            System.out.println("Price   : Rs." + selected.price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total   : Rs." + total);
        }

        sc.close();
    }
}
