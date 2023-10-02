package POO;

public class Test {
	
	//Método principal para instanciar mis clases
	public static void main(String[] args) {
		
		//Instancia de Persona
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "5512345678", "felipe@mail.com");
		
		System.out.println(Felipe);
		Felipe.imprimirInfo();
		Felipe.saludar();
		
		
		System.out.println("**********************");
		
		//Instancia de Dentista
		Dentista Simi = new Dentista("Dr. Simi", "Lares", (byte)50, "1234567890", "simi@lares.com", "Odontología", "1544385", "Consultorio B5", "avanzado", "matutino", 500);
		
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();
		
		
	}//Cierre método main

}//Cierre class persona
