package P1;

import java.util.Scanner;

public class P1exe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next().trim();
        P1def obj = new P1def(inputString);
        obj.Display();
    }
}
