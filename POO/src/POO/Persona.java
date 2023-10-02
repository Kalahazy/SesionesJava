package POO;

public class Persona {
	
	//1 Atributos (info de como se mostrará mi objeto cuando se instancie)
	String nombre;
	String apellido;
	byte edad; //para tener una correcta asignación de memoria
	String telefono;
	String email;
	char  sexo; //H / M
	
	
	//2 Constructor con parámetros
	Persona(String nombre, String apellido, byte edad, String telefono, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
	}//cierre constructor
	
	
	//3 Métodos (lo que podrá hacer mi objeto)
	void imprimirInfo() {
		System.out.println("El nombre es " + nombre);
		System.out.println("El apellido es: " + apellido);
		System.out.println("La edad es: " + edad);
		System.out.println("El teléfono es: " + telefono);
		System.out.println("El email es: " + email);
	}//cierre imprimirIfno
	
	void saludar() {
		System.out.println("Hola, te mando saluditos");
	}//cierre saludar
	
	
	//4 Instancia
	
	
	
}//Cierre POO
