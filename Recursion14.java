import java.util.*;

public class Recursion14 {
    public static void fcn(int a[], int n, char c,int idx){
        if(idx == n){
            System.out.print(a);
        }
        if(a[idx] == c){
            char temp;
            temp = a[n-idx-1];
            a[n-idx-1] = c;
            
            fcn(a,n,c,idx+1);
        }
    }

    public static int[] arrInp(int a[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i=i+1){
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of array: ");
        arr = arrInp(arr,size);
        System.out.print("Enter the element which you have to group to the end: ");
        char c = sc.next().charAt(0);
        System.out.print(Arrays.toString(arr));

    }
}
