package geometria;

import java.util.Scanner;

public class Calculos_geometricos {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Area_triangulo();
		Area_circunferencia();
		Area_Rectagunlo();
	    double ladoCubo = obtenerLadoCubo();
	    double volumen = calcularVolumenCubo(ladoCubo);
	    System.out.println("El volumen del cubo es: " + volumen);
		Area_cubo();
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

		System.out.println("Introduce el radio del cilindro: ");
		double radio = scanner.nextDouble();
		System.out.println("Introduce la altura del cilindro: ");
		double altura = scanner.nextDouble();

		double resultBase = calcularAreaBase(radio);
		double areaLateral = calcularAreaLateral(radio, altura);
		double areaTotal = areaLateral + (2 * resultBase);

		imprimeResult(areaLateral, areaTotal);

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

	// Metodos para calcular area del cilindro

	public static double calcularAreaBase(double radio) {
		double resultadoAreaBase = Math.PI * Math.pow(radio, 2);
		return resultadoAreaBase;
	}

	public static double calcularAreaLateral(double radio, double altura) {
		double areaLateralSupercifie = 2 * Math.PI * radio * altura;
		return areaLateralSupercifie;
	}

	public static void imprimeResult(double areaLateral, double areaTotal) {
		System.out.println("El area lateral de la superficie del cilindro es: " + areaLateral);
		System.out.println("El area total de la superficie del cilindro: " + areaTotal);
	}

	public static void Area_Rectagunlo() {
		System.out.println("Introduce la base: ");
		double base = scanner.nextDouble();
		System.out.println("Introduce la altura: ");
		double altura = scanner.nextDouble();
		double areaCalculada = calcularAreaRectangulo(base, altura);
		imprimeResultRectangulo(areaCalculada);
	}

	// Metodos para calcular el area del rectangulo

	public static double calcularAreaRectangulo(double base, double altura) {
		double resultado = base * altura;
		return resultado;
	}

	public static void imprimeResultRectangulo(double resultado) {
		System.out.println("El area del rectangulo es: " + resultado);
	}

	// Metodos para calcular el volumen del cubo
	
	public static double obtenerLadoCubo() {
        System.out.print("Ingrese el lado del cubo: ");
        double ladoCubo = scanner.nextDouble();

        return ladoCubo;
    }

    public static double calcularVolumenCubo(double lado) {
        return Math.pow(lado, 3);
    }
    
    public static void Area_cubo() {

        System.out.print("Ingrese la longitud del lado del cubo: ");
        double lado = scanner.nextDouble();

        // Llamada al método estático para calcular el área del cubo
        double area = calcularArea(lado);

        System.out.println("Área del cubo: " + area);
    }
    public static double calcularArea(double lado) {
        return 6 * Math.pow(lado, 2);
    }
}
