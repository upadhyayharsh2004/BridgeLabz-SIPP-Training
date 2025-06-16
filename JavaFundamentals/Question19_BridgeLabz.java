import java.util.*;
class Question19{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        float Simple_Interest=(principal*rate*time)/100;
        System.out.println("The Simple Interest"+" "+Simple_Interest+" "+"for Principal"+" "+principal+" "+","+"Rate of Interest"+" "+rate+" "+"and Time"+" "+time);
    }
}