public class Circulo2 extends Forma
{

    private double radio;


    public Circulo2 ()
    {
        super();
    }
    public Circulo2 (double radio, String color)
    {
        super(color);
        this.radio = radio;
    }
    public double getRadio()
    {
        return radio;
    }

    public void setRadio(double radio)
    {
        this.radio = radio;
    }

    @Override
    public double calcularArea()
    {
        double area = Math.PI * (this.radio * this.radio);
        return area;
    }

    @Override
    public double calcularPerimetro()
    {
        double perimetro = 2 * Math.PI * this.radio;
        return perimetro;
    }
    public void mostrarCirculo()
    {
        System.out.println("El color del circulo es: " + getColor());
        System.out.println("Radio del circulo: " + this.radio);
        System.out.println("Area del circulo: " + this.calcularArea());
        System.out.println("Perimetro del circulo: " + this.calcularPerimetro());
    }
}
