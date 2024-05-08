import java.util.Scanner;

public class MainOperaciones {
    public static void main(String[] args) {
        Scanner opera = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = opera.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = opera.nextDouble();

        Operaciones operaciones = new Operaciones();
        operaciones.setNum1(num1);
        operaciones.setNum2(num2);

        Suma suma = new Suma();
        suma.setNum1(num1);
        suma.setNum2(num2);

        Resta resta = new Resta();
        resta.setNum1(num1);
        resta.setNum2(num2);

        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.setNum1(num1);
        multiplicacion.setNum2(num2);

        Division division = new Division();
        division.setNum1(num1);
        division.setNum2(num2);

        System.out.println("Operación Suma: " + suma + ", Resultado: " + suma.sumar());
        System.out.println("Operación Resta: " + resta + ", Resultado: " + resta.restar());
        System.out.println(
                "Operación Multiplicación: " + multiplicacion + ", Resultado: " + multiplicacion.multiplicar());
        System.out.println("Operación División: " + division + ", Resultado: " + division.dividir());

        opera.close();
    }
}
