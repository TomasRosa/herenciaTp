public class Cilindro extends Circulo
{
    private double altura = 3.0;

    public Cilindro()
    {
        super();

    }
    public Cilindro (double radio, String color, double altura)
    {
        super(radio,color);
        this.altura = altura;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    public double volumen ()
    {
        double volumenCilindro = super.calcularArea() * this.altura;
        return volumenCilindro;
    }

    @Override
    public double calcularArea()
    {
        double areaCilindro = 2 * Math.PI * super.getRadio() * this.altura + 2 * super.calcularArea();
        return areaCilindro;
        ///Con el super le aclaro que llamo a los metodos de la clase padre.
    }
    public String toStringCilindro()
    {
        return "Cilindro: subclase de " + super.toStringCirculo() + "Altura= " + this.altura;
    }
}