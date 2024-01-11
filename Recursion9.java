import java.util.*;

public class Recursion9{
    public static void towerOfHanoi(int n , String src , String helper , String dest){
        if(n == 1){
            System.out.print("transferred disk " + n + " from " + src + " to " + dest + "\n");
            return;
        }
        towerOfHanoi(n-1 , src , dest , helper);
        System.out.print("transferred disk " + n + " from " + src + " to " + dest + "\n");
        towerOfHanoi(n-1 , helper , src , dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        towerOfHanoi(n,"Source" , "Helper" , "Destination");
    }
}