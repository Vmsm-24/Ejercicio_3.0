import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante n1 = new Estudiante();
        Scanner sc = new Scanner(System.in);
        String nombre;
        String edad;
        String genero;
        System.out.print("Ingrese nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese edad: ");
        edad = sc.nextLine();
        System.out.print("Ingrese genero: ");
        genero = sc.nextLine();
        n1.setEdad(edad);
        n1.setNombre(nombre);
        n1.setGenero(genero);
        System.out.println("Los datos son : " + n1.detalleEstu(nombre, edad, genero));

        Universidad n2 = new Universidad();
        Scanner sca = new Scanner(System.in);
        String nom;
        String numero;
        String direccion;
        System.out.print("Ingrese el nombre de la Universidad: ");
        nom = sca.nextLine();
        System.out.print("Ingrese el número de la Universidad: ");
        numero = sca.nextLine();
        System.out.print("Ingrese la dirección de la Universidad: ");
        direccion = sca.nextLine();
        n2.setNombre(nom);
        n2.setNumero(numero);
        n2.setDireccion(direccion);
        System.out.println("Los datos ingresados son: " + n2.detalleUni(nom, numero, direccion));

        Curso n3 = new Curso();
        Scanner scan = new Scanner(System.in);
        String materia;
        String num_estu;
        System.out.print("Ingrese la materia: ");
        materia = scan.nextLine();
        System.out.print("Ingrese el numero de estudiantes del curso: ");
        num_estu = scan.nextLine();
        n3.setMateria(materia);
        n3.setNum_estudiantes(num_estu);
        System.out.println("Los datos ingresados en la clase fueron: " + n3.detalleCur(materia, num_estu));




    }
}