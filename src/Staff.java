public class Staff extends Persona
{

    private double salario;
    private String turno; ///mañana o noche

    public Staff ()
    {
        super();
    }
    public Staff (int dni,String nombre,String apellido,String email,String direccion, double salario, String turno)
    {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public String getTurno()
    {
        return turno;
    }

    public void setTurno(String turno)
    {
        this.turno = turno;
    }
    public double salarioAnual ()
    {
        double salarioAnual = this.salario * 12;
        return salarioAnual;
    }

    @Override
    public void mostrarPersona() {
        super.mostrarPersona();
        System.out.println("Salario: " + this.salario);
        System.out.println("Turno: " + this.turno);
    }
}
