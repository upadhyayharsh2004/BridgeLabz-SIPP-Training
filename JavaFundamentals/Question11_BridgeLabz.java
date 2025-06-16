import java.util.*;
public class Question11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit price of an item: ");
        double unitPrice = sc.nextDouble();
        System.out.println("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();
        double total_Purchase_Price = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPurchasePrice + " if the quantity" + quantity
                + " and the unit price is INR " + unitPrice);
    }
}