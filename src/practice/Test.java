package Java8.practice;

public class Test {
    public static void main(String[] args) {
        int a = 5;

        switch (a++) {
            case 5:
                System.out.println("First");
            case 6:
                System.out.println(a++);
                break;
            case 7:
                System.out.println("YES");
        }
        System.out.println();
    }
}
