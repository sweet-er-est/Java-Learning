import java.util.*;

public class Function8 {

    public static double printArea(double r){
        return (3.14*r*r);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of a circle: ");
        double r = sc.nextDouble();
        System.out.print("The area is = "+printArea(r));
    }
    

}