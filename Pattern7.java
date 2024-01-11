import java.util.*;

public class Pattern7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i=i+1){
            for(int j=0;j<n-i;j=j+1){
                System.out.print(j+1);
            }
            System.out.print("\n");
        }
        
    }
}