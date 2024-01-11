import java.util.*;

public class StringBuilder2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter your string: ");
        StringBuilder str = new StringBuilder();
        String inp = sc.nextLine();
        str.append(inp);
        int n = str.length();
        
        for(int i=0;i<n/2;i=i+1){
            int start = i;
            int last = n-1-i;
            
            char startChar = str.charAt(start);
            char lastChar = str.charAt(last);

            str.setCharAt(start , lastChar);
            str.setCharAt(last , startChar);

        }
        System.out.print(str);
    }
}