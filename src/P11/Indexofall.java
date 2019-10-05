package P11;

import java.util.Scanner;

public class Indexofall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.next();
        System.out.println("Enter the character");
        char ch = scanner.next().charAt(0);
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == ch) {
                System.out.println(i);
            }
        }

    }
}
