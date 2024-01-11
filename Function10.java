import java.util.*;

public class Function10{
    public static double powerFnt(int x,int y){
        return (Math.pow(x,y));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        System.out.print(powerFnt(num,pow));
    }
}