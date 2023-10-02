package flujoControl;
import java.util.Scanner;

public class EjercicioEdadPaciente {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la edad del paciente: ");
		int edad = scan.nextInt();
		scan.close();
		boolean mayorEdad = (edad >= 18)?true:false; //resultado = (condicion)?valor1:valor2;
		if (mayorEdad) {
			System.out.println("Su chamaco ya puede votar");
		} else {
			System.out.println("Su morro todavia no puede votar");
		}
		
	}
	
}