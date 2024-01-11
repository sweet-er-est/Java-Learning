import java.util.*;

public class TakingInputAndAdding{
    public static void main(String[] args){
        System.out.print("Enter two numbers that has to be added: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("The sum is = "+(a+b));
    }
}