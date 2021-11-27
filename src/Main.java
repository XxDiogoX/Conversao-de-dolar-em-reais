import java.util.Locale;
import java.util.Scanner;

import Entities.CurrencyConverter;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter c1 = new CurrencyConverter();
		System.out.println("What dollar value?");
		System.out.print("Value: ");
		double valor = sc.nextDouble();
		c1.setValorDolar(valor);
		System.out.println("What value");
		System.out.print("Value: ");
		double valor2 = sc.nextDouble();
		c1.setValor(valor2);
		System.out.println(c1.valorTotal());
		
		
		
		
		
		sc.close();

	}

}
