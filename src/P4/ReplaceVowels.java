package P4;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        char[] s2 = s1.toCharArray(); //converting the given string into array of characters
        int c = 0; //counter to count the occurrence of vowel in the array
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                if (c == 0) {
                    s2[i] = '*'; //first occurrence is replaced with *
                }
                if (c == 1) {
                    s2[i] = '^'; //second occurrence is replaced with ^
                }
                if (c == 2) {
                    s2[i] = '!'; //third occurrence is replaced with !
                }
                c++;
            }
        }
        System.out.println(s2);
    }
}
