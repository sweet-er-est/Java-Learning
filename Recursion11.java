import java.util.*;

public class Recursion11 {
    public static void reverseStr(String inp, int idx){
        if(idx == 0){
            System.out.print(inp.charAt(idx));
            return;
        }
        System.out.print(inp.charAt(idx));
        reverseStr(inp,idx-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inp = sc.nextLine();
        int n = inp.length();
        reverseStr(inp,n-1);
    }
}
