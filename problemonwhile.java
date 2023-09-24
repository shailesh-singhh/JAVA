package JAVA;
import java.util.*;
public class problemonwhile {
    
    public static void main(String args[]){
        System.out.println("Enter the no. Whose table you need :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       // int i =1;
        //while(i<=n){
          //  System.out.println(i);
           // i++;
       // }
      // int sum =0;
       //for(int i=1;i<=n;i++){
       // sum+=i;
      // }
      // System.out.println(sum);
      System.out.println("The table is:");
      for(int i=1;i<=10;i++){
        System.out.println(i*n);
      }
    }
}
