import java.util.*;

public class Recursion10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String strInp = sc.nextLine();
        StringBuilder strOut = new StringBuilder();
        int n = strInp.length();
        for(int i=0;i<n;i=i+1){
            strOut.append(strInp.charAt(n-i-1));
        }
        System.out.print(strOut);
    }
}