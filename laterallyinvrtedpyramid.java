import java.util.*;
public class laterallyinvrtedpyramid {
    public static void main (String args[]){
        System.out.println("Enter the nuber ");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n-1; j++){
            System.out.print(" ");
            }
        for(int j =1;j<=i;j++){
          System.out.println("*");
        }
       // System.out.println();
    }
}
    
}
