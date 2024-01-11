import java.util.*;
// calculate x raised to power n and stack range is n
public class Recursion7{
    public static int calcPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int ans = x*calcPower(x,n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the number: ");
        int num = sc.nextInt();
        System.out.print("ENter the power: ");
        int pow = sc.nextInt();
        System.out.print(calcPower(num,pow));
    }
}