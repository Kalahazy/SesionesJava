package POO;

public class AsistenteDental {

	//1 Atributos
	private String fechaIngreso;
	private double salario;
	
	//2 Constructor público (dejo el constructor público para poder acceder a él de forma sencilla)
	public AsistenteDental (String fechaIngreso, double salario) {
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}
	
	
	//3 Metodos
	//Metodo para imprimir informacion
	public void mostrarDatosAsistente() {
		System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
		System.out.println("El salario del asistente es: " + salario);
	}
	
	
	//Getters y setters para poder acceder a mis datos privados y poder realizar operaciones con ellos.
	//Sin getters, la informacion me aparece en null
	//Sin setters, no puedo cambiar la información
	
	
	//Este getter permite retornar el dato de la fecha de ingreso en formato String
	public String getFechaIngreso() {
		return fechaIngreso;
	}//getter Fecha de Ingreso
	
	//getter para salario
	public double getSalario() {
		return salario;
	}//getter Salario
	
	//setter para salario (modificar los datos)
	public void setSalario(double nuevoSalario) {
		if ( (nuevoSalario > 0) && (nuevoSalario < 100) ) {
			salario = nuevoSalario;
		}
	}
	
	
} //cierre asistente dental
