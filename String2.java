import java.util.*;

//concatenation
public class String2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.print(fullName);
    }
}
