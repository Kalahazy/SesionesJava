package Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	
	public static void main (String[] args) {
		
		//Implementación de un Array
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
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		
		//Implementación de un arrayList
		//Clase General (interfaz), tipo de dato que usaré, nombre de mi estructura de datos, instancia de dicha clase general
		List<String> listaDeContactos = new ArrayList<>();
		
		//Agrego elementos del tipo String a mi arrayList llamado listaDeContactos
		listaDeContactos.add("Felipe");
		listaDeContactos.add("Roberto");
		listaDeContactos.add("Alicia");
		listaDeContactos.add("Fatima");
		
		//Obtener un elemento de la lista - asignarlo a una variable
		String datoFelipe = listaDeContactos.get(0);
		System.out.println(datoFelipe);
		
		//Modificar un elemento de la lista
		listaDeContactos.set(0, datoFelipe + " De Jesús");
		String newDatoFelipe = listaDeContactos.get(0);
		System.out.println(newDatoFelipe);
		
		//Borrar un elemento de la lista
		listaDeContactos.remove(1);
		System.out.println(listaDeContactos);
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		
		//Implementación de un conjunto (SET)
		//Sintaxis
		//Set - Interface de donde implemento
		//<String> - Tipo de dato que usaré
		//cartasDeJuego - Nombre que le doy al conjunto
		//new HashSet<>() - Instancia de la clase específica
		Set<String> cartasDeJuego = new HashSet<>();
		
		//Agregar elementos
		cartasDeJuego.add("As de Corazónes");
		cartasDeJuego.add("2 de picas");
		cartasDeJuego.add("Reina de Treboles");
		
		//No puedo saber posiciones, solo saber si lo contiene
		if ( cartasDeJuego.contains("Reina de Treboles") ) {
			System.out.println("La reina de tréboles si está en el conjunto");
		}else {
			System.out.println("No encuento el elemento solicitado");
		}
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		
		//Implementación de un mapa (HashMap)
		Map <String, String> libretaDirecciones = new HashMap<>();
		
		//Agregar elementos a mi libreta de direcciones, donde K = nombre y V = dirección
		libretaDirecciones.put("Felipe", "Tlalnepantla");
		libretaDirecciones.put("Doctor Simi", "CDMX");
		libretaDirecciones.put("Konoha", "Naruto");
		
		//Método para sacar información de la libreta, creando una nueva variable
		String direccionFelipe = libretaDirecciones.get("Felipe");
		String direccionNaruto = libretaDirecciones.get("Naruto");
		
		//Impresión
		System.out.println(direccionFelipe);
		System.out.println(direccionNaruto);
		
		
		
	}

}


/*
  
Colecciones
  
	- Arrays (arreglos):
  	Es una estructura de datos lineal que contiene elementos del mismo tipo. Los elementos están almacenados de forma contigua (uno al lado del otro), y se pueden acceder a ellos a través de un índice.
  	Las principales características de un array son:
		- Es una estructura de datos fija, generalmente almacena datos del mismo tipo
  		- La longitud de un array se establece al momento de crearlo, y no cambia.
  		- Podemos acceder a elementos por medio de un indice
  		- Los arrays pueden contener datos primitivos y objetos
  		- No proporciona métodos adicionales para agregar o eliminar elementos
 	Un ejemplo de array es una lista de compras del supermercado.
  	
  	- ArrayList
  	Es una implementación de una lista (List), es decir, que está en un nivel abajo de laas listas. Utiliza un array dinámico que permite almacenar datos.
  	Sus principales características son:
  		- Tamaño dinámico, a diferencia de los arrays tradicionales, el tamaño de un arrayList 			si se puede modificar.
  		- Acceso rápido, podemos acceder a un elemento del arrayList por su posición o índice.
  		- Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, 			tengo que recorrer todos los demás elementos.
  		
  	- Set (conjunto)
  	Es una estructura de datos que almacena datos unicos sin orden especifico. 
  	Las principales caracteristicas de un set son:
		- No hay elementos duplicados, ya que los conjuntos no los pueden contener. Si se 			intenta agregar un elemento ya existente, la operacion se ignora.
		- No hay una orden especifico, los elementos se almacenan sin orden especifico
		- La busqueda es mas sencilla, ya que al no tener elementos duplicados se usa una 			funcion hash para encontrar elemento deseado.
  	
  	- Map (mapas)
  	Es una estructura de datos que almacena pares de clave-valor
  	Sus principales características son:
  		- Almacenamiento con pares K-V
		- Sin orden especifico (similar a un Set)
		- Busqueda rapida, la busqueda se hace por medio de un valor (key), y usa una funcion 			interna hash para buscar elementos.
	 Un ejemplo puede ser una agenda telefonica (agregar, modificar, eliminar)
  	
  	
  
 */