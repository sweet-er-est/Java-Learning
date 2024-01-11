import java.util.*;

public class Function1{

    public static void printName(String x){
        System.out.print(x);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        printName(name);
    }
}
