package P1;

public class P1def {
    private String inputString;

    public P1def(String inputString) {
        this.inputString = inputString;
    }

    void Display() {
        System.out.print("index:");
        for (int i = 0; i < inputString.length(); i++) {
            System.out.print("\t" + i);
        }
        System.out.print("\nchars:");
        for (int i = 0; i < inputString.length(); i++) {
            System.out.print("\t" + inputString.charAt(i));
        }
    }

}
