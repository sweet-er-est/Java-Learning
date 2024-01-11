import java.util.*;

public class Function2{

    public static int sum(int x, int y){
        int sum = x+y;
        return sum;
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("The sum is "+sum(a,b));
    }
}