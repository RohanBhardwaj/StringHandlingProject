package P2;

import java.util.Scanner;

public class pro2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int index = Integer.parseInt(scanner.next().trim());
        System.out.print("Substring: " + inputString.substring(index));
    }
}

