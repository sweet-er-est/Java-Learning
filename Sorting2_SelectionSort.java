import java.util.*;

public class Sorting2_SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("ENter the "+ (i+1) + " element of the array: ");
            arr[i] = sc.nextInt();
        }
            
        for(int i=0;i<size-1;i=i+1){
            int smallest = i;
            for(int j = i+1;j<size;j=j+1){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
    }

    for(int i=0;i<size;i=i+1){
    System.out.print(arr[i]);
}
}
}
