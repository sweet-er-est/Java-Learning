import java.util.*;

public class Function3{

    public static int product(int x, int y){
        int product = x*y;
        return product;
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("The product is "+product(a,b));
    }
}