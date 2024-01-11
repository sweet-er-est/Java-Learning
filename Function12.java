//not working
import java.util.*;

public class Function12{
    public static void main(String[] args){
            int pos = 0;
            int neg = 0;
            int zer = 0;
            
        while(true){
            System.out.print("Enter number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n>0){
                pos++;
            }
            else if(n<0){
                neg++;
            }
            else if(n==0){
                zer++;
            }
            else if(n == -1){
                break;
            }
        }
            System.out.print("The positive numbers are "+pos+"\n");
            System.out.print("The negative numbers are "+neg+"\n");
            System.out.print("The zeros are "+zer);
        
        

    }
}
