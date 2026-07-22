package Lesson_1.Java;

import org.junit.Test;

public class TestMain7_Methods {
    @Test
    public void test() {
        printFive();
        System.out.println(returnFive());
        System.out.println(plus(2,2));

    }

    void printFive() {
        System.out.println("5");
    }

    int returnFive(){
        return 5;
    }

    int plus(int a, int b) {
        return a + b;
    }
}
