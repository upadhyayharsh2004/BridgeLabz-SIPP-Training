import java.util.*;
class Question5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[]multiplicationResult=new int[11];
        for(int i=1; i<=10; i++){
            multiplicationResult[i]=number*(i);
        }
        for(int i=1; i<multiplicationResult.length; i++){
            System.out.println(number+"*"+i+""+"="+""+multiplicationResult[i]);
        }
    }
}