package POO;

public class TestAsistenteDental {

	public static void main(String[] args) {
		
		//Instancia de nuestro asistente
		AsistenteDental Francisca  = new AsistenteDental("05/10/2023", 875.40d);
		
		//Impresion de la información de nuestro asistente
//		Francisca.mostrarDatosAsistente();

		//El sueldo de Francisca no es de 875.4, es de 87.54
		//Cambio de sueldo
//		Francisca.salario = 87.5d;
		
		
		//Mostrar solo el sueldo
		System.out.println(Francisca.getSalario());
		
		//Modificar salario con el setter
		Francisca.setSalario(300.00);	//Es mayor a 0 pero igual mayor a 100, NO cumple
		System.out.println(Francisca.getSalario());
		Francisca.setSalario(30.00);	//Es mayor a 0 y menor a 100, SI cumple
		System.out.println(Francisca.getSalario());
		
	}

}
