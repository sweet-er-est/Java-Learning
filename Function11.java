import java.util.*;

public class Function11{
    public static void printFibo(int n){
        int a = 0;
        int b = 1;
        int sum = a+b;
        int temp;
        if(n==0 || n<0){
            System.out.print("Invalid input");
        }
        else if(n==1){
            System.out.print(a);
        }
        else if(n==2){
            System.out.print(a +" , " + b);
        }
        else if(n==3){
            System.out.print(a +" , " + b +" , " + sum);
        }
        else{
            System.out.print(a +" , " + b +" , " + sum);
        for(int i=4;i<=n;i=i+1){
            a = b;
            b = sum;
            sum = a+b;
            System.out.print(" , " + sum);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibo(n);
    }
}
