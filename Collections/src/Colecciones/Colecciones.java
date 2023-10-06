package Colecciones;

public class Colecciones {
	
	public static void main (String[] args) {
		
		//Array
		//String[] - Tipo de dato del array
		//listaDeCompras - Nombre del array
		//new String[] - instancia del objeto arreglo
		//{"Leche", "Pan", "Huevos"} - datos del arreglo
		String[] listaDeCompras = new String[] {"Leche", "Pan", "Huevos"};
		
		//Esta impresion solo muestra el espacio de memoria
		System.out.println(listaDeCompras);
		
		//Imprimir info de listaDeCompras con un forEach
		//Para el dato de tipo String que llamaremos productoImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir
		for(String productoImprimir : listaDeCompras) {
			System.out.println(productoImprimir);
			
		}
		
	}

}


/*
  
Colecciones
  
	- Arrays (arreglos):
  	Es una estructura de datos lineal que contiene elementos del mismo tipo. Los elementos están almacenados de forma contigua (uno al lado del otro), y se pueden acceder a ellos a través de un índice. Las principales características de un array son:

		- Es una estructura de datos fija, generalmente almacena datos del mismo tipo
  		- La longitud de un array se establece al momento de crearlo, y no cambia.
  		- Podemos acceder a elementos por medio de un indice
  		- Los arrays pueden contener datos primitivos y objetos
  		- No proporciona métodos adicionales para agregar o eliminar elementos
  		
  	Un ejemplo de array es una lista de compras del supermercado.
  
 */