import java.util.*;
class Question21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = scanner.nextInt();
        System.out.println("Enter your bonus: ");
        int bonus = scanner.nextInt();
        int income = salary + bonus;
        System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus
                + ". Hence Total Income is INR " + income);
    }
}