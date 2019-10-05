package p5;

import java.util.Scanner;

public class SubstringReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = scanner.nextLine();
        System.out.println("Enter the substring");
        String s2 = scanner.next();
        String s3 = s1.replace(s2, " ");//replacing with space as not mentioned in question
        System.out.println(s3);
    }
}
