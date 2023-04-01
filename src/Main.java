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

    }
}