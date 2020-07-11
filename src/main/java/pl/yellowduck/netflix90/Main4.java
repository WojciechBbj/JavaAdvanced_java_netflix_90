package pl.yellowduck.netflix90;

public class Main4 {

    public static void main(String[] args) {
        test();
    }

    public static void test() throws IllegalStateException {
        if (true) {
            throw new IllegalStateException("error");
        }
        System.out.println("after error");
    }
}
