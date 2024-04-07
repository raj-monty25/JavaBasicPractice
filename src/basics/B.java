public class B {

    public void f(int[] array) {
        array[1]++;
    }

    public static void main(String args[]) {
        B c = new B();
        int[] arr = new int[1];
        c.f(arr);
        System.out.println(arr[1]);
    }

  /*  public void getSB (StringBuffer a, StringBuffer b) {
        a.append ("B");
        a = b;
    }
    public static void main (String args [ ] ) {
        B c = new B();
        StringBuffer a = new StringBuffer ("A");
        StringBuffer b = new StringBuffer ("B");
        c.getSB(a, b);
        System.out.print(a);
    }*/
    /*public static void main(String[] args) {
        A a = null;
        a.sound();*/
    }

