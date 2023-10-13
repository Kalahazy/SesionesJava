package Figura;


//clase concreta que implementa metodos de una interfaz llamada calculable
public class Esfera implements Calculable {

	
	//Atributos
	double radio, pi = 3.1416;
	
	@Override
	public double calcularArea() {
		//Area= 4 π r*r
		double area = (4* pi)*(radio*radio);
		return area;

	}

	@Override
	public double calcularVolumen() {
		//V = 4/3 π r³
		return 0;
	}

	@Override
	public double calcularPerimetro() {
		//Perimetro 2 * π * r 
		return 0;
	}

	
	
	
	
	
	
	
	
	
	
}//class esfera
