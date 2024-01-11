import java.util.*;
// FACTORIAL calculation
public class Recursion4{

    public static void calcFac(int i , int n , int fac){
        if(i>n){
            System.out.print("The factorial of " + n + " is " + fac);
            return;
        }
        fac = fac*i;
        calcFac(i+1,n,fac);
    }

    public static void main(String[] args) {
        int a = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n whose factorial has to be calculated: ");
        int n = sc.nextInt();
        int fac = 1;
        calcFac(a,n,fac);
    }
}