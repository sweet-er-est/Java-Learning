import java.util.*;
// raise x to power n and stack range is n
public class Recursion6 {

    public static void raisePower(int x , int n, int i, int ans){
        if(i>n){
            System.out.print(ans);
            return;
        }
        ans = ans * x;
        i++;
        raisePower(x,n,i,ans);
    }

    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the power to which the number has to be raised: ");
        int pow = sc.nextInt();
        int ans = 1;
        raisePower(num,pow,i,ans);
    }
}
