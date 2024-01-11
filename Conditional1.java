import java.util.*;

public class Conditional1{
    public static void main(String[] args){
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age<18){
            System.out.print("Not eligible to vote");

        }
        else{
            System.out.print("Eligible to vote");
        }
    }
}