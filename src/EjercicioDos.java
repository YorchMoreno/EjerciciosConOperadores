import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la medida actual de en litros del estanque de gasolina");
        double capacidad = scanner.nextDouble();

        if (capacidad == 70.0){
            System.out.println("Estanque lleno");
        } else if (capacidad >= 60d & capacidad < 70d) {
            System.out.println("Estanque casi lleno");
        } else if (capacidad >= 40d & capacidad < 60d) {
            System.out.println("Estanque a 3/4");
        } else if (capacidad >= 35d & capacidad < 40d) {
            System.out.println("Medio estanque");
        } else if (capacidad >= 20d & capacidad < 35d) {
            System.out.println("Suficiente");
        } else if (capacidad >= 1d & capacidad < 20d) {
            System.out.println("Insuficiente");
        }
    }
}
