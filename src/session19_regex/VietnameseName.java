package session19_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VietnameseName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        Pattern pattern = Pattern.compile("^[A-Z][a-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]{1,6}(\\s[A-Z][a-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]{1,6}){1,10}");
        do {
            System.out.println("Vui lòng nhập tên (Tiếng Việt có dấu) của bạn:");
            name = sc.nextLine();
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("Chào bạn: "+ name);
                break;
            }
        } while(true);
    }
}
