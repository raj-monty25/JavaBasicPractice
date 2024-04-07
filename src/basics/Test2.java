public class Test2 {

    private static int value = 20;
    public  static int s =15;
    public static int temp = 10;

    public static class Nested {
            private void display() {
                System.out.println(temp + s + value);
            }
    }

    public static void main(String[] args) {
        Test2.Nested inner = new Test2.Nested();
        inner.display();
    }
}
