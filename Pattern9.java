import java.util.*;

public class Pattern9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i=i+1){
            for(int j=0;j<=i;j=j+1){
                if(i%2==0){
                    if(j%2==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                else{
                    if(j%2==0){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}