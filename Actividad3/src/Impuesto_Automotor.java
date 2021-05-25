import java.text.DecimalFormat;
import java.util.Scanner;

/*Ejercicio 3
!_ Se ingresa la cantidad de patentes de automotor que serán procesadas en un
registro. Cada número de patente viene acompañada del valor del modelo del
año correspondiente. 
2_ Se desea calcular el impuesto que debe pagar cada dueño de acuerdo a la siguiente tabla:
*si tiene nro de patente menor de 1000000, paga el 5% del valor del modelo.
*si la patente está entre 1000000 y 2000000 se paga el 10% del valor del
modelo.
*en cualquier otro caso, abona el 15% del valor del auto.
3_ Imprimir el impuesto abonado por cada dueño, el monto total recaudado con
dicho impuesto por el Registro del Automotor, y cual fue el porcentaje de autos
cuya numeración fue superior a 1300000*/


public class Impuesto_Automotor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double por5 = 0.05;
		final double por10 = 0.10;
		final double por15 = 0.15;
		
		
		int cuentaAuto=0;
		int cantPatente;
		int por;
		
		float porAutos;
		float impPagado = 0;
		double valorPatente;
		double valorModelo;
		double recaudado5 = 0;
		double recaudado10 = 0;
		double recaudado15 = 0;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		
		cantPatente = ingresaPatentes(scan);
		
		int i;
		for (i=0;i<cantPatente;i++) {
			valorPatente= ((Math.random() * (2500000 - 500000)) + 500000);
			valorModelo= (Math.random()*(3000000-1000000))+1000000;
			
			System.out.println("Valor Patente: " + df.format(valorPatente));
			System.out.println("Valor Modelo: "+ df.format(valorModelo));
			if (valorPatente < 1000000) {
				 por = 5;
				impPagado = calculaImpuesto(por5,valorModelo,df,por);
				recaudado5 = calculaRecaudado(impPagado,recaudado5);
				
			}
				else
					if ((valorPatente > 1000000) && (valorPatente < 2000000)) {
						por = 10;
						impPagado = calculaImpuesto(por10,valorModelo,df,por);
						recaudado10 = calculaRecaudado(impPagado,recaudado10);
						
						
				}
						else
							if (valorPatente > 2000000) {
							por = 15;
							impPagado = calculaImpuesto(por15,valorModelo,df,por);
							recaudado15= calculaRecaudado(impPagado, recaudado15);
							}
					
			if (valorPatente > 1300000) {  
				cuentaAuto ++;
				
			}
				
		}
		
		porAutos = (float) ((cuentaAuto*100)/cantPatente); //Calcula el porcentaje de los autos que la patente supera el valor de 1300000
		imprimeTotal(porAutos, recaudado5, recaudado10, recaudado15, df);
				
		
		
	}

	public static void imprimeTotal(float porAutos, double recaudado5, double recaudado10, double recaudado15,DecimalFormat df) { //Imprime los resultados
		System.out.println("El monto total recaudado por el impuesto del 5% es: " + ("$")+ df.format(recaudado5));
		System.out.println("El monto total recaudado por el impuesto del 10% es: " + ("$")+ df.format(recaudado10));
		System.out.println("El monto total recaudado por el impuesto del 15% es: " + ("$")+ df.format(recaudado15));
		System.out.println("El porcentaje de autos que superaron el valor de 1300000 es: " + porAutos + "%");
	}
	
	public static double calculaRecaudado(double impPagado, double recaudado) { // calcula la recaudacion total que obtuvo el registro por porcentaje
					
			return recaudado += impPagado  ;
	}

	public static float calculaImpuesto(double dato, double valorModelo, DecimalFormat df, int por) {	//Calcula el impuesto que debe pagar segun el valor de la patente
		float impPagado;
		impPagado= (float) ((dato*valorModelo));
		System.out.println("El porcentaje a pagar es del "+ por +"%: " + ("$")+df.format(impPagado));
		return impPagado;
	}

	public static int ingresaPatentes(Scanner scan) {		//Pide la cantidad de patentes que se desean prosesar
		int cantPatente;
		System.out.println("Ingrese la cantidad de patentes que desea procesar: ");
		cantPatente = scan.nextInt();
		
		
		
		return cantPatente;
	}

}
