package P6;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = scanner.nextLine();
        String s2 = s1.toUpperCase();
        System.out.println("Upper case string: " + s2);
    }
}
