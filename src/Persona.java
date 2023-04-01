import java.util.Scanner;

public class Persona
{
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private Persona[] arregloEstudiantesStaff;
    private int validosArreglo;

    public Persona ()
    {

    }
    public Persona (int dni, String nombre, String apellido, String email, String direccion)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }

    public int getDni()
    {
        return dni;
    }

    public void setDni(int dni)
    {
        this.dni = dni;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
    public void cargarArregloEstudiantesStaff()
    {
        int i = 0;
        int j = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("CARGAR 4 ESTUDIANTES.");
        while(i < 4)
        {
            System.out.println("Ingrese el DNI. ");
            int dni = scan.nextInt();

            System.out.println("");

        }
    }
}
