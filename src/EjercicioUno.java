import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Digite el segundo numero");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println(num1+", "+num2);
        }else{
            System.out.println("orden de menor a mayor"+num2+", " +num1);
        }
    }
}
