package Lesson_1.Java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMain6_Arrays_ArraysList {
    @Test
    public void test() { //Массив
        String[] flowers  = {"Rose","Fial","Sunflower"};
        String[] berries = new String[10];

        flowers[0] = "Blueflower";

        berries[0] = "Blueberry";
        berries[1] = "Blackberry";
        berries[2] = "Redberry";

        System.out.println(flowers[0] + " " + flowers [1] + " " + flowers[2] );
        System.out.println(berries[0] + " " + berries [1] + " " + berries[2] );
    }

    @Test
    public void test2() { //Список
        List<String> flowers = List.of("Rose","Fial","Sunflower");
        List<String> berries = new ArrayList<>();

        berries.add(0, "redberry");
        berries.add("Blackberry");
        berries.add(2,"blueberry");


        System.out.println(flowers.get(0) + " " + flowers.get(1) + " " + flowers.get(2));
        System.out.println(berries.get(0) + " " + berries.get(1) + " " + berries.get(2));
    }
}
