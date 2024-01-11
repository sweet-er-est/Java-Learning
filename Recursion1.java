import java.util.*;

public class Recursion1{

    public static void printNum(int x){
        if(x == 0){
            return;
        }
        System.out.print(x);
        printNum(x-1);
            
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printNum(n);

    }
}