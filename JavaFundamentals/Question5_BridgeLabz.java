import java.util.*;
class Question5{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int student_fee_for_university=input.nextInt();
        int discountPercent=input.nextInt();
        double discount=(discountPercent*student_fee_for_university)/100;
        int pay_fee_to_university=student_fee_for_university-(int)discount;
        System.out.print("The discount amount is INR"+" "+discount+" "+"and final discounted fee is INR"+" "+pay_fee_to_university);
    }
}