import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter words, separated by spaces:");
        while (scanner.hasNext()) {
            String word = scanner.next();
            System.out.println("Current word: " + word);
        }
        scanner.close();
    }
}