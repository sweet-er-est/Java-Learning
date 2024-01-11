import java.util.*;

public class Pattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        for(int i=0;i<n;i=i+1){
            for(int j=0;j<m;j=j+1){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.print("\n");
        }
        
    }
}