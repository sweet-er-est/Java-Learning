import java.util.*;

public class ForLoop1{
    public static void main(String[] args){
        System.out.print("Enter the word which has to be printed: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        System.out.print("ENter the amount of times the word has to be printed: ");
        int num = sc.nextInt();

        for(int i=0;i<num;i=i+1){
            System.out.print(word + "\n");
        }
    }   
}