package logicOperators;

public class OperadoresLogicos {
	
	public static void main(String [] args) {
		/*
		 - Operadores arintméticos (+, -, *, /, %)
		 - Operadores lógicos
		 - Operadores relacionales (=, +=, -=, *=, /=, <, >, <=, >=)
		 */
		
		double num1 = 12;
		double num2 = 7;
		
		double resultado = num1 / num2;
		System.out.println(resultado);
		
		/*
		double num1 = 12d;
		double num2 = 7d;
		
		double resultado = num1 / num2;
		System.out.println(resultado);
		*/
		
		/*Relacionales
			= asignación
			+= asignación suma
			-= asignación resta
			*= asignación multiplicación
			/= asignación división
			== igual que
			!= distinto que
			< menor que
			> mayor que
			<= menor igual que
			>= mayor igual que
		 */
		System.out.println(num1 >= num2);//true
		System.out.println(num1 <= num2);//false
		
		/*
		 * Operadores lógicos.
		 * AND (&&)
		 * OR (||)
		 * NOT (!)
		 */
		
		int numeroUno = 5;
		int numeroDos = 7;
		
		boolean comparacionUno = numeroUno == numeroDos;
		System.out.println(comparacionUno);//false
		
		boolean comparacionDos = (numeroUno < numeroDos) && (numeroUno > numeroDos);
		System.out.println(comparacionDos);//false
		
		boolean comparacionTres = (numeroUno < numeroDos) || (numeroUno > numeroDos);
		System.out.println(comparacionTres);//true
		
		boolean comparacionCuatro = false;
		System.out.println(!comparacionCuatro);//true
	}	

}
