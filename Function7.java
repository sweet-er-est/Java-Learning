import java.util.*;

public class Function7{

    public static int printGreatNum(int a,int b){
        if(a==b){
            return 0;
        }
        else if(a<b){
            return b;
        }
        else{
            return a;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(printGreatNum(num1,num2)==0){
            System.out.print("Both numbers are equal = "+num1);
        }
        else{
            System.out.print("The greater number is = "+printGreatNum(num1,num2));
        }
    }
}