import java.util.*;
class Question22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfStudents=sc.nextInt();
        int maximum_number_of_possible_handshakes=(numberOfStudents*(numberOfStudents -1))/2;
        System.out.println("the number of possible handshakes"+" "+maximum_number_of_possible_handshakes);
    }
}