import java.util.Scanner;

public class Caminhao implements Veiculo{
    private double capacidadeCarga ;
    private String placa;
    private double velocidade;

    public Caminhao(){}
    public Caminhao(double capacidadeCarga, String placa){
        this.capacidadeCarga = capacidadeCarga;
        this.placa = placa;
        this.velocidade = 0;
    }
    public double getCapacidadeCarga() {return capacidadeCarga;}
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getPlaca() {return placa;}
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getVelocidade() {return velocidade;}
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar() {
        System.out.println("Qual a intesidade da aceleração? ");
        Scanner sc = new Scanner(System.in);
        double intensidade = sc.nextDouble();
        System.out.println("RAAAAAMMMMMM TCHUUUUUU\n " + 
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
        return "Caminhão";
    }
    @Override
    public String toString() {
        return "Caminhao [capacidadeCarga=" + capacidadeCarga 
             + ", placa=" + placa 
             + ", velocidade=" + velocidade + "]";
    }
    
    

}
