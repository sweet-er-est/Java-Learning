import java.util.*;

//comparing 2 strings ...

public class String5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();
    
        //s1 > s2 -> +ve
        //s1 == s2 -> 0
        //s1 < s2 -> -ve

        if(s1.compareTo(s2) > 0){
            System.out.print(s1 + " (string 1) is greater than (string 2) " + s2);
        }
        else if(s1.compareTo(s2) == 0){
            System.out.print(s1 + " (string 1) is equal to (string 2) " + s2);
        }
        else{
            System.out.print(s2 + " (string 1) is greater than (string 2) " + s1);
        }
    }
}