package session10_dsa_list;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new List(5);
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.indexOf(i));
        }

    }
}
