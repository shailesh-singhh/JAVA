package JAVA;
import java.util.*;
public class usingloops {
    public static void main(String args[]){
        System.out.println("Enter the number till which we want to print numbers: ");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
    
}
