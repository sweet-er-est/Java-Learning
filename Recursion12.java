import java.util.*;

public class Recursion12 {
    public static int first = -1;
    public static int last = -1;
    
    public static void findOccur(String str , int idx , char element){
        if(idx == str.length()){
            System.out.print("The first occurence is in position: " + (first+1) + "\n");
            System.out.print("The last occurence is in position: " + (last+1));
            return;
        }
        char currentChar = str.charAt(idx);
        
        if(currentChar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccur(str,idx+1,element);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inp = sc.nextLine();
        
        System.out.print("Enter the letter whose occurence has to be found: ");
        char element = sc.next().charAt(0);
        findOccur(inp , 0 , element);

    }
}
