package Lesson_1.Java;

import org.junit.Test;

public class TestMain4_IF_ELSE {
    @Test
    public void printTest() {
        int x = 5;
        int y = 5;

        if ((x > y) && (y>1)) {
            System.out.println("Bigger!");
        } else if (x<=y) {
                System.out.println("Smaller!");
            }
        }
    }




/*
&& (И) - Оба условия верны
|| (ИЛИ) - хотя бы одно верно
! (НЕ) - инверсия результат

if (условие) {......}
else if (другое условие) {......}
else {....}
 */