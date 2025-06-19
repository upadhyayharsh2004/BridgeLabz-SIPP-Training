import java.util.*;
public class Question4{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    String input1=sc.next();
	    String input2=sc.next();
	    int length_of_input1=input1.length();
	    int length_of_input2=input2.length();
	    char[]ch1=new char[input1.length()];
	    char[]ch2=new char[input2.length()];
	    for(int i=0; i<input1.length(); i++){
	        ch1[i]=input1.charAt(i);
	    }
	    for(int i=0; i<input2.length(); i++){
	        ch2[i]=input2.charAt(i);
	    }
	    char[]gh1=input1.toCharArray();
	    char[]gh2=input2.toCharArray();
	    System.out.println("Are both the strings being compared are same by comparing 2 string arrays --> "+check(input1,input2,length_of_input1,length_of_input2,ch1,ch2));
	    System.out.println("Are both the strings being compared are same by the user defined methods and and the String builtin toCharArray() method  compare the 2 arrays,--> "+check_2array(input1,input2,length_of_input1,length_of_input2,gh1,gh2));
    }
	public static boolean check(String input1, String input2,int length1,int length2,char[]ph1,char[]ph2){
	    if(length1==length2){
	        for(int i=0; i<length1;i++){
	            if(ph1[i]==ph2[i]){
	                continue;
	            }
	            else{
	                return false;
	            }
	        }
	        return true;
	    }
	    return false;
	}
	public static boolean check_2array(String input1, String input2,int length1,int length2,char[]rh1,char[]rh2){
	    if(length1==length2){
	        for(int i=0; i<length1;i++){
	            if(rh1[i]==rh2[i]){
	                continue;
	            }
	            else{
	                return false;
	            }
	        }
	        return true;
	    }
	    return false;
	}
}