package p4;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        char[] s2 = s1.toCharArray();
        int c = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                if (c == 0) {
                    s2[i] = '*';
                }
                if (c == 1) {
                    s2[i] = '^';
                }
                if (c == 2) {
                    s2[i] = '!';
                }
                c++;
            }
        }
        System.out.println(s2);
    }
}
