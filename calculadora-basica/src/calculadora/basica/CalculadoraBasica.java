package calculadora.basica;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSelecciona una operaci�n:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicaci�n");
            System.out.println("4. Divisi�n");
			System.out.println("5. M�dulo");
            System.out.println("6. Salir");
            System.out.print("Elige una opci�n: ");

            int opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingresa el primer n�mero: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo n�mero: ");
                double num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + sumar(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + restar(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicaci�n: " + multiplicar(num1, num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado de la divisi�n: " + dividir(num1, num2));
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
					case 5:
						if (num2 != 0) {
							System.out.println("Resultado del m�dulo: " + modulo(num1, num2));
						}
						else {
							System.out.println("Error: No se puede dividir entre cero.");
						}
                }
            } else if (opcion == 6) {
                continuar = false;
                System.out.println("Saliendo de la calculadora...");
            } else {
                System.out.println("Opci�n no v�lida. Intenta nuevamente.");
            }
        }

        scanner.close();
    }

    public static double sumar(double a, double b) { return a + b; }
    public static double restar(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) { return a / b; }
	public static double modulo(double a, double b) { return a % b; }
}
