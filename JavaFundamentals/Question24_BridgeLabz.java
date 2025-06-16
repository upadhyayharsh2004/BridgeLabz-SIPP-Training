import java.util.*;
class Question24{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float fahrenheit=sc.nextFloat();
        float celsiusResult=(float)((fahrenheit-32)*1.8);
        System.out.println("The"+" "+fahrenheit+" "+"fahrenheit is"+" "+Math.ceil(celsiusResult)+" "+"celsius");
    }
}