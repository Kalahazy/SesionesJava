//Vamos a usar clases abstractas para evitar la instanciación de objetos que no necesito (generalmente son objetos muy abstractos, como persona, figura, transporte, animal, comida, arte, operaciones matemáticas, lecturas, ropa, plantas, paises, etc)


package Figura;

//Utilizando clases abstractas, evitamos las instancias no necesarias

//Para que una clase se vuelva abtracta, usamos la palabra reservada abstract antes de class
public abstract class Figura {
	
	//Declaramos un método abstracto (no tiene cuerepo)
	//Método abstracto nos dice QUE TENEMOS QUE HACER, pero NO NOS DICE COMO
	public abstract double calcularArea();
	
}//Clase Figura

/*
NOTA: Las clases abstractas pierden la capacidad de instanciar
Una clase abstracta, necesita si o si métodos abstractos
Cuando usamos clases abstractas, estamos "obligados" a utilizar todos los metodos abstractos
*/