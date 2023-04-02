///Clase padre abstracta
public abstract class Forma
{
    protected String color;

    public Forma ()
    {

    }
    public Forma (String color)
    {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public void mostrarForma()
    {
        System.out.println("Color: " + this.color);
    }

}
