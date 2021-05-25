import java.util.Scanner;

/*Ejercicio 3
Diseñar una aplicación que ofrezca, a través de un menú, la posibilidad de
calcular áreas de figuras geométricas específicas. Se deben codificar
funciones que calculen las áreas de:
Círculo
Cuadrado
Rectángulo
Triángulo
Trapecio
Las fórmulas pueden buscarse en los libros de geometría del nivel secundario.*/


public class Calcula_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int op;
		String otra="s";
		menu();
		
		while (otra != "n"){
			
			op = scan.nextInt();
			scan.nextLine();
			caso(op,scan);
			otra = String.valueOf(otraOperacion(scan,otra));
			
			if("n".equals(otra))
				
				break;
		}	
		
	}		

	
	
	public static void menu() {
		System.out.println("Bienvenido, elija el area que desea calcular!");
		System.out.println("1_ Circulo");
		System.out.println("2_ Cuadrado");
		System.out.println("3_ Rectangulo");
		System.out.println("4_ Triangulo");
		System.out.println("5_ Trapecio");
		System.out.println("6_ Salir");
	}
	
	
	public static String otraOperacion(Scanner scan, String otra) {
		System.out.println("Desea realizar otra operacion? s/n");
		otra = scan.nextLine();
		return otra;
	}
	public static void areaCirculo(Scanner scan) {
		double area;
		double radio;
		final double pi = 3.1416;
		System.out.println("Ingrese el radio del circulo: ");
		radio = scan.nextDouble();
		scan.nextLine();
		radio=radio*radio;
		area = pi * radio;
		System.out.println("El Area es: " + area);
		
	}
	
	public static void areaCuadrado (Scanner scan) {
		double lado;
		double area;
		System.out.println("Ingrese el lado del cuadrado ");
		lado = scan.nextDouble();
		scan.nextLine();
		area = lado * lado;
		System.out.println("El Area es: " + area);
	}
	
	public static void areaRectangulo(Scanner scan) {
		double area;
		double base;
		double altura;
		System.out.println("Ingrese la base del rectangulo");
		base = scan.nextDouble();
		scan.nextLine();
		System.out.println("Ingrese la altura del rectangulo");
		altura = scan.nextDouble();
		scan.nextLine();
		area = base*altura;
		System.out.println("El Area es: " + area);
	}
	
	public static void areaTriangulo(Scanner scan) {
		double area;
		double base;
		double altura;
		System.out.println("Ingrese la base del triangulo");
		base = scan.nextDouble();
		scan.nextLine();
		System.out.println("Ingrese la altura del triangulo");
		altura = scan.nextDouble();
		scan.nextLine();
		area = (base*altura)/2;
		System.out.println("El Area es: " + area);
	}
	
	
	public static void areaTrapecio(Scanner scan) {
		double area;
		double base1;
		double base2;
		double altura;
		System.out.println("Ingrese la base1 del trapecio");
		base1 = scan.nextDouble();
		scan.nextLine();
		System.out.println("Ingrese la base2 del trapecio");
		base2 = scan.nextDouble();
		scan.nextLine();
		System.out.println("Ingrese la altura del trapecio");
		altura = scan.nextDouble();
		scan.nextLine();
		area = ((base1+base2)/2)*altura;
		System.out.println("El Area es: " + area);
	}
	
	public static void caso(int op, Scanner scan) {
		switch (op) {
		 case 1:
			 areaCirculo(scan);
			 break;
		 case 2:
			 areaCuadrado(scan);
			 break;
		 case 3:
			 areaRectangulo(scan);
			 break;
			 
		 case 4:
			 areaTriangulo(scan);
			 break;
			 
		 case 5:
			 areaTrapecio(scan);
			 break;
			 
		 case 6:
			 
			 break;
		}
			
		
	
	}
}
