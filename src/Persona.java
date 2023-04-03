import java.util.Arrays;
import java.util.Scanner;

public class Persona
{
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private Persona[] arregloEstudiantesStaff;
    private int validosArreglo = 0;

    public Persona ()
    {
       this.arregloEstudiantesStaff = new Persona[8];
    }
    public Persona (int dni, String nombre, String apellido, String email, String direccion)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.arregloEstudiantesStaff = new Persona[8];

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

        System.out.println("CARGAR 2 ESTUDIANTES.");
        while(i < 2)
        {
            System.out.println("Ingrese el DNI. ");
            int dni = scan.nextInt();
            System.out.println("Ingrese el nombre. ");
            String nombre = scan.next();
            System.out.println("Ingrese el apellido. ");
            String apellido = scan.next();
            System.out.println("Ingrese el email. ");
            String email = scan.next();
            System.out.println("Ingrese la direccion de su casa. ");
            String direccion = scan.next();

            System.out.println("Ingrese su año de ingreso.");
            int añoIngreso = scan.nextInt();
            System.out.println("Ingrese el valor de la cuota mensual.");
            double valorCuota = scan.nextDouble();
            scan.nextLine();
            System.out.println("Ingrese el nombre de la carrera. ");
            String nombreCarrera = scan.nextLine();

            i++;

            Estudiante nuevo = new Estudiante(dni,nombre,apellido,email,direccion,añoIngreso,valorCuota,nombreCarrera);
            this.arregloEstudiantesStaff[this.validosArreglo] = nuevo;
            this.validosArreglo++;
        }
        System.out.println("CARGAR 2 MIEMBROS DE STAFF.");
        while(j < 2)
        {
            System.out.println("Ingrese el DNI. ");
            int dni = scan.nextInt();
            System.out.println("Ingrese el nombre. ");
            String nombre = scan.next();
            System.out.println("Ingrese el apellido. ");
            String apellido = scan.next();
            System.out.println("Ingrese el email. ");
            String email = scan.next();
            System.out.println("Ingrese la direccion de su casa. ");
            String direccion = scan.next();

            System.out.println("Ingrese su salario. ");
            double salario = scan.nextDouble();
            System.out.println("Ingrese el turno. (mañana/noche)");
            scan.nextLine();
            String turno = scan.nextLine();

            j++;

            Staff nuevo = new Staff(dni,nombre,apellido,email,direccion,salario,turno);
            this.arregloEstudiantesStaff[this.validosArreglo] = nuevo;
            this.validosArreglo++;
        }
    }
    public void mostrarPersona()
    {
        System.out.println("Dni: " + this.dni);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Email: " + this.email);
        System.out.println("Direccion: " + this.direccion);
    }
    public void recorrerArregloMostrar ()
    {
        for(int i = 0; i < this.validosArreglo; i++)
        {
            if(this.arregloEstudiantesStaff[i] instanceof  Estudiante)
            {
                ((Estudiante) this.arregloEstudiantesStaff[i]).mostrarPersona();
            }
            else if (this.arregloEstudiantesStaff[i] instanceof Staff)
            {
                ((Staff) this.arregloEstudiantesStaff[i]).mostrarPersona();
            }
        }
    }
    public double recorrerArregloCuotas ()
    {
        double suma = 0;

        for(int i = 0; i < this.validosArreglo; i++)
        {
            if(this.arregloEstudiantesStaff[i] instanceof Estudiante)
            {
                suma = suma + ((Estudiante) this.arregloEstudiantesStaff[i]).getCuotaMensual();
            }
        }
        return suma;
    }
}
