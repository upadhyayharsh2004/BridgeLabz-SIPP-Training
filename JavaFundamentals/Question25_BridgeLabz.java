import java.util.*;
class Question25{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        int distance_in_metres=5000;
        int perimeter_of_triangle=side1+side2+side3;
        double total_number_of_rounds=distance_in_metres/perimeter_of_triangle;
        System.out.println("The total numbers of rounds the athlete will run is "+" "+total_number_of_rounds+" "+"to complete"+" ");
    }
}

