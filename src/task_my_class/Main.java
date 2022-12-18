package task_my_class;

public class Main {
    public static void main(String[] args) {
        MyClass<Integer> factoryObject1 = MyClass.factoryMethod(500);
        MyClass<String> factoryObject2 = MyClass.factoryMethod("Hello World");

        System.out.println(factoryObject1.toString());
        System.out.println(factoryObject2.toString());
    }
}
