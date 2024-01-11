import java.util.*;

public class IsOddOrEven{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.print(num + " is Even");
        }
        else{
            System.out.print(num + " is Odd");
        }
    }
}