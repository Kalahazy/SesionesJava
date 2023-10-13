package Figura;

public interface Calculable {

	//Área, Volumen, Perímetro
	//Volumen: V = 4/3 π r³
	//Área: A = 4 π r*r
	//Perímetro: P = 2 * π * r
	
	// Métodos de la interfaz para calcular área, volumen y perímetro
    double calcularArea();
    double calcularVolumen();
    double calcularPerimetro();
		
}//Interface calculable