public class ClassExample<T> {
    private T value;

    public ClassExample(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static <T> void exchangeValues(ClassExample<T> obj1, ClassExample<T> obj2) {
        T temp = obj1.value;
        obj1.value = obj2.value;
        obj2.value = temp;
    }

}