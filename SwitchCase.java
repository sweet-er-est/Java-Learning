import java.util.*;

public class SwitchCase{
    public static void main(String[] args){
        System.out.print("Enter 1 for Hellp, 2 for Namaste, 3 for Boonjour\n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1 : {System.out.print("Hello");
                        break;}
            case 2 : {System.out.print("Namaste");
                        break;}
            case 3 : {System.out.print("Bonjour");
                        break;}
            case 4 : {System.out.print("Invalid input");
                        break;}
        }
    }
}