package Lesson_1.Java;

import org.junit.Test;

public class TestMain5_Ternarnii {
    @Test
    public void test() {

        String status;
        int score = 123;

        //1. Статндартный подход через if-else
        if (score >= 50) {
            status = "Сдал";
        } else {
            status = "Не сдал";
        }

        System.out.println("Результат IF:" + status);

        //2.идентичный результат через тернарный оператор
        String ternarnii = (score >=50)? "Сдал":"Не сдал";
        System.out.println("Результат тернарника " + ternarnii);


    }
}

/*
Результат = (условие) ? значение_если_да: значение_если_нет;
 */