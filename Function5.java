import java.util.*;

public class Function5{

    public static int avg(int a,int b,int c){
        return ((a+b+c)/3);
    }

        public  static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 3 numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            System.out.print("The avg of 3 nummbers are: "+avg(num1,num2,num3));
        }
}