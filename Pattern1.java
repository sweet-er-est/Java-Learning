import java.util.*;

public class Pattern1{
    public static void main(String[] args){
        System.out.print("ENter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i=i+1){
            for(int j=0;j<n;j=j+1){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}