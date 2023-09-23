import java.util.*;

public class condition1 {

    public static void main(String arg[]){
     //   System.out.println("Enter the Age : ");
   //     Scanner sc = new Scanner(System.in);
 //       //int age =sc.nextInt();
      //  if(age>18){                                       //----Checking age is adult or not -----------//
    //        System.out.println("ADULT");
  //      }
//else{
  //  System.out.println("NOT AN ADULT");
//}
//System.out.println("Enter the number :");
  //  Scanner sc =new Scanner(System.in);
    //int x = sc.nextInt();
 //   if(x % 2 == 0){
   //     System.out.println("EVEN NUMBER");
                                                 //-----------CODE TO  CHEck wheather a number is even or odd -------//
   // }
    //else{
    //    System.out.println("ODD NUMBER");
    //}
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number :");
    int n1 = sc.nextInt();
    System.out.println("Enter the Second number :");
    int n2 = sc.nextInt();
    if(n1==n2){
        System.out.println("Equal");
    }
    else if(n1>n2){
        System.out.println( n1+" is greater .");
    }
    else{
        System.out.println("N1 is smaller");
    }
    }
}