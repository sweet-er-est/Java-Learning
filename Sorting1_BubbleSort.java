import java.util.*;

public class Sorting1_BubbleSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i=i+1){
            System.out.print("Enter the " + (i+1) + " element of array: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<(size-1);i=i+1){
            for(int j=0;j<(size-i-1);j=j+1){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
                
            
        }
        for(int i=0;i<size;i=i+1){
            System.out.print(arr[i]);
        }
    }
}