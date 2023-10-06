package POO;

//libreria scanner
import java.util.Scanner;

public class TestUsuario {

	public static void main(String[] args) {
		
		//Cambiar la contrasenia de un objeto del tipo usuario
		//Felipe.setPassword (una donde la contraseña este vacia)
		//Felipe.setPassword (una donde la contraseña no este vacia pero sea igual a la anterior)
		//Felipe.setPassword (se cumplan las dos condiciones)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingresa tu tipo de usuario: ");
		String tipoUsuario = scan.nextLine();
		System.out.print("Ingresa tu nombre de usuario: ");
		String username = scan.nextLine();
		System.out.print("Ingresa tu contraseña: ");
		String password = scan.nextLine();
		
		Usuario userOne = new Usuario (tipoUsuario, username, password);
		
		System.out.println("------------------------------");
		System.out.println("Prueba de cambio de contraseña");
		System.out.println("------------------------------");
		
		System.out.print("Ingresa una contraseña vacía: ");
		userOne.setPassword(scan.nextLine());
		
		System.out.println(".  .  .  .  .  .  .  .  .  .  .  .");
		
		System.out.print("Ingresa la contraseña anterior (" + userOne.getPassword() + "): ");
		userOne.setPassword(scan.nextLine());
		
		System.out.println(".  .  .  .  .  .  .  .  .  .  .  .");
		
		System.out.print("Ingresa una nueva contraseña: ");
		userOne.setPassword(scan.nextLine());
		
		scan.close();

	}

}
