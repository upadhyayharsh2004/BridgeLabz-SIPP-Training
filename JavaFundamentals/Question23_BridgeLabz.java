import java.util.*;
class Question23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.println("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild
                + " and the number of remaining chocolates is " + remainingChocolates);
    }
}