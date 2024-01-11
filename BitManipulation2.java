import java.util.*;

// SET bit

public class BitManipulation2 {
    public static void main(String args[]){
        int num = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        int newNum = bitMask | num;
        System.out.print("The new number is " + newNum);
    }
}
