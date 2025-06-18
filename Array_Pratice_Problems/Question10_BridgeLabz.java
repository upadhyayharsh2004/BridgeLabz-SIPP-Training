import java.util.*;
class Question10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]array=new int[10];
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        for(int i=0; i<array.length; i++){
            if(array[i]<0){
                System.out.print("Invalid Age");
            }
            else if(array[i]>=18){
                System.out.print("The student with the age"+" "+array[i]+" "+"can vote.");
            }
            else{
                System.out.print("The student with the age"+" "+array[i]+" "+"cannot vote.");
            }
        }
    }
}