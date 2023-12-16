public class Main {
    public static void main(String[] args) {
        // Логические операции
        boolean a = true;
        boolean b = false;

        System.out.println("Логическое И: " + (a && b));
        System.out.println("Логическое ИЛИ: " + (a || b));
        System.out.println("Логическое НЕ: " + (!a));

        // Тернарная операция
        int x = 5;
        int y = 10;
        int min = (x < y) ? x : y;
        System.out.println("Минимальное значение: " + min);

        // Поразрядные логические операции
        int num1 = 5;
        int num2 = 3;

        System.out.println("Поразрядное И: " + (num1 & num2));
        System.out.println("Поразрядное ИЛИ: " + (num1 | num2));
        System.out.println("Поразрядное исключающее ИЛИ: " + (num1 ^ num2));
        System.out.println("Поразрядное НЕ для num1: " + (~num1));

        // Операции сдвига
        int num3 = 16;

        System.out.println("Сдвиг вправо на 2 позиции: " + (num3 >> 2));
        System.out.println("Сдвиг влево на 3 позиции: " + (num3 << 3));
        System.out.println("Логический сдвиг вправо на 2 позиции: " + (num3 >>> 2));
    }
}