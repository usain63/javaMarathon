package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        setArray(0,30, ints);
        System.out.println(ints);
        setArray(300,500, ints);
        System.out.println(ints);
    }
    static void setArray (int start, int finish, List<Integer> list) {
        for (int i = start; i <= finish; i++){
            if (i % 2 == 0)
                list.add(i);
        }
    }
}
