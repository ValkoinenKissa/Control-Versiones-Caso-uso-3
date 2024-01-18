package geometria;

import java.util.Scanner;

public class Calculos_geometricos {

	public static void main(String[] args) {
		// Calculo area del triangulo
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la longitud del lado 1 del triángulo: ");
		int lado1 = scanner.nextInt();
		System.out.println("Ingrese la longitud del lado 2 del triángulo: ");
		int lado2 = scanner.nextInt();
		double area = calcularArea(lado1, lado2);
		System.out.println("El área del triángulo es: " + area);
		scanner.close();
	}

	public static double calcularArea(int lado1, int lado2) {
		return (lado1 * lado2) / 2.0;
	}

}
