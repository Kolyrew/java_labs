enum zaza {
    sosa1,
    sosa2,
    sosa3
}
public class Main {
    public static void main(String[] args){
        // byte
        byte byte_value = 2;
        switch (byte_value) {
            case 1:
                System.out.println("Значение равно 1");
                break;
            case 2:
                System.out.println("Значение равно 2");
                break;
            default:
                System.out.println("Значение не равно 1 или 2");
        }

        // short
        short short_value = 100;
        switch (short_value) {
            case 100:
                System.out.println("Значение равно 100");
                break;
            case 200:
                System.out.println("Значение равно 500");
                break;
            default:
                System.out.println("Значение не равно 100 или 500");
        }

        // int
        int int_value = 3;
        switch (int_value) {
            case 1:
                System.out.println("Значение равно 1");
                break;
            case 3:
                System.out.println("Значение равно 3");
                break;
            default:
                System.out.println("Значение не равно 1 или 3");
        }

        // char
        char char_value = 'A';
        switch (char_value) {
            case 'A':
                System.out.println("Значение равно 'A'");
                break;
            case 'B':
                System.out.println("Значение равно 'B'");
                break;
            default:
                System.out.println("Значение не равно 'A' или 'B'");
        }

        // String
        String string_value = "Misha";
        switch (string_value) {
            case "Misha":
                System.out.println("Значение равно 'Misha'");
                break;
            case "Masha":
                System.out.println("Значение равно 'Masha'");
                break;
            default:
                System.out.println("Значение не равно 'Masha' или 'Misha'");
        }

        //enum
        zaza my_zaza = zaza.sosa1;
        switch (my_zaza) {
            case sosa1:
                System.out.println("Значение равно sosa1");
                break;
            case sosa2:
                System.out.println("Значение равно sosa2");
                break;
            case sosa3:
                System.out.println("Значение равно sosa3");
                break;
            default:
                System.out.println("Значение не равно sosa1, sosa2 или sosa3");
        }
    }
}