import java.util.*;

public class Array3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ENter the size of array: ");
        int size = sc.nextInt();
        int marks[] = new int[size];
        for(int i=0;i<size;i=i+1){
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<size;i=i+1){
            System.out.print(marks[i] +"\n");
        }
    }
}
