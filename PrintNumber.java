import java.util.*;

public class PrintNumber{
    public static void main(String[] args){
        System.out.print("Enter till where the numbers has to be printed: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1;i<=num;i=i+1){
            System.out.print(i + "\n");
        }
    }
}