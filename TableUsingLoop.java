import java.util.*;

public class TableUsingLoop{
    public static void main(String[] args){
        System.out.print("Enter the number whose table has to be printed: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1;i<11;i=i+1){
            System.out.print(num + " * " + i +" = " + (num*i) + "\n");
        }
    }
}