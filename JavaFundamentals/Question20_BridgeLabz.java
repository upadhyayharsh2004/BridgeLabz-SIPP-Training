import java.util.*;
class Question20{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float Celsius=sc.nextFloat();
        float farenheitResult=(float)(Celsius*1.8)+32;
        System.out.println("The"+" "+Celsius+" "+"celsius is"+" "+farenheitResult+" "+"fahrenheit");
    }
}