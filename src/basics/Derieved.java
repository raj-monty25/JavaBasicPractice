import java.io.IOException;

public class Derieved extends Test {

    @Override
    public void display() throws IOException {
        System.out.println("Derieved");
    }

    public static void main(String[] args) throws IOException {
        Derieved d = new Derieved();
        d.display();
    }
}
