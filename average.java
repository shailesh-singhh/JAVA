import java.util.*;
public class average {
    public static void AvgOfNumbers(int a,int b, int c){
        int avg;
        avg=(a+b+c)/3;
   System.out.println("The Average of the given number is :"+avg);
      }
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        AvgOfNumbers(a,b,c);
           
      }
}
