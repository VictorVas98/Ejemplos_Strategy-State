import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de lados: ");
        int lados = scanner.nextInt();

        float radio = 0;
        float base = 0;
        float altura = 0;

        if (lados == 0) {
            System.out.print("Ingrese el radio del círculo: ");
            radio = scanner.nextFloat();
        } else if (lados == 3) {
            System.out.print("Ingrese la base del triángulo: ");
            base = scanner.nextFloat();
            System.out.print("Ingrese la altura del triángulo: ");
            altura = scanner.nextFloat();
        } else if (lados == 4) {
            System.out.print("Ingrese la base del rectángulo: ");
            base = scanner.nextFloat();
            System.out.print("Ingrese la altura del rectángulo: ");
            altura = scanner.nextFloat();
        } else {
            System.out.println("Figura no reconocida.");
            return;
        }

        CuerpoGeometrico cuerpo = new CuerpoGeometrico(radio, lados, base, altura);
        IArea figura = cuerpo.getFigura();

        if (figura != null) {
            System.out.println(figura.getResultado());
        }
    }
}