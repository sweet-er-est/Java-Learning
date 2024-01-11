import java.util.*;
// sum of n numbers
public class Recursion3 {

    public static void printSum(int sum, int x , int n){
        if(x>n){
            System.out.print(sum);
            return;
        }
       
        sum = sum + x;
        printSum(sum,x+1,n);
        
        
    }

    public static void main(String[] args) {
        int x = 1 , sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printSum(sum,x,n);
    }
}
