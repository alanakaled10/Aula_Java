public class Triangulo extends Forma2D {

    private String Style;

    public Triangulo(){
        super();
        this.Style = "Triangulo";    
    }
    
    public Triangulo(double largura, double altura, String nome, String Style) {
        super(largura, altura, nome);
        this.Style = Style;
    }

    public Triangulo(double x, String nome, String Style) {
        super(x, nome);
        this.Style = Style;
    }

    public String getStyle() {return this.Style;}
    public void setStyle(String style) {
        this.Style = style;
    }

    public double area() {
        return (getLargura() * getAltura()) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo [Style=" 
                + this.Style 
                + ", toString()=" 
                + super.toString() 
                + ", Área = " 
                + area() 
                + " ]";
    }

    

}
