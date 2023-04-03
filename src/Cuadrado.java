public class Cuadrado extends Rectangulo
{
    private double lado;

    public Cuadrado ()
    {
        super();
    }
    public Cuadrado(String color,double lado)
    {
        super(color, lado, lado);
        this.lado = lado;
    }
    @Override
    public void mostrarForma()
    {
        super.mostrarForma();
        System.out.println("Lado cuadrado: " + this.lado);
        System.out.println("Area: " + super.calcularArea());
        System.out.println("Perimetro: " + super.calcularPerimetro());
    }
}
