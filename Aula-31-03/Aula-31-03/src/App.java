public class App {
    public static void main(String[] args) {

        Time1 time = new Time1();
        // System.out.print("Valor Universal inicial de time: ");
        // System.out.println(time.toUniversalString());

        // System.out.print("Valor Default inicial de time: ");
        // System.out.println(time.toString());

        time.setTime(99, 99, 99);
        System.out.print("Valor Universal inicial de time: ");
        System.out.println(time.toUniversalString());

        System.out.print("Valor Default inicial de time: ");
        System.out.println(time.toString());

    }
    }

