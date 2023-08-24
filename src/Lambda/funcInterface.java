package Lambda;

@FunctionalInterface
public interface funcInterface {

    // As this is the functional interface, we have to create only 1 abstract method
    public abstract void say();

    //How to call this function or method. There are 3 Ways
    // 1. To make separate class and call from there:-> Class created funcInterfaceImpl
    // 2. To make anonymous class in the main function only :-> done in main method
    // 3. To make lambda expression
}
