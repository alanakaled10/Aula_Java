public class Retangulo extends Forma2D {

    public Retangulo() {
        super();
    }

    public Retangulo(double largura, double altura, String nome) {
        super(largura, altura, nome);
    }

    public Retangulo(double x, String nome) {
        super(x, nome);
    }

    public double area() {
        return getLargura() * getAltura();
    }

    @Override
    public String toString() {
        return "Retangulo [toString()=" 
        + super.toString() 
        + ", Área = " 
        + area() 
        + " ]";
    }

}
