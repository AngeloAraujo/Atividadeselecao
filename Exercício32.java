import java.util.Scanner;
public class Exercício32 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double fileduplo1 = 4.90, fileduplo2 = 5.80;
		double alcatra1 = 5.90, alcatra2 = 6.80;
		double picanha1 = 6.90, picanha2 = 7.80;
		double valor=0,desconto = 0, valordesconto = 0;
		int tipo;
		String tipocarne = null, tipopagamento= null;
		System.out.println("Escolha o tipo de carne conforme o código? 1-Filé Duplo; 2-Alcatra; 3-Picanha");
		tipo = entrada.nextInt();
		System.out.println("Quantidade de carne comprada:" );
		float kgF = entrada.nextFloat();
		System.out.println("Digite a opção de pagamento. (1)Dinheiro ou (2)Cartão  ");
		tipo = entrada.nextInt();
		
		if((tipo==1) && (kgF <= 5)) {
			tipocarne="Filé Duplo";
	        valor = kgF * fileduplo1;
		}
		else if((tipo==1) && (kgF > 5)) {
			 tipocarne="Filé Duplo";
		      valor = kgF * fileduplo2;
		}
		
		if((tipo==2) && (kgF <= 5)) {
			tipocarne="Alcatra"; 
			valor = kgF * alcatra1;
		}
		else if((tipo==2) && (kgF > 5)) { 
			tipocarne="Alcatra";
			valor = kgF * alcatra2;
		}		          
		if((tipo==3) && (kgF <= 5)) {
			tipocarne="Picanha";
			valor = kgF * picanha1;
		}
		else if((tipo==3) && (kgF > 5)) { 
			tipocarne="Picanha";
			valor = kgF * picanha2;
		}
		if(tipo==2){
			tipopagamento="Cartão Tabajara";
			desconto = ((valor/100)*5);
			valordesconto = (valor-desconto);
		}
		else if (tipo==1) {
			tipopagamento="Dinheiro"; 
			valordesconto= valordesconto+0;
			
		}
		System.out.println("Produto: " + tipocarne);
		System.out.println("Quantidade do produto: " + kgF);
		System.out.println("Valor total sem desconto: R$" + valor);
		System.out.println("Tipo de pagamento " + tipopagamento);
		System.out.println("Valor do desconto: R$"+ desconto);
		System.out.printf("Valor total a pagar com desconto: R$ " + valordesconto);
		
		entrada.close();
	}

}
