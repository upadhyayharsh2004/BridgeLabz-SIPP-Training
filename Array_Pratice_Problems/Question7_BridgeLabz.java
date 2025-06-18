import java.util.*;
class Question7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[]heights=new double[11];
        for(int i=0; i<heights.length; i++){
            heights[i]=sc.nextDouble();
        }
        double sum=0;
        for(int i=0; i<heights.length; i++){
            sum+=heights[i];
        }
        double mean_height=sum/11;
        System.out.print("The Mean Height Of Players in a Football Team is"+" "+mean_height+" ");
    }
}