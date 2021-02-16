import java.util.Scanner;

public class ForSample {
    public static void main(String ar[]) {
        System.out.println("Enter the limit");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            sum = sum + i;

        }
        System.out.println("Sum is " + sum);
    }

}
