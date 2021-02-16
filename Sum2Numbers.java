import java.util.Scanner;

public class Sum2Numbers {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Result = " + c);
    }
}
