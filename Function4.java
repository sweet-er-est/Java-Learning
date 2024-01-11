import java.util.*;

public class Function4{

    public static int factorial(int x){
        int fact = 1;
        if(x<0){
            System.out.print("Invalid input");
            return 0;
        }
        else{for(int i=1;i<=x;i=i+1){
            fact = fact*i;
        }
        return fact;}
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number whose factorial has to be found: ");
        int num = sc.nextInt();
        if(factorial(num) != 0){
            System.out.print("The factorial is "+factorial(num));
        }
    }
}