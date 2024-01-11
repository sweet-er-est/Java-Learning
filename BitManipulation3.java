import java.util.*;

// CLEAR bit

public class BitManipulation3{
    public static void main(String args[]){
        int num = 5;
        int pos = 2;
        int bitMask = 1<<pos ;
        int newNum = (~(bitMask)) & num;
        System.out.print(newNum);
    }
}