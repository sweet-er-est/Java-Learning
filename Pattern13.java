import java.util.*;

public class Pattern13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 1;
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i=i+1){
            for(int j=0;j<n-i-1;j=j+1){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k=k+1){
                System.out.print(a+" ");
            }
            a++;
            System.out.print("\n");
        }
    }
}