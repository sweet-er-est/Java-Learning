import java.util.*;

//substring ..

public class String6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();

        //string.substring(beg index , end index)
        //ending index in exclusive ..

        System.out.print("Enter beginning index: ");
        int a = sc.nextInt();
        System.out.print("Enter ending string: ");
        int b = sc.nextInt();
        
        System.out.print("The substring is " + str.substring(a,b));
    }
}
