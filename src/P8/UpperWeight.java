package P8;

import java.util.Scanner;

public class UpperWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.next();
        char[] s2 = str.toCharArray();
        int Upperweight = 0;
        for (int i = 0; i < str.length(); i++) {
            if (s2[i] >= 65 && s2[i] <= 90) {
                Upperweight += s2[i];
            }
        }
        System.out.println(Upperweight);

    }
}
