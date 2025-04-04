import java.util.Scanner;

class ascii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = in.next().trim().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
            System.out.println("Lowercase = " + (char)(ch + 32));
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
            System.out.println("Uppercase = " + (char)(ch - 32));
        } else {
            System.out.println("Not an alphabet character.");
        }
    }
}
