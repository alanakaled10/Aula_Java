public abstract class Forma2D {

    private double largura;
    private double altura;
    private String nome;

    public Forma2D(){
        this.largura = this.altura = 0;
        this.nome = "Nada";
    }

    public Forma2D(double largura, double altura, String nome) {
        this.largura = largura;
        this.altura = altura;
        this.nome = nome;
    }

    public Forma2D(double x, String nome) {
        this.largura = this.altura = x;
        this.nome = nome;
    }

    public double getLargura() { return largura;}
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {   return altura; }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {   return nome; }
    public void setNome(String nome) {
        this.nome = nome;
    }   

    public abstract double area();

    @Override
    public String toString() {
        return "Forma2D [largura=" 
                        + largura 
                        + ", altura=" 
                        + altura 
                        + ", nome=" 
                        + nome 
                        +  "]";
    }

    
    

}
