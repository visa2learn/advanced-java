package lambdas;

@FunctionalInterface
public interface MyFunctionalInterface {

    int sampleMethod();
    //int yetAnotherMethod();

    default String printHelloWorld() {
        return "Hello World!";
    }

    static void sampleStaticMethod() {
        System.out.println("Inside MyFunctionalInterface.sampleStaticMethod()");
    }
}
