/*Ejercicio 4
Se conocen los apellidos y las notas de 70 alumnos que rindieron un final. Se
desea obtener e imprimir la nota promedio, y además una lista con los apellidos
y los nombres de los alumnos cuyas notas superan dicho promedio.*/


public class notasAlumnos { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int alumnos = 70;
		
		
		double promedio=0;
		
		
		String[] apellidos = new String [alumnos]; //Declaracion de arreglos de igual longitud que la cantidad de alumnos
		double[] notas = new double [alumnos];
		
		int j;
		
			
			for (j=0; j<notas.length; j++) { //Recorre el arreglo notas y acumula la suma total
				promedio +=notas[j];
				
				
				}
			
			promedio = promedio/j;			//Calcula el promedio
			
			System.out.println("Los que superaron el promedio fueron: ");	
			
			for (j=0; j<notas.length; j++) { //Vuelve a recorrer el arreglo notas
				
				if (promedio < notas[j]) {	//Busca las notas por encima del promedio
					
					System.out.println(apellidos[j]);//Imprime los nombres de los que superaron el promedio
					System.out.println("y su nota fue: " + notas[j] );	//imprime las notas que sacaron

			
			}
			}
		
		
		System.out.println("promerdio: " + promedio); //Imprime el promedio de las notas
		
	}

}
