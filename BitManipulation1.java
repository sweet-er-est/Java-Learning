import java.util.*;

//GET operation

public class BitManipulation1{
    public static void main(String args[]){
        int num = 5;
        int pos = 3;
        int bitMask = 1<<pos;
        if((bitMask & num) == 0){
            System.out.print("The bit was zero");
        }
        else if((bitMask & num) == 1){
            System.out.print("The bit was one");
        }
    }
}