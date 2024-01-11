import java.util.Scanner;
public class gitJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        if (first < second) {
            for (int i = first + 1; i < second; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = second + 1; i < first; i++) {
                System.out.print(i + " ");
            }
        }
    }


}
