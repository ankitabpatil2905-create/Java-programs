public class Q3_ControlStatements {
    public static void main(String[] args) {

        int number = 10;

        // if-else
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        // for loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // while loop
        System.out.println("While loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // do-while loop
        System.out.println("Do-while loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        // switch-case
        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
