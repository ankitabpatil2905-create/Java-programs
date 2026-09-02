import java.util.Scanner;

public class Q9_ReadPrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("You entered: " + text);

        sc.close();
    }
}
