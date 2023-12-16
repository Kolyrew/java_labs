public class Main {
    public static void main(String[] args) {
        Reflector.getClassInformation(String.class);
        Reflector.getClassInformation(Integer.class);
        Reflector.getClassInformation(Reflector.class);
    }
}