package task_my_class;

public class MyClass <T> {
    public T field;

    public MyClass(T field) {
        this.field = field;
    }

    public static <T> MyClass factoryMethod(T a) {
       return new MyClass<>(a);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "field=" + field +
                '}';
    }
}
