package P9;

import java.util.Scanner;

public class AbsoluteWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.nextLine();
        char[] s2 = str.toCharArray();
        int Upperweight = 0;
        int Lowerweight = 0;
        int absoluteWeight;
        for (int i = 0; i < str.length(); i++) {
            if (s2[i] >= 65 && s2[i] <= 90) {
                Upperweight += s2[i];
            } else if (s2[i] >= 97 && s2[i] <= 122) {
                Lowerweight += s2[i];
            }
        }
        absoluteWeight = Math.abs(Upperweight - Lowerweight);
        System.out.println("Total Weight is: " + absoluteWeight);

    }
}
