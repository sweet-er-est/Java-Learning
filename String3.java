import java.util.*;

//string length

public class String3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String newString = sc.nextLine();
        System.out.print("The length of the string you entered is: " + newString.length());
    }
}