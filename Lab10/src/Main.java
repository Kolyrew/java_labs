public class Main {
    public static void main(String[] args) {
        Class<Integer> triple = new Class<>(5, 10, 3);
        System.out.println("Min: " + triple.min());
        System.out.println("Max: " + triple.max());
        System.out.println("Mean: " + triple.mean());
    }
}