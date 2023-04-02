public class Rectangulo extends Forma
{
    private double base;
    private double altura;

    public Rectangulo()
    {
        super();
    }
    public Rectangulo(String color, double altura, double base)
    {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    @Override
    public double calcularArea()
    {
        double area = this.base * this.altura;
        return area;
    }

    @Override
    public double calcularPerimetro()
    {
        double perimetro = 2 * (this.base + this.altura);
        return 0;
    }
    public void mostrarRectangulo ()
    {
        System.out.println("Color: " + getColor());
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
        System.out.println("Area: " + this.calcularArea());
        System.out.println("Perimetro: " + this.calcularPerimetro());
    }
}
