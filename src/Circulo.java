public class Circulo {
    private double radio = 3.0;
    private String color = "rojo";

    public Circulo()
    {

    }

    public Circulo(double radio, String color) {
        this.color = color;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrar() {
        System.out.println("El radio es: " + this.radio);
        System.out.println("El color es: " + this.color);
    }

    public double calcularArea()
    {
        double areaCirculo = Math.PI * (this.radio * this.radio);
        return areaCirculo;
    }

    public String toStringCirculo() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}