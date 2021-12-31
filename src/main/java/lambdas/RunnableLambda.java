package lambdas;

public class RunnableLambda {

    public static void main(String[] args) {

        // Code written in java 7 and earlier
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable using anonymous inner class");
            }
        }).start();

        // Code written in java 8 and above
        new Thread(() -> System.out.println("Runnable using a lambda"))
                .start();

        Runnable r = () -> System.out.println("Runnable using a lambda as a variable");
        new Thread(r).start();
    }

}
