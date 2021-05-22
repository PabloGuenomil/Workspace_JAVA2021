import java.util.Scanner;

/*Se recibe una solicitud de ingreso a un trabajo, en respuesta a un aviso
publicado en una p�gina web. En dicha solicitud se especifica: edad en a�os
del as�rante, experiencia en el oficio, tambi�n expresada en a�os, y
remuneraci�n estimativa a percibir mensualmente. La empresa usa los
siguientes criterios de selecci�n:

1*la edad debe estar entre 18 y 35 a�os inclusive en ambos extremos del
intervalo, sino ser� rechazado.

2*la experiencia menor a los 3 a�os debe estimar una remuneraci�n debajo
de los $50000 mensuales, sino ser� rechazado.

3*si la edad del solicitante es mayor a los 32 a�os, deber� tener como m�nimo
6 a�os de experiencia; si la experiencia es menor a los 6 a�os y mayor a 3
a�os, se lo tomar� en forma condicional. En cualquier otro caso se lo
rechazar�.
TP 2 - Estructuras de control de decisi�n 3
Realizar un programa que permita decidir a partir de los datos del aspirante si
fue seleccionado definitivamente, en forma condicional, o rechazado. Imprimir
un mensaje que indique lo ocurrido.*/

public class Evaluador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Datos Constantes pedidas por la empresa
		final int min = 18;
		final int max = 35;
		final int op = 32;
		final int expMin = 3;
		final int remun = 50000;
		boolean evalua = false;	
		
		//datos del postulante
		
		int edad = 33;
		int experiencia = 7;
		int remuneracion = 40000;
		
		Scanner scan = new Scanner(System.in); 
		String haySolicitud = "s";
		String condicion= "rechazado";
		

		System.out.println("hay solicitud? s/n");
		haySolicitud = scan.nextLine();
		
		while ("s".equals(haySolicitud)) {
		System.out.println("Evaluando edad:");
		condicion = comparaInt(min,max,edad);
		 if ("rechazado" == condicion ) {
			 System.out.println("Su condicion es: " + condicion);
			break;
		 }
			else
				System.out.println("Su condicion es: " + condicion);
		
		System.out.println("Evaluando experiencia y remuneracion pretendida:");
		condicion = evaluaRemuneracion(experiencia,remuneracion,expMin,remun);
		 if (condicion == "rechazado") {
			 System.out.println("Su condicion es: " + condicion);
			 break;
		 }
		 else
			 System.out.println("Su condicion es: " + condicion);
		
		 System.out.println("evalua condicion:");
		condicion = condicional(edad,op,experiencia);
		 if (condicion == "rechazado") {
			System.out.println("Su condicion es: " + condicion);
			break;
		 }
		 else
			 System.out.println("Su condicion es: " + condicion);
		
		System.out.println("hay solicitud? s/n");
		haySolicitud = scan.nextLine();
		}
	}
	
	
	
	
	
	
	public static String comparaInt(int min, int max, int dato) {
		
		String condicion = "rechazado"; 
		if (min<=dato && dato<=max) {
			
			return condicion ="aprobada";
			 
			
		}
			else
				
				return condicion;
	}
	
	public static String evaluaRemuneracion(int exp, int remuneracion, int expMin, int remun) {
		
		String condicion = "rechazado";
		if ((exp > expMin) || (remuneracion >= remun))
			
			return condicion = "aprovado";
			
			if ((exp < expMin) && (remuneracion < remun)) {
			
				return condicion ="aprovado";
		}
				else
					
					return condicion;
		}
	
	public static String condicional(int edad, int op, int exp) {
		
		String condicion = "rechazado";
		if (edad<op)
			return condicion = "aprovado permanente";
		else
		
			if ((edad > op) && (exp>=6))

				return condicion = "aprovado permanente";
			else
			
				if ((edad > op) && (exp<6 && exp >3))

					return condicion ="aprobado condicional";
			
				else
					return condicion;
	}
	
}
