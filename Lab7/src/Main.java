public class Main {
    public static void main(String[] args) {
        ClassExample<Integer> objA = new ClassExample<>(7);
        ClassExample<Integer> objB = new ClassExample<>(14);

        System.out.println("Initial values:");
        System.out.println("objA: " + objA.getValue());
        System.out.println("objB: " + objB.getValue());

        ClassExample.exchangeValues(objA, objB);

        System.out.println("\nValues after swaping:");
        System.out.println("objA: " + objA.getValue());
        System.out.println("objB: " + objB.getValue());
    }
}