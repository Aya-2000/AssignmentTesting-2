package assignment2;
import java.util.*;
public class CheckEven {
    public  String Even(int x) {
        if(x%2==0) {
            System.out.println(x + " is even");
            return "The number is even";
        }
        else {
            System.out.println(x + " is odd");
            return "The number is odd";
        }


    }
}
