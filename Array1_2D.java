import java.net.SocketPermission;
import java.util.*;

public class Array1_2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0;i<r;i=i+1){
            for(int j=0;j<c;j=j+1){
                System.out.print("Enter the numbers: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i=i+1){
            for(int j=0;j<c;j=j+1){
                
                System.out.print(arr[i][j] + "\t");
                
            }
            System.out.print("\n");
        }
        
        System.out.print("Enter the number which has to be found: ");
        int key = sc.nextInt();
        int flag = 0;
        for(int i=0;i<r;i=i+1){
            for(int j=0;j<c;j=j+1){
                if(arr[i][j]==key){
                System.out.print(key + " h ass been found in position "+(i+1)+","+(j+1));
                flag = 1;
                }
            }
        }
        if(flag == 0){
            System.out.print(key + " not found in the array");
        }
    }
}
