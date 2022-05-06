package assignment2;
import java.util.*;
public class MinMax {


    public  int Maximum(int x[]) {
            int max=0;

        for (int i = 0; i < x.length; i++) {

                if (x[i]>max)

                    max=x[i];

        }
        System.out.println("Maximum integer is "+ max);
        return max;
    }
    public  int Minimum(int x[]) {
        int min=x[0];
        for (int i = 0; i < x.length; i++) {
                if (x[i] < min)
                    min=x[i];
            }
        System.out.println("Minumum integer is "+ min);

        return min;
    }
}
