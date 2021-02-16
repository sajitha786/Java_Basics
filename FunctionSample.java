import java.util.Scanner;

public class FunctionSample {
    public static void main(String ar[]) {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = sum(num1, num2);
        System.out.println("Result : " + result);
    }

    static int sum(int no1, int no2) {
        int sum = no1 + no2;
        return sum;

    }
}
