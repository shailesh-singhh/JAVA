package JAVA;
import java.util.*;

public class calculator {
    
public static void main(String args[]){
    System.out.println("Enter the first number :");
    Scanner sc = new Scanner(System.in);
    int num1 =sc.nextInt();
    System.out.println("Enter the second number :");
    int num2 =sc.nextInt();
    int sum = num1+num2;
    int diff = num2 -num1;
    int mult = num1 * num2;
    int div = num1/num2;
    System.out.println(sum);
    System.out.println(diff);
    System.out.println(mult);
    System.out.println(div);
}
}
