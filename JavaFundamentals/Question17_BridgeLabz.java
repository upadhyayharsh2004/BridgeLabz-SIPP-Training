import java.util.*;
class Question17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float number1=sc.nextFloat();
        float number2=sc.nextFloat();
        double Quotient_for_number1_divided_by_number2=number1/number2;
        double Quotient_for_number2_divided_by_number1=number2/number1;
        double Reminder_for_number1_divided_by_number2=number1%number2;
        double Reminder_for_number2_divided_by_number1=number2%number1;
        System.out.println("The Quotient is"+" "+Math.ceil(Quotient_for_number1_divided_by_number2)+" "+"and Reminder is"+" "+Math.ceil(Reminder_for_number1_divided_by_number2)+" "+"of two number"+" "+number1+" "+number2);
        //        System.out.println("The Quotient is"+" "+Math.ceil(Reminder_for_number1_divided_by_number2)+" "+"and Reminder is"+" "+Math.ceil(Reminder_for_number2_divided_by_number1)+" "+"of two number"+" "+number2+" "+number1);
    }
}