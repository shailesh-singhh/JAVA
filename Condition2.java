package JAVA;
import java.util.*;

public class Condition2 {
    //--Determing wheather the number is even or odd
    public static void main(String args[]){
    System.out.println("Enter the number :");
    Scanner sc =new Scanner(System.in);
    int x = sc.nextInt();
    if(x % 2 == 0){
        System.out.println("EVEN NUMBER");

    }
    else{
        System.out.println("ODD NUMBER");
    }
}
}