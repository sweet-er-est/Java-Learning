import java.util.*;

//printing character by character

public class String4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you full name: ");
        String name = sc.nextLine();
        System.out.print("Your name is printed character by character: ");

        for(int i=0;i<name.length();i=i+1){
            System.out.print(name.charAt(i));
        }
    }
}