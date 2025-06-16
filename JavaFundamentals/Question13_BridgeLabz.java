import java.util.*;
class Question13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double number1=sc.nextDouble();
        double number2=sc.nextDouble();
        double result_addition_of_number1_and_number2=number1+number2;
        double result_subtraction_of_number1_and_number2=number1-number2;
        double result_multiplication_of_number1_and_number2=number1*number2;
        double result_divison_of_number1_and_number2=number1/number2;
        System.out.println("The addition,"+" "+"subtraction,"+" "+"multiplication,"+" "+"and divison value of 2 numbers"+" "+number1+" "+"and"+" "+number2+" "+"is"+" "+result_addition_of_number1_and_number2+" "+result_subtraction_of_number1_and_number2+" "+result_multiplication_of_number1_and_number2+" "+result_divison_of_number1_and_number2);
        // double result_addition_of_number2_and_number1=number2+number1;
        // double result_subtraction_of_number2_and_number1=number2-number1;
        // double result_multiplication_of_number2_and_number1=number2*number1;
        // double result_divison_of_number2_and_number1=number2/number1;
        // System.out.println("The addition,"+" "+"subtraction,"+" "+"multiplication,"+" "+"and divison value of 2 numbers"+" "+number2+" "+"and"+" "+number1+" "+"is"+" "+result_addition_of_number2_and_number1+" "+result_subtraction_of_number2_and_number1+" "+result_multiplication_of_number2_and_number1+" "+result_divison_of_number2_and_number1);
    }
}