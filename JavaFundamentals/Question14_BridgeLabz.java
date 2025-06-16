import java.util.*;
class Question14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        float area_in_square_centimeters=(float)(0.5*base*height);
        float area_in_square_inch=(float)(0.1550031*area_in_square_centimeters);
        System.out.println("The Area of the triangle in sq in is"+" "+ area_in_square_inch+" "+"and sq cm is"+" "+area_in_square_centimeters);
    }
}