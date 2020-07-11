package pl.yellowduck.netflix90;

public class Main5 {

    public static void main(String[] args) {

        try {
            test();
        } catch (Exception e) {
            System.out.println("error handler " + e.getMessage());
        }
    }

    public static void test() throws IllegalStateException {
        if (true) {
            throw new IllegalStateException("Źródłowy problem. Błędny stan");
        }
        System.out.println("after error");
    }
}
