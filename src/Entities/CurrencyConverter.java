package Entities;

public class CurrencyConverter {
	private double valorDolar;
	private double valor;
	public double getValorDolar() {
		return valorDolar;
	}
	public void setValorDolar(double valorDolar) {
		this.valorDolar = valorDolar;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public CurrencyConverter(){
		
	}
	
	public double valorTotal(){
		   double total = valorDolar * valor;
           total += (total * 6 / 100);
           return total;
	}

}
