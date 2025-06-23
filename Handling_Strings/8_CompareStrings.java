
import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = scanner.nextLine();

        int len = Math.min(s1.length(), s2.length());
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) < s2.charAt(i)) {
                    System.out.println(s1 + " comes before " + s2);
                } else {
                    System.out.println(s2 + " comes before " + s1);
                }
                return;
            }
        }

        if (s1.length() < s2.length()) System.out.println(s1 + " comes before " + s2);
        else if (s1.length() > s2.length()) System.out.println(s2 + " comes before " + s1);
        else System.out.println("Both strings are equal");
    }
}
