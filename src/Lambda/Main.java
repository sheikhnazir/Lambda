package Lambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        line 7-10 to call funcInterfaceImpl class
//        funcInterfaceImpl interface1 = new funcInterfaceImpl();
//
//        interface1.say();

        // Now creating anonymous class, Lambda is only applicable for functional interfaces as there
        // is only 1 abstract method. Whenever there are more than two methods inside the interface than we use anonymous class.
        // as below created.
        funcInterface interface2 = new funcInterface() {
            @Override
            public void say() {
                System.out.println("Inside anonymous funcInterface implementation");
            }
        };
        interface2.say();

        // Now using our functional interface with the help of Lambda

        funcInterface interface3 = ()-> System.out.println("Inside the Lambda expression by implementing functional interface...code reduced!!!");
        interface3.say();

        funcInterface interface4 = ()-> System.out.println("Inside the Second Lambda expression by implementing functional interface...code reduced!!!");
        interface4.say();

        sumInterface sumInterface = ( a, b) ->  a+b;

        System.out.println(sumInterface.sum(5, 99));
        System.out.println(sumInterface.sum(99, 87));
    }
}