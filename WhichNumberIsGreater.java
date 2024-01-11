import java.util.*;

public class WhichNumberIsGreater{
    public static void main(String[] args){
        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();

        if(a==b){
            System.out.print(a + " is equal to "+b);
        }
        else if(a>b){
            System.out.print(a + " is greater than "+b);
        }
        else{
            System.out.print(a + " is smaller than " + b);
        }
    }
}