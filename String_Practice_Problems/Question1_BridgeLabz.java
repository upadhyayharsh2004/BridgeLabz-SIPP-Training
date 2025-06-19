import java.util.*;
class Question1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]names=new String[3];
        for(int i=0; i<names.length; i++){
            names[i]=sc.next();
        }
        System.out.print("Enter index to access name: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Name at index: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
