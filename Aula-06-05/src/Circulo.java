public class Circulo extends Forma2D{
    
    public Circulo() {
        super();
    }

    public Circulo(double raio, String nome) {
        super(raio, nome);
    }

    public double area() {
        return 3.14 * Math.pow(getLargura(), 2);
    }

    @Override
    public String toString() {
        return "Circulo [toString()=" 
                + super.toString() 
                + ", Área = " 
                + area() 
                + " ]";
    } 

}
