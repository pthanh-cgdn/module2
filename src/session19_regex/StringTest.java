package session19_regex;

public class StringTest {
    public static void main(String[] args) {
//        StringBuilder s = new StringBuilder(new String("Hello"));
//        StringBuilder w = new StringBuilder(new String(" World"));
//        StringBuilder v = s;
//        s.append(w);
//        System.out.println(v);
//        System.out.println(s);
        String s = new String("Hello World");
        String v = "Hello World";
        System.out.println(s.equals(v));
        s.concat(v);
        System.out.println(s);
        s = v.substring(6);
        System.out.println(v);
        System.out.println(s);
    }
}
