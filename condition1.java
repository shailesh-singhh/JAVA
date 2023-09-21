import java.util.*;

public class condition1 {

    public static void main(String arg[]){
        System.out.println("Enter the Age : ");
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        if(age>18){
            System.out.println("ADULT");
        }
else{
    System.out.println("NOT AN ADULT");
}
    }
}