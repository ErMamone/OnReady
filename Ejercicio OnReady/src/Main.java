import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Class.Vehiculos;

public class Main {

	public static void main(String[] args) {
		
		String vehiculoMasCaro;
		String vehiculoMasBarato;
		String vehiculoQueContieneLaLetraY;
		
		List<Vehiculos> lista = new ArrayList<Vehiculos>();
		
		cargaDeDatos(lista);
		
		vehiculoMasCaro=vehiculoMasCaro(lista);
		vehiculoMasBarato=vehiculoMasBarato(lista);
		vehiculoQueContieneLaLetraY=vehiculoQueContieneLaLetraY(lista);
		ordenarPorPrecio(lista);
		
		System.out.println(vehiculoMasCaro);
		System.out.println(vehiculoMasBarato);
		System.out.println(vehiculoQueContieneLaLetraY);
		
		for ( Vehiculos vh : lista) {
			System.out.print(vh.toString());
		}
		

		
	}
	
	public static void cargaDeDatos(List<Vehiculos> lista){
		Vehiculos v1 = new Vehiculos();
		Vehiculos v2 = new Vehiculos(2, "Honda", "Titan", new BigDecimal(60000).setScale(2));
		Vehiculos v3 = new Vehiculos(4, "Peugeot", "208", new BigDecimal(250000).setScale(2));
		Vehiculos v4 = new Vehiculos();
		
		
		v1.setCantidadRuedas(4);
		v1.setMarca("Peugeot");
		v1.setModelo("206");
		v1.setPrecio(new BigDecimal(200000).setScale(2));
		
		v4.setCantidadRuedas(2);
		v4.setMarca("Yamaha");
		v4.setModelo("YBR");
		v4.setPrecio(new BigDecimal(80500).setScale(2));
		
		v1.setCantidadRuedas(4);
		v1.setPuertas(4);

		v2.setCantidadRuedas(2);
		v2.setCilindrada("125c");
		
		v3.setCantidadRuedas(4);
		v3.setPuertas(5);
		
		v4.setCantidadRuedas(2);
		v4.setCilindrada("160c");
		
		v4.setPrecio(v4.getPrecio().add(new BigDecimal(0.50)));
		
		lista.add(v1);
		lista.add(v2);
		lista.add(v3);
		lista.add(v4);
	}
	
	public static String vehiculoMasCaro(List<Vehiculos> lista) {
		Vehiculos aux = lista.get(0);
		
		for(Vehiculos vehiculo : lista) {
			if(aux.getPrecio().compareTo(vehiculo.getPrecio()) == -1 ) {
				aux = vehiculo;
			}
		}
		
		return "El Vehiculo mas caro: "+aux.getMarca()+" "+aux.getModelo()+" $"+aux.getPrecio();
	}
	
	public static String vehiculoMasBarato(List<Vehiculos> lista) {
		Vehiculos aux = lista.get(0);
		
		for(Vehiculos vehiculo : lista) {
			if(aux.getPrecio().compareTo(vehiculo.getPrecio()) == 1 ) {
				aux = vehiculo;
			}
		}
		
		return "El Vehiculo mas barato: "+aux.getMarca()+" "+aux.getModelo()+" $"+aux.getPrecio();
	}
	
	public static String vehiculoQueContieneLaLetraY(List<Vehiculos> lista) {
		Vehiculos aux = new Vehiculos();
		
		for(Vehiculos vehiculo : lista) {
			if(vehiculo.getModelo().contains("Y") ) {
				aux = vehiculo;
			}
		}
		
		return "El Vehiculo contiene en el modelo la letra 'Y': "+aux.getMarca()+" "+aux.getModelo();
	}
	
	public static void ordenarPorPrecio(List<Vehiculos> lista) {
		lista.sort(Comparator.comparing(Vehiculos::getPrecio).reversed());
	}

}
