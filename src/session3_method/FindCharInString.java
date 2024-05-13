package session3_method;

import java.util.Scanner;

public class FindCharInString {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sentence = input.nextLine();
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("Number of characters: " + count);
    }
}
