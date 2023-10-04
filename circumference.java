import java.util.*;
public class circumference {
    public static float circumf(int rad){
        float cir = 2*rad*22/7;
        return cir;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int rad = sc.nextInt();
        float result = circumf(rad);
        System.out.println("The circumference is :"+result);
    }
    
}
