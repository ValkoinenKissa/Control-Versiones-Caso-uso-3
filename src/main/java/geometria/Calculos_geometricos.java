package geometria;

import java.util.Scanner;

public class Calculos_geometricos {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Area_triangulo();
		Area_circunferencia();
		scanner.close();
	}

	public static void Area_triangulo() {
		// Calculo area del triangulo
		
				System.out.println("Ingrese la longitud del lado 1 del triángulo: ");
				int lado1 = scanner.nextInt();
				System.out.println("Ingrese la longitud del lado 2 del triángulo: ");
				int lado2 = scanner.nextInt();
				double area = calcularAreaTriangulo(lado1, lado2);
				System.out.println("El área del triángulo es: " + area);
				
	}
	
	public static double calcularAreaTriangulo(int lado1, int lado2) {
		return (lado1 * lado2) / 2.0;
	}

	public static void Area_circunferencia() {
		System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // Llamadas a los métodos estáticos para calcular área y perímetro
        double area = calcularAreaCircunferencia(radio);
        double perimetro = calcularPerimetroCircunferencia(radio);

        System.out.println("Área de la circunferencia: " + area);
        System.out.println("Perímetro de la circunferencia: " + perimetro);
	}
    
	// Método estático para calcular el área de la circunferencia
	public static double calcularAreaCircunferencia(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método estático para calcular el perímetro de la circunferencia
    public static double calcularPerimetroCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }

}
