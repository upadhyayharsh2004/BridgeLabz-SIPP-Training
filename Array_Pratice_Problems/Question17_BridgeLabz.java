import java.util.*;
class Question17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String s=Integer.toString(number);
        int count_of_digits_in_number=s.length();
        String[]simple=new String[s.length()];
        for(int i=0; i<simple.length; i++){
            simple[i]=String.valueOf(s.charAt(i));
        }
        String []reversed_arr=new String[simple.length];
        for(int i=simple.length-1; i>=0; i--){
            reversed_arr[simple.length-1-i]=simple[i];
        }
        for(int i=0; i<reversed_arr.length; i++){
            System.out.print(Integer.parseInt(reversed_arr[i])+" ");
        }
        
    }
}