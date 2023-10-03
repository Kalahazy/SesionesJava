package logicOperators;

public class Exercise {

	public static void main(String[] args) {
		
		//Enrique, Paola y Mariana se dirigen a la MacStore y deciden comprar un iphone 15 cada uno. La tienda tiene una promoción por el mes patrio: "Si el total de tu compra supera los 25 mil pesos, obten un 10% de descuento". Enrique, Paola y Mariana deciden comprar los tres equipos con una sola tarjeta. Al llegar a caja, la cajera les menciona que la tienda en estos momentos cuenta con una promoción de 12 meses sin intereses, por lo tanto, deciden pagar con la TDC de Mariana. ¿Cuál sería el costo total por los 3 equipos sin descuento? ¿Aplicaría el descuento en su compra? ¿Cuál sería el costo total con el descuento aplicado? ¿Cuánto pagarían mensualmente?
		
		int precio = 20000;
		byte cantidadCelulares = 3;
		int totalCompra = precio * cantidadCelulares;
		
		System.out.println("¿Cuál sería el costo total por los 3 equipos sin descuento?");
		System.out.println("El costo total de la compra es de: $" +  totalCompra + "\n");
		
	
		
		if(totalCompra > 25000){
			System.out.println("¿Aplicaría el descuento en su compra?");
			System.out.println("Se aplica el 10% de descuento en la compra debido a que el total a pagar excede los $25000" + "\n");
			float descuento = totalCompra - (totalCompra * 0.10f);
			
			System.out.println("¿Cuál sería el costo total con el descuento aplicado?");
			System.out.println("El precio con el 10% de descuento es de: $" + descuento + "\n");
			
			System.out.println("¿Cuánto pagarían mensualmente?");
			System.out.println("Se pagarán $"  + (descuento / 12) + " cada mes");
		}else{
			System.out.println("El descuento no aplica" + "\n");
			double precioSinDescuento = totalCompra /12d;
			System.out.println("¿Cuánto pagarían mensualmente?");
			System.out.println("Se pagarán $"  + precioSinDescuento + " cada mes");
		}

	}

}
