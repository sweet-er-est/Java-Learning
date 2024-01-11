import java.util.*;

public class StringBuilder1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("Enter your string: ");
        String inp = sc.nextLine();
        sb.append(inp);
        StringBuilder temp = new StringBuilder();
        int n = sb.length();
        for(int i=n-1;i>=0;i--){
            temp.append(sb.charAt(i));
        }
        System.out.print("THe reverse of the input string is: " + temp);

    }
}
