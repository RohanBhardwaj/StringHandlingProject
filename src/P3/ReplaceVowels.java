package P3;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        //replace replaces all the occurrence of oldChar with newChar
        s1 = s1.replace('a', '*');
        s1 = s1.replace('e', '*');
        s1 = s1.replace('i', '*');
        s1 = s1.replace('o', '*');
        s1 = s1.replace('u', '*');
        System.out.println(s1);
    }
}
