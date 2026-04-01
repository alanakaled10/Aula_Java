import java.util.Scanner;

public class TesteTime2 {
    public static void main(String[] args) {
        

        Time2 t2 = new Time2(7);

        Time2 t3 = new Time2(8, 24);

        Time2 t4 = new Time2(t2);

        System.out.println("Hora t4: " + t4.getHora());

        System.out.println("Minuto t3: " + t3.getMinuto());

        System.out.println("ToUniversalString t2: " + t2.toUniversalString());
        
        System.out.println("ToString t4: " + t4.toString());
        
        t2.setTime(21, 30, 24);

        System.out.println("ToUniversalString t2: " + t2.toUniversalString());


        //Fase 3

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a Hora e Minutos do Time 1: ");
        Time2 time1 = new Time2(sc.nextInt(), sc.nextInt());

        System.out.println("Digite a Hora e Minutos do Time 2: ");
        Time2 time2 = new Time2(sc.nextInt(), sc.nextInt());

        System.out.println("Time 1 " + time1.toUniversalString());

        System.out.println("Time 2 " + time2.toUniversalString());

        sc.close();
        
    }

    
}
