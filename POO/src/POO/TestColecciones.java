package POO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColecciones {

	public static void main(String[] args) {
		//Implementación de ArrayList de Dentistas
		List<Dentista> listaDentistasArrayList = new ArrayList <>();
		
		//Primero genero una instancia de Dentista
		Dentista DrChapatin = new Dentista("Dr.Chapatin", "Chespirito", (byte)45, "11223344", "Chapatin@mail.com", "General", "666123455", "Consultorio 200", "avanzado", "matutino", 450);	
		//Luego la agrego a la lista
		listaDentistasArrayList.add(DrChapatin);
		
		//Si agrego la instancia a una variable, puedo imprimir su informacion usando un toString, o un metodo mostrarInfo();

		//Hago una instancia y la agrego directamente a la lista
		listaDentistasArrayList.add(new Dentista("Dr.Simi", "Lares", (byte)50, "123456789", "simi@lares.com", "Odontologia", "55113344", "500", "avanzado", "matutino", 500));
		
		//Si genero la instancia y la agrego directamente al arrayList, para sacar el dato tendre que utilizar un forEach o algun ciclo para imprimir dato por dato. 
		
//		~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//Implementacion de lista de Dentistas con un HashSet
		Set<Dentista>conjuntoDentistas = new HashSet <> ();
		
		//Agregando Dentista a mi conjunto
		conjuntoDentistas.add(new Dentista("Dr.Simi", "Lares", (byte)50, "123456789", "simi@lares.com", "Odontologia", "55113344", "500", "avanzado", "matutino", 500));
		
//		~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//Implementacion de un hashmap de Dentistas
		Map<String, Dentista> mapaDentistas = new HashMap<>();
		
		//Agregar un dentista a mi mapa
		mapaDentistas.put("Dr House", new Dentista ("Gregory", "House", (byte)55, "12345678", "house.com", "cirujano", "55113344", "Consultorio 600", "avanzado", "vespertino", 1400));
		
		//Imprimir el objeto Doctor House
		Dentista DoctorBuscado = mapaDentistas.get("Dr House");
		System.out.println(DoctorBuscado);

	}

}
