import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("---CALCULADORA---");
        System.out.println("Introduce el primer número:");
        double num1 = scanner.nextDouble();
        System.out.println(num1);
        System.out.println("Introduce el segundo número:");
        double num2 = scanner.nextDouble();
        System.out.println("Número 1: "+num1);
        System.out.println("Número 2: "+num2);


        //operaciones con los números
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División: "+division);



        scanner.close();
    }
}
