import java.util.*;
// calculate x raised to power n when stack range is log n;
// theory in copy...
public class Recursion8{
    public static int calcPower(int x, int n){
        if(n == 0){
            return 1;
        }

        if(n%2 == 0){
            int ans = calcPower(x,n/2)*calcPower(x,n/2);
            return ans;
        }
        else{
            int ans = calcPower(x,n/2)*calcPower(x,n/2)*x;
            return ans;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value x: ");
        int num = sc.nextInt();
        System.out.print("Enter the value n: ");
        int pow = sc.nextInt();
        System.out.print(calcPower(num,pow));
    }
}