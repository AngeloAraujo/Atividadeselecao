import java.util.Scanner;
public class Exercício30 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valoralcool = 1.90;
		double valorgasolina = 2.50;
		double desconto;
		double totalapagar = 0;
		
		System.out.println("Escolha o tipo de combustível: A- Álcool; G-Gasolina.");
		String tipocombustivel = entrada.nextLine();
		System.out.println("Número de litros vendidos:");
		float litrosF = entrada.nextFloat();
		
		if (("A".equalsIgnoreCase(tipocombustivel)) && (litrosF <= 20)) { 
		valoralcool = litrosF * 1.90;
		desconto = valoralcool * 0.03;
		totalapagar = valoralcool-desconto;
		}	
		else if (("A".equalsIgnoreCase(tipocombustivel)) && (litrosF > 20)){
		valoralcool = litrosF * 1.90;
		desconto = valoralcool * 0.05;
		totalapagar = valoralcool-desconto;
		}
		if(("G".equalsIgnoreCase(tipocombustivel)) && (litrosF <= 20)){
		valorgasolina = litrosF * 2.50;
		desconto = valorgasolina * 0.04;
		totalapagar = valorgasolina-desconto;
		}	
		else if(("G".equalsIgnoreCase(tipocombustivel)) && (litrosF > 20)) {
		valorgasolina = litrosF*2.50;
		desconto = valorgasolina * 0.06;
		totalapagar = valorgasolina-desconto;
		}				
			System.out.println("Valor a ser pago: R$ "+totalapagar);
		entrada.close();
		
	}
}

