import java.util.*;

public class Function6{

    public static void printNum(int a){
        for(int i=1;i<=a;i=i+1){
            if(i%2==0){
                continue;
            }
            else{
                System.out.print(i+"\n");
            }
        }
    }

        public  static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a numbers: ");
            int num = sc.nextInt();
            
            printNum(num);
        }
} 
