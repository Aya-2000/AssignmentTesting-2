package assignment2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Question3Test {
    @Nested
    class EdgeCoverage {

        Question3 mainObj;

        @BeforeEach
        public void setup() {
            mainObj = new Question3();
        }

        @Test
        public void Test1() {
            String[] res = mainObj.input('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("DATE", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void Test2() {
            mainObj.input('a');
            String[] res = mainObj.input('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void Test3() {
            mainObj.input('a');
            mainObj.input('a');
            String[] res = mainObj.input('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void Test4() {
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }

        @Test
        public void Test5() {
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }

        @Test
        public void Test6() {
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void Test7() {
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void Test8() {
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-2", res[2]);
            assertEquals("1:1", res[3]);
        }
    }

    @Nested
    class ADUP{

        Question3 mainObj;

        @BeforeEach
        public void setup(){
            mainObj = new Question3();
        }

        @Test
        public void ADUPtest1(){
            String[] res = mainObj.input('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void ADUPtest2(){
            mainObj.input('c');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }

        @Test
        public void ADUPtest3(){
            mainObj.input('c');
            mainObj.input('b');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:2", res[3]);
        }

        @Test
        public void ADUPtest4(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:2", res[3]);
        }

        @Test
        public void ADUPtest5(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:2", res[3]);
        }

        @Test
        public void ADUPtest6(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void ADUPtest7(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            String[] res = mainObj.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void ADUPtest8(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-2", res[2]);
            assertEquals("2:2", res[3]);
        }
    }
}