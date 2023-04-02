import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese que ejercicio desea ver. ");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                ejercicio1();
            }
            case 2:
            {
                ejercicio2();
            }
            case 3:
            {
                ejercicio3();
            }
        }

    }
    public static void ejercicio1()
    {
        /*
        System.out.println("CON CONSTRUCTOR VACIO. ");
        Cilindro cilindro = new Cilindro();
        System.out.println("CARACTERISTICAS CILINDRO. ");
        cilindro.mostrar();
        System.out.println("ALTURA: " + cilindro.getAltura());
        System.out.println("AREA: " + cilindro.calcularArea());
        System.out.println("VOLUMEN: " + cilindro.volumen());

        System.out.println("CON CONSTRUCTOR LLENO (con altura y radio). ");
        Cilindro cilindro1 = new Cilindro(5.0,"verde",3.2);
        System.out.println("CARACTERISTICAS CILINDRO. ");
        cilindro1.mostrar();
        System.out.println("ALTURA: " + cilindro1.getAltura());
        System.out.println("AREA: " + cilindro1.calcularArea());
        System.out.println("VOLUMEN: " + cilindro1.volumen());
         */
        Cilindro cilindrito = new Cilindro(1.6,"Verde",1.9);
        double nuevaArea = cilindrito.calcularArea();
        double volumen = cilindrito.volumen();

        System.out.println("Nueva area: " + nuevaArea);
        System.out.println("Nuevo volumen: " + volumen);

        System.out.println(cilindrito.toStringCilindro());
    }
    public static void ejercicio2()
    {
        Persona personita = new Persona();

        personita.cargarArregloEstudiantesStaff();
        System.out.println("MOSTRAR:");
        personita.recorrerArregloMostrar();

        double ingresos = personita.recorrerArregloCuotas();
        System.out.println("Los ingresos de las cuotas son de: " + ingresos);
    }
    public static void ejercicio3()
    {
        System.out.println("Constructor vacio: ");
        Circulo2 circulito = new Circulo2();
        circulito.setColor("Verde");
        circulito.setRadio(3.2);
        circulito.mostrarCirculo();
        System.out.println("Constructor lleno: ");
        Circulo2 circulito1 = new Circulo2(3.3,"Rojo");
        circulito1.mostrarCirculo();

        System.out.println("Constructor vacio: ");
        Rectangulo rectangulito = new Rectangulo();
        rectangulito.setColor("Azul");
        rectangulito.setBase(1.7);
        rectangulito.setAltura(2.3);
        rectangulito.mostrarRectangulo();
        System.out.println("Constructor lleno: ");
        Rectangulo rectangulito2 = new Rectangulo("Verde",2.3,2.5);
        rectangulito2.mostrarRectangulo();

    }
}