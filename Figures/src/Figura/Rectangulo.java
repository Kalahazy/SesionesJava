//En ésta clase vamos a heredar el atributo de la clase abstracta Figura, y lo vamos a sobreescribir

package Figura;

//1. Aplicamos herencia
public class Rectangulo extends Figura{
	
	//Parámetros
	double base, altura;
	
	//Constructor
	Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		double formulaRectangulo = base * altura;
		return formulaRectangulo;
	}//Método calcularArea

}//Class Rectangulo