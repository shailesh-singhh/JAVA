import java.util.*;
public class OddSum {
    public static int SumOfOdd(int n){                        //initializing a function

int sum = 0;
for(int i =1; i<=n ;i++){
    if(i%2==0){
        continue;
    }
    else{
        sum = sum +i;
    }
}
return sum;
    }
    public static void  main(String args[]){
Scanner sc = new Scanner(System.in);                              
System.out.println("Enter the Number till sum is needed:");     //printing message to enter  a number 

int n =sc.nextInt();
    int result = SumOfOdd(n); 
    System.out.println("The sum is :"+result);
    return;
    }
}
