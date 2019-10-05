package P10;

import java.util.Scanner;

public class indexOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.next();
        System.out.println("Enter the character");
        char ch = scanner.next().charAt(0);
        int n = str.indexOf(ch);
        System.out.println(n);
    }
}
