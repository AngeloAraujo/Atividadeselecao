import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o pre�o do produto:");
		double preco = entrada.nextDouble();
		System.out.println("Insira o c�digo de origem:");
		int codigo = entrada.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println("Pre�o do produto: R$ " + (new DecimalFormat("#,##0.00").format(preco) + " e procedente do Sul."));
		break;
		case 2: 
			System.out.println("Pre�o do produto: R$ " +(new DecimalFormat("#,##0.00").format (preco) + " e procedente do Norte."));
		break;
		case 3: 
			System.out.println("Pre�o do produto: R$ " + (new DecimalFormat("#,##0.00").format(preco) + " e procedente do Leste."));
		break;
		case 4: 
			System.out.println("Pre�o do produto: R$ " + (new DecimalFormat("#,##0.00").format(preco) + " e procedente do Oeste."));
		break;
		case 5: 
			System.out.println("Pre�o do produto: R$ " + (new DecimalFormat("#,##0.00").format(preco) + " e procedente do Nordeste."));
		break;	
		case 6: 
			System.out.println("Pre�o do produto: R$ " + (new DecimalFormat("#,##0.00").format(preco) + " e procedente do Nordeste."));
		break;
		case 7: 
			System.out.println("Pre�o do produto: R$ " + (new DecimalFormat("#,##0.00").format(preco) + " e procedente do Centro-Oeste."));
		break;
		case 8:	
			System.out.println("Pre�o do produto: R$ " + (new DecimalFormat("#,##0.00").format(preco) + " e procedente do Centro-Oeste."));
		break;
		default:
	        System.out.println ("Pre�o do produto: R$ " + (new DecimalFormat("#,##0.00").format(preco) + " este produto � importado"));
	        entrada.close();
	}
	}
}
