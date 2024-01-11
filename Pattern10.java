import java.util.*;

public class Pattern10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i=i+1){
            for(int j=0;j<=i;j=j+1){
                System.out.print("*");
            }
            for(int k=0;k<n-i;k=k+1){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        for(int i=0;i<n;i=i+1){
            for(int j=n;j>i;j=j-1){
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
    }
}