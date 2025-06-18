import java.util.*;
class Question2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[]arr=new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println("The number is positive as well as even");
                }
                else if(arr[i]%2!=0){
                    System.out.println("The number is positive as well as odd");
                }
            }
            else if(arr[i]<0){
                System.out.println("The number is negative");
            }
            else{
                System.out.println("The number is equal to zero");
            }
        }
        int a=arr[0];
        int b=arr[arr.length-1];
        if(a==b){
            System.out.println("The  first number and last number of the array are equal");
        }
        else if(a<b){
            System.out.println("The  first number is less than last number of the array");
        }
        else{
            System.out.println("The  first number is greater than last number of the array");
        }
    }
}