import java.util.*;
// print numbers
public class Recursion2{

    public static void printNum(int x,int a){
        if(x > a){
            return;
        }
        System.out.print(x);
        printNum(x+1,a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        System.out.print("Enter the value of n till where you have to print numbers from 1: ");
        int num = sc.nextInt();
        printNum(x,num);
    }
}