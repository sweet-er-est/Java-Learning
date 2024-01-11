import java.util.*;

public class Recursion13 {
    
    public static int[] arrInput(int[] a,int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i=i+1){
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static boolean arrCheck(int[] a,int idx,int n){
        if(idx == n-1){
            return true;
        }
        
        if(a[idx]<=a[idx+1]){
            return arrCheck(a,(idx+1),n);
        }
        else{
            return false;
        }   
        
    }   
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        arr = arrInput(arr,size);
        System.out.print(Arrays.toString(arr));
        if(arrCheck(arr,0,size)){
            System.out.print("\nThe array is in increasing order");
        }
        else{
            System.out.print("\nThe array is not in increasing order");
        }
    }
}
