import java.text.DecimalFormat;
import java.util.Scanner;

public class shoppingCart {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.println("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.println("How many would you like?: ");
        quantity = scanner.nextInt();

        total = quantity * price;
        System.out.println("\nYou bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + String.format("%.2f",total));

        scanner.close();
    }
}
