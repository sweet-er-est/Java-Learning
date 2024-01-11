import java.util.*;

public class Pattern12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the value of n: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i=i+1){
            for(int j=0;j<n-i-1;j=j+1){
                System.out.print(" ");
            }
            for(int k=0;k<n;k=k+1){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}