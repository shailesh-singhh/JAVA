import java.util.*;
public class pattern1 {
    public static void main(String args[]){
System.out.println("Enter the row");
Scanner sc =new Scanner(System.in);
int r =sc.nextInt();
System.out.println("Enter the number of columns: ");
int c =sc.nextInt();
for(int i=1;i<=r;i++){
    for(int j=1;j<=c;j++){
    System.out.print("*");
}
   System.out.println(); 
}
    }
}
