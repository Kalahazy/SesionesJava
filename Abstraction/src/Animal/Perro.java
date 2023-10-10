package Animal;

public class Perro extends Animal{//Herencia de la clase superior Animal

	//"Polimorfear" o sobreescribir el método heredado
	//Con la anotación @Override, le decimos a Java que el método hacerSonido será sobreescrito
	@Override
	public void hacerSonido() {
		System.out.println("El perrito ladra y hace waos");
	}//Método hacerSonido heredado de Animal
	
	
	public static void main(String[] args) {
		
		//Aquí NO hay polimorfismo, ya que instancio un animal genérico y utilizo su método hacerSonido
		Animal Generico = new Animal();	//Genera un animal genérico (abstracto)
		Generico.hacerSonido();	//Antes de la ejecución
		
		
		// ----- Polimorfismo en tiempo de ejecución
		//Generar la instancia de mi perro
		//Aqui SI hay polimorfismo, porque es el equivalente a decir "instancio un animal que es un perrito"
		//Referenciar primero la clase general, y luego la instancia particula, permite el polimorfismo
		Animal Chilaquil = new Perro();
		Chilaquil.hacerSonido();	// ----- Polimorfismo en tiempo de ejecución
		
	}//Método main

}//Clase Perro