import java.util.Scanner;

public class Bicicleta implements Veiculo{

    private String tipo;
    private double velocidade;
    
    public Bicicleta(){}
    public Bicicleta(String tipo){
        this.tipo = tipo;
        this.velocidade = 0;
    }

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public void acelerar() {
        System.out.println("Qual a intesidade da aceleração? ");
        Scanner sc = new Scanner(System.in);
        double intensidade = sc.nextDouble();
        System.out.println("NHEQUE NHEQUE NHEQUE NHEQUE\n " + 
                            "Velocidade aumentou " +
                            intensidade + 
                            "km/h\n" + 
                            "Velocidade atual: " +
                            velocidade
        );
        sc.close();
        
    }
    @Override
    public void frear() {
        System.out.println("IIIIRRRRRRRRRRRRR\n " );
       
        
    }
    @Override
    public String obterTipo() {
       
        return "Bicicleta";
    }

    @Override
    public String toString() {
        return "Bicicleta [tipo=" + tipo 
             + ", velocidade=" + velocidade + "]";
    }
   

}
