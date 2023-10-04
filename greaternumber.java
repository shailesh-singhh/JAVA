import java.util.*;
public class greaternumber {
    public static int greater(int a, int b){
    
    if(a>b){
        return a;
    }
    else {
        return b;
        
    }
   
    }
    public static void main(String args[]){
            System.out.println("Enter the two numbers :");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
     int b =sc.nextInt();
        int result = greater(a,b);
        System.out.println("The larger number is :"+result);
    }
}
