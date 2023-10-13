package Figura;

public class TestFiguras {

	public static void main(String[] args) {
		
		//Generar las instancias de nuestras clases
		
		//1. Instancia de la clase figura
//		Figura Generica = new Figura();	//La clase Figura es abstracta, pierde la capacidad de instanciar
		
		//2. Instancia de un rectángulo
		Figura rectangulo = new Rectangulo(5.0, 6.5);	//base y altura
		
		//3. Instancia de un circulo
		Figura circulo = new Circulo(3.14, 3.0);	//pi y radio
		
		//4. Instancia de un cuadrado
		Figura cuadrado = new Cuadrado(5);	//lado
		
		
		//Invocación del método
		System.out.println( rectangulo.calcularArea() );
		System.out.println( circulo.calcularArea() );
		System.out.println( cuadrado.calcularArea() );
		
		//Instancia de una esfera
		Calculable esfera = new Esfera(15.0);
		//Invocación de los métodos
		System.out.println( esfera.calcularArea() );
		System.out.println( esfera.calcularVolumen() );
		System.out.println( esfera.calcularPerimetro() );
		
		
	}//Método main
	
}//Class TestFiguras