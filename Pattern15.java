import java.util.*;

public class Pattern15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i=i+1){
            for(int j=0;j<n-i;j=j+1){
                System.out.print(" ");
            }
            for(int k=i;k>= 0;k=k-1){
                System.out.print(k+1);
                
            }
            for(int a=0;a<i;a=a+1){
                System.out.print(a+2);
            }
            
            System.out.print("\n");
        }
        
        
    }
}
