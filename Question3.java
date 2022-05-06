package assignment2;
import java.util.*;
public class Question3 {
    public String state = "NORMAL";
    public String state1 = "TIME";
    public int N = 0, H = 0, D = 1, M = 1, X = 2000;

    public String[] input(char f) {

        if (state.equals("NORMAL")) {

                if (f == 'c') {
                    state = "UPDATE";
                    state1 = "min";
                }
                if (f == 'b') {
                    state = "ALARM";
                    state1 = "Alarm";
                }
                if (f == 'a') {
                    if (state1.equals("TIME")) {
                        state1 = "DATE";
                    } else {
                        state1 = "TIME";
                    }
                }
            }


        if (state.equals("UPDATE")) {
            if (f == 'd') {
                state = "NORMAL";
                state1 = "TIME";
            }

                if (f == 'a') {
                    if (state1.equals("year")) {
                        state = "NORMAL";
                        state1 = "TIME";
                    }
                    if (state1.equals("month")) {
                        state1 = "year";
                    }
                    if (state1.equals("day")) {
                        state1 = "month";
                    }
                    if (state1.equals("hour")) {
                        state1 = "day";
                    }
                    if (state1.equals("min")) {
                        state1 = "hour";
                    }
                }

                if (f == 'b') {
                    if (state1.equals("min")) {
                        N++;
                        if (N >= 60) {
                            N = 0;
                        }
                    }
                    if (state1.equals("hour")) {
                        H++;
                        if (H >= 24) {
                            H = 0;
                        }
                    }
                    if (state1.equals("day")) {
                        D++;
                        if (D > 31) {
                            D = 1;
                        }
                    }
                    if (state1.equals("month")) {
                        M++;
                        if (M > 12) {
                            M = 1;
                        }
                    }
                    if (state1.equals("year")) {
                        X++;
                        if (X > 2100) {
                            X = 2000;
                        }
                    }
                }
            }


        if (state.equals("ALARM")) {
            switch(f) {
                case 'd':{

                    state = "NORMAL";
                    state1 = "TIME";
                }
                case 'a':{

                    state1 = "Chime";
                }
            }
        }

        return new String[]{state, state1, String.valueOf(X) + "-" + String.valueOf(M) + "-" + String.valueOf(D), String.valueOf(H) + ":" + String.valueOf(N)};
    }
}
