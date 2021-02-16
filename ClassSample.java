public class ClassSample {
    public static void main(String args[]) {
        Hello h1 = new Hello();
        Hello h2 = new Hello();

        h1.a = 10;
        h2.a = 20;
        h1.b = 30;
        h2.b = 40;

        System.out.println("h1-a :" + h1.a + " h2-a :" + h2.a + " h1-b :" + h1.b + " h2-b :" + h2.b);
    }
}
