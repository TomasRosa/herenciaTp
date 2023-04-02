public class Estudiante extends Persona
{
    private int añoIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante()
    {
        super();
    }
    public Estudiante (int dni,String nombre,String apellido,String email,String direccion, int añoIngreso, double cuotaMensual, String carrera)
    {
        super(dni, nombre, apellido, email, direccion);
        this.añoIngreso = añoIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public int getAñoIngreso()
    {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso)
    {
        this.añoIngreso = añoIngreso;
    }

    public double getCuotaMensual()
    {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual)
    {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera()
    {
        return carrera;
    }

    public void setCarrera(String carrera)
    {
        this.carrera = carrera;
    }

    @Override
    public void mostrarPersona()
    {
        super.mostrarPersona();
        System.out.println("Año de ingreso: " + this.añoIngreso);
        System.out.println("Cuota mensual: " + this.cuotaMensual);
        System.out.println("Carrera: " + this.carrera);
    }
}
