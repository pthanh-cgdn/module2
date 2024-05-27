package session13_search_algorithm;

import java.util.ArrayList;

public class Search {
    public static int search(ArrayList<Integer> array, int X) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == X) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int NUMBER = 10;
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        int X = (int) Math.floor(Math.random()*20);
        System.out.println("X: "+X);
        System.out.println(search(list,X));
    }
}
