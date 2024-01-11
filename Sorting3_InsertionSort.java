import java.util.*;

public class Sorting3_InsertionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i=i+1){
            System.out.print("Enter the " + (i+1) + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        
        for(int i=1;i<size;i=i+1){
                int current = arr[i];
                int j = i-1;
                while(j>=0 && current<arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = current;
        }

        for(int i=0;i<size;i=i+1){
            System.out.print(arr[i]);
            
        }
    }
}