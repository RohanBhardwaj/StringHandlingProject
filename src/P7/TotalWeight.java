package P7;

import java.util.Scanner;

public class TotalWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.nextLine();
        char[] s2 = str.toCharArray();
        int Totalweight = 0;
        for (int i = 0; i < str.length(); i++) {
            Totalweight += (int) s2[i];
        }
        System.out.println("Total Weight is: " + Totalweight);

    }
}
