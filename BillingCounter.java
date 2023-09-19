import java.util.Scanner;

public class BillingCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products you have purchased: ");
        int len = sc.nextInt();

        Item[] Items = new Item[len];

        for (int i = 0; i < Items.length; i++) {
            Item it = new Item();
            System.out.println("Enter the item name: ");
            it.name = sc.next();
            System.out.println("Enter the item Qunatity: ");
            it.qty = sc.nextInt();
            System.out.println("Enter the price of item: ");
            it.price = sc.nextDouble();

            it.total = it.price * it.qty;
            Items[i] = it;
        }

        double totalPrice = 0;

        for (int i = 0; i < Items.length; i++) {
            totalPrice += Items[i].total;
        }

        System.out.println("Item\tQty\tPrice\tTotal");
        for (int i = 0; i < Items.length; i++) {
            Items[i].display();
        }
        System.out.println("\t\tTotal: " + totalPrice);
    }
}

class Item {
    String name;
    int qty;
    double price;
    double total;

    void display() {
        System.out.println(name + "\t" + qty + "\t" + price + "\t" + total);

    }
}
