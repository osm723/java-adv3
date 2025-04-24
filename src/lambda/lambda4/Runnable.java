package lambda.lambda4;

public class Runnable {

    public static void main(String[] args) {
        java.lang.Runnable runnable1 = new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println("runnable1");
            }
        };
        runnable1.run();

        java.lang.Runnable runnable2 = () -> System.out.println("runnable2");
        runnable2.run();
    }
}
