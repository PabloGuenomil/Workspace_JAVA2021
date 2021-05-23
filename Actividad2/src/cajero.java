import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class cajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fecha = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		String fechaString = sdf.format(fecha);
		
		Scanner scan = new Scanner(System.in);
		
		int precio = 0;
		double montoTotal = 0;
		int cont = 0;
		int cantProd= 0;
		
		
		
		final double IVA= 0.21;
		double Total= 0;
		double IVA2=0.21;
		double cTotal= 0;
		String hayArticulos= "s";
		String Nombre= "" ;
		String Domicilio="" ;
		String descripcion=""; 
		
		
		
		
		hayArticulos = hayArticulos(scan, hayArticulos);
		
		
		while ("s".equals(hayArticulos)) {
			System.out.println("Ingrese precio del producto");
			precio = pideInt(scan, precio);
			
			System.out.println("Ingrese descripcion del producto");
			descripcion = pideString (scan, descripcion);
			
			System.out.println("Ingrese la cantidad del producto");
			cantProd = pideInt(scan, cantProd);
			
			montoTotal = precio * cantProd;
			
			
			cont ++;
			cTotal = calculaSubtotal(cTotal, montoTotal);
			
			datosProductos(precio, montoTotal, cantProd, descripcion);
			
			
			
			hayArticulos = hayArticulos(scan, hayArticulos);
			
			
			
			
		}
		
		
		if (cont > 0) {
			IVA2 = calculaIVA(cTotal, IVA);
			
			Total= calculaTotal(IVA2, cTotal);
			System.out.println("Ingrese nombre del cliente");
		    Nombre = pideString(scan, Nombre);
		    System.out.println("Ingrese domicilio del cliente");
			Domicilio = pideString(scan, Domicilio);
			factura(Nombre, Domicilio, fechaString, cantProd, precio, descripcion, montoTotal, IVA2, cTotal, Total);
			
		}else 
			System.out.println("No habia articulos en la caja");
			
		
		
		
		
		
	}

	public static void datosProductos(int precio, double montoTotal, int cantProd, String descripcion) {
		System.out.println("******************************************************");
	    System.out.println("Cant    | Descripcion            |P. Unit     |P.Total");
	    System.out.println(cantProd +"       | "+ descripcion +"                  |"+precio+"         |"+ montoTotal);
	    System.out.println("******************************************************");
	}

	public static double calculaSubtotal(double montoTotal, double Total) { //calcula precio sin IVA
		Total = Total + montoTotal;
		return Total;
	}

	public static double calculaIVA(double Total, double IVA) { //Calcula el precio IVA 
		IVA = Total * IVA;
		return IVA;
	}
	
	public static double calculaTotal(double IVA2, double Total) { //Calcula el precio final
		
		Total = Total + IVA2;
		return Total;
	}

	//Imprime Factura
	public static void factura(String Nombre, String Domicilio, String fechaString, int cantProd, double precio, String descripcion, double montoTotal, double IVA2, double cTotal, double Total) {
		System.out.println("******************************************************");
		System.out.println(fechaString);
		System.out.println("******************************************************");
	    System.out.println("Nombre:" + Nombre);
	    System.out.println("Direccion:" + Domicilio);
	    System.out.println("******************************************************");
	    System.out.println("Cant    | Descripcion            |P. Unit     |P.Total");
	    System.out.println(cantProd +"       | "+ descripcion +"                  |"+precio+"         |"+ montoTotal);
	    System.out.println("******************************************************");
	    System.out.println("IVA:$" + IVA2);		
	    System.out.println("Subtotal:$" + cTotal);
	    System.out.println("Total:$" + Total);
	    System.out.println("******************************************************");
	}

	

	

	

	public static int pideInt(Scanner scan, int cantProd) {
		
		
		cantProd = scan.nextInt();
		scan.nextLine();
		return cantProd;
	}

	public static String pideString(Scanner scan, String valor) {
		
		
		valor= scan.nextLine();
		return valor;
	}

	

	public static String hayArticulos(Scanner scan, String hayArticulos) {	//verifica si hay articulos en la caja
		
		System.out.println("Hay articulos en la caja? s/n");
		hayArticulos = scan.nextLine();
		return hayArticulos;
	}

}
