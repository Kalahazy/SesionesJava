package dataTypes;

public class DatosEstructurados {

	public static void main(String[] args) {
		
		/*
		 Datos estructurados:
		 * Son datos complejos que almacenan carcteres, cadenas de caracteres, o bien algun tipo de dato primitivo
		 	- String.
		 		Cadena de caracteres, se declaran entre comillas y hay que definir el tipo de 				dato con la palabra reservada String. Los String en Java se consideran objetos.
		 	- Array.
		 	- Creados por el usuario (API JAVA)
		 */
		String myString = "Hola, soy un String";
		System.out.println(myString);
		
		String helloString = new String("Hola, soy un segundo String");
		System.out.println(helloString);
		
		
		// Métodos para Strings
		String texto ="AsdFghjKlñ";
		// String.length - Método que permite medir la longitud de una cadena de caracteres 
		System.out.println("La longitud de la variable texto de tipo String es " + texto.length()); 
		
		/*Guardando la variable texto en una nueva variable de tipo int para pasarle el metodo length
		 * int metodoLength = texto.length();
		 * output: 10
		 * Imprimimos en consola la nueva variable
		 * System.out.println(metodoLength);
		 * */
		
		//String.toUpperCase()
		String upperCase = texto.toUpperCase();
		System.out.println("Aplicando el método toUpperCase: " + upperCase); 
		//String.toLowerCase()
		String lowerCase = texto.toLowerCase ();
		System.out.println("Aplicando el método toLowerCase; " + lowerCase); 
		
		//String.indexOf() - Devuelve el índice de la primera aparición de un texto específico
		String fraseMotivacional = "Todo es temporal, echale ganitas";
		int indexOf = fraseMotivacional.indexOf("temporal");
		System.out.println("La palabra 'temporal' inicia en el indice: " + indexOf);
		
		// Concatenación
		String firstName = "Daniel ";
		String lastName = "Maldonado";
		
		String userName = firstName + " " + lastName;
		System.out.println(userName);
		
		System.out.println(firstName.concat(lastName));
		
		//Métodos de conversión
		String presupuesto = "50000";
		System.out.println("El presupuesto es de $" + presupuesto + " y el tipo de dato es " + presupuesto.getClass().getSimpleName());
		
		int parseao = Integer.parseInt(presupuesto);
		System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseao + " de tipo " + ((Object)parseao).getClass().getSimpleName());
		
		
		/*
		 * Arrays.
		 Conocidos como arreglos, se trata de una colección de datos del mismo tipo donde cada elemento corresponde a una posición identificada por índices numéricos. Cuando trabajamos con arreglos de dos dimensiones (bidimensionales), usamos el término matriz
		 */
		
		String[] cars = {"Volkswagen", "Mazda", "Kia", "Ford"};
		System.out.println(cars);
		
		/*
		 * Variable por tipo de declaración
		 * -- Variables dinámicas. Son aquellas que se declaran con un valor pero que dicho valor puede cambiar durante el proceso.
		 * -- Variables constantes o finales. Su valor no puede modificarse.
		 * -- Variables literales (palabras reservadas). Su identificador es la representación de su valor y ya tiene un significado en el código fuente de Java 
		 * 
		 */
		//Variables dinámicas
				float gastosMensuales = 35684.30f;
				System.out.println(gastosMensuales);
				
				gastosMensuales = 42699.2f;
				System.out.println("Ahora mis gastos mensuales ascienden a " + gastosMensuales);
				
				//Variables finales o constantes
				final int SALARIO = 15000; //buena practica, nombres de variables en mayuscula
				System.out.println(SALARIO);
	}

}













