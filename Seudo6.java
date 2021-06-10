import java.util.Scanner;

public class Seudo6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menoresde = 0;
        int mayoresde = 0;
        int edad;
        int contador1 = 0;
        int contador2 = 0;
        double promedio1;
        double promedio2;
        for (int x = 0; x < 100; x++) {
            System.out.println("Ingrese la edad");
            edad = scanner.nextInt();
            if (edad >= 25) {
                contador1++;
                mayoresde = mayoresde + edad;
            } else {
                contador2++;
                menoresde = menoresde + edad;
            }
        }
        promedio1 = mayoresde / contador1;
        promedio2 = menoresde / contador2;
        System.out.println("El promedio de edades de los participantes menores de 25 años es de " + promedio2 + " y de los mayores o iguales a 25 es de " + promedio1);
    }
}