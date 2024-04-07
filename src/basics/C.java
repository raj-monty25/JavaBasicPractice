class C {

    public final String f1() {
        return "fb";
    }
    /*public String f1() {
        return "fb";
    }*/
}

class D1 extends B {
    public String f1() {
        return "fd";
    }
}

/*class D2 extends D1 {
    public String f1() {
        return "fd2";
    }
}*/

class Main2 {

    public static void main(String[] args) {
       /* D2 d2 = new D2();
        ((B)d2).f1();*/
        D1 d = new D1();
        System.out.println(d.f1());
    }

}