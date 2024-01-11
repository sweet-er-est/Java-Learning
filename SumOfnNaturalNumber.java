import java.util.*;

public class SumOfnNaturalNumber{
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter till where the sum has to be calculated: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i=i+1){
            sum = sum + i;
        }
        System.out.print("The sum of first " + n + " natural numbers is " + sum);
    }
}