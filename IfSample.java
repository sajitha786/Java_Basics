import java.util.Scanner;

public class IfSample {
    public static void main(String a[]) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }
    }
}
