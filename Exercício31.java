import java.util.Scanner;
public class Exercício31 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valormorango1 = 2.50;
		double valormorango2 = 2.20;
		double valormaca1 = 1.80;
		double valormaca2 = 1.50;
		double totalmorango,totalmaca,valordesconto, desconto = 0;
		double total;
		
		System.out.println("Digite a quantidade (em kg) de morangos adquiridos:");
		float morangoF = entrada.nextFloat();
		System.out.println("Digite a quantidade (em kg) de maçãs adquiridas:");
		float macaF = entrada.nextFloat();
		
		double kg = morangoF+macaF;
		if(morangoF <= 5) {
		totalmorango = morangoF * valormorango1;
		total = totalmorango;
		}
		else {
		totalmorango = morangoF * valormorango2;
		total = totalmorango;
		}
		if(macaF <= 5) {
		totalmaca = macaF * valormaca1;
		total = total + totalmaca;
		}
		else {
		totalmaca = macaF * valormaca2;
		total = total + totalmaca;
		}
		if((kg > 8) || (total > 25)) {
		desconto = ((total/100)*10);
		valordesconto = total-desconto;
		System.out.println("Valor a ser pago com desconto de 10% R$ " + valordesconto);
		System.exit(0);		
		}
		System.out.println("Valor a ser pago: R$ " + total);
		entrada.close();
			
	}

}