import java.util.Scanner;

public class Carro implements Veiculo{
    private String modelo;
    private String placa;
    private double velocidade;

    public Carro(){}
    public Carro(String modelo, String placa){
        this.modelo = modelo;
        this.placa = placa;
        this.velocidade = 0;
    }
    public String getModelo() { return modelo;}
    public void setModelo(String modelo) {
        this.modelo = modelo;
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
        System.out.println("VRUMMMMMMMMMMM\n " + 
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
        
        System.out.println("IIIIRRRRRRRRRRRRR\n " 
        );
       
    }
    @Override
    public String obterTipo() {
        
        return "Carro";
    }
    @Override
    public String toString() {
        return "Carro [modelo=" + modelo 
               + ", placa=" + placa 
               + ", velocidade=" + velocidade + "]";
    }


}
