import java.util.*;

public class Array4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of ARRAY: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int flag = 0;
        for(int i=0;i<size;i=i+1){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number which has to be searched: ");
        int key = sc.nextInt();
        for(int i=0;i<size;i=i+1){
            if(arr[i]==key){
                System.out.print(key + " has been found in position " + (i+1));
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.print(key + " not found in the array");
        }
    }
}
