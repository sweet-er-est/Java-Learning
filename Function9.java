import java.util.*;

public class Function9{
    public static int voteOrNot(int x){
        if(x>=18){
            return 1;
        }
        else{
            return 0;
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if (voteOrNot(age)==1) {
                System.out.print("Eligible to vote");                
            }
            else{
                System.out.print("Not eligible to vote");
            }
        }
}