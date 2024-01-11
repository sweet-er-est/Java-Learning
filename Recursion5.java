import java.util.*;
//FIBONACI series
public class Recursion5 {

    public static void printFibo(int a, int b, int sum, int n,int i){
        if(i == n){
            return;
        }
        System.out.print(sum + " ");
        a = b;
        b = sum;
        sum = a+b;
        i++;
        printFibo(a,b,sum,n,i);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int i = 2;
        int sum = a+b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print(a + " ");
        System.out.print(b + " ");
        printFibo(a,b,sum,n,i);
    }
}
