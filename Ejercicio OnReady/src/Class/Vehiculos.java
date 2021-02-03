package Class;

import java.math.BigDecimal;

import Abstracts.Vehiculo;
import Interfaces.Tipificacion;

public class Vehiculos extends Vehiculo implements Tipificacion {

	private int cantidadRuedas;
	private int puertas = 0;
	private String cilindrada;
	
	public Vehiculos() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehiculos(int ruedas, String marca, String modelo, BigDecimal precio) {
		this.setCantidadRuedas(ruedas);
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
	}
	
	//Getters y Setters
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public BigDecimal getPrecio() {
		return precio;
	}
	
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	public int getCantidadRuedas() {
		return cantidadRuedas;
	}

	public void setCantidadRuedas(int cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}
	
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	
	@Override
	public String tipoDeVehiculo(int cantRuedas, int cilindradaOPuertas) {
		String retorno = "";
		if(cantRuedas == 2) {
			retorno = "Este vehiculo es una moto con "+cantRuedas+" de ruedas";
		}else if (cantRuedas == 4) {
			retorno = "Este Auto tiene "+cantRuedas+" de ruedas ";
		}else {
			retorno = "Esta nave tiene "+cantRuedas+" y si no es un camion, es un tanque de guerra";
		}
		return retorno;
	}

	@Override
	public String toString() {
		return this.marca+" "+this.modelo+" $"+this.precio+"\n";
	}
	

}
