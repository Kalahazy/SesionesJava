package dataTypes;

public class DatosPrimitivos {

	public static void main(String[] args) {
		/*
		 * Datos primitivos.
		 * Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos:
		 *  - byte
		 *  - short
		 *  - int
		 *  - long
		 *  - float
		 *  - double
		 *  - boolean
		 *  - char
		 */
		
		//System.out.println();	//sysout -> Ctrl+Espacio || syso -> Ctrl+Espacio
		
		// Byte.ValorMin y Byte.ValorMAX
		byte minByte = Byte.MIN_VALUE;	//tipoDeDatoByte.PropiedadEncontrarValorMínimo
		byte maxByte = Byte.MAX_VALUE;	//tipoDeDatoByte.PropiedadEncontrarValorMáximo
		System.out.println("El valor mínimo de byte es: " + minByte);
		System.out.println("El valor máximo de byte es: " + maxByte);
		
		// Short.ValorMin y Short.ValorMAX
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor mínimo de short es: " + minShort);
		System.out.println("El valor máximo de short es: " + maxShort);
		
		// Int.ValorMin y Int.ValorMAX
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor mínimo de int es: " + minInt);
		System.out.println("El valor máximo de int es: " + maxInt);
		
		// Long.ValorMin y Long.ValorMAX
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor mínimo de long es: " + minLong);
		System.out.println("El valor máximo de long es: " + maxLong);
		
		// Float.ValorMin y Float.ValorMAX
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("El valor mínimo de float es: " + minFloat);
        System.out.println("El valor máximo de float es: " + maxFloat);

        // Double.ValorMin y Double.ValorMAX
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("El valor mínimo de double es: " + minDouble);
        System.out.println("El valor máximo de double es: " + maxDouble);

        // Char.ValorMin y Char.ValorMAX
        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        System.out.println("El valor mínimo de char es: " + minChar);
        System.out.println("El valor máximo de char es: " + maxChar);
        
        long isbn = 9788499169019L;
        System.out.println(isbn);
        
        float salary = 15000f;
        System.out.println(salary);
        
        double ISR = 1239.45d;
        System.out.println(ISR);
        
        System.out.println("////////////////////////////////////////////////////");
        
        char valorChar1 = 64;
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);
		
		/*
		 * Casteo (Conversión de tipos de datos en Java)
		 * - Automatico (dato más pequeño a un dato más grande)
		 * - Manual (dato más grande a un dato más pequeño)
		 */
		
		// Automático
		
		int myNumber = 125;
		System.out.println(myNumber);
		// Convertir int a double (int < double)
		double myCasting = myNumber;
		System.out.println(myCasting);
		//Convertir short a int (short < int)
		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		// Manual
		
		// Convertir double a int (double > int)
		int myNewCasting = (int) myCasting;
		System.out.println(myNewCasting);
		//Convertir float a int (float > int)
		float myFloat = 1.99f;
		System.out.println(myFloat);
		int myNewFloat = (int) myFloat;	//Redondea hacia abajo
		System.out.println(myNewFloat);
		
		//"Ejercicio"
		//Convertir char a int - Es manual porque char < int
		char myChar = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);
	}

}