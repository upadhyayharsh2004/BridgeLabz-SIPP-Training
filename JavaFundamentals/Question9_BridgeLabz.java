import java.util.*;
class Question9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius_of_earth_in_km=6378;
        double Volume_of_earth_in_km3=1.333*3.14*radius_of_earth_in_km;
        double Volume_of_earth_in_miles3=Volume_of_earth_in_km3*0.239913;
        System.out.println("The volume of earth in cubic Kilometers is"+" "+Volume_of_earth_in_km3+" "+"and cubic miles is"+" "+Volume_of_earth_in_miles3+" ");
        //or we can do this for precise output
        //System.out.println("The volume of earth in cubic Kilometers is"+" "+Math.ceil(Volume_of_earth_in_km3)+" "+"and cubic miles is"+" "+Math.ceil(Volume_of_earth_in_miles3)+" ");
    }
}

