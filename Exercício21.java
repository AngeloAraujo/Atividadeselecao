import java.util.Scanner;
public class Exerc�cio21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite uma data no formato dd/mm/aaaa: ");
		System.out.println("Dia:");
		int dia = entrada.nextInt();
		System.out.println("M�s:");
		int mes = entrada.nextInt();
		System.out.println("Ano:");
		int ano = entrada.nextInt();
		
		if((dia >= 1) && (dia <= 31)&&(mes >= 1) && (mes <= 12)&&(ano  > 0)) 
					System.out.println("Data v�lida.");
		
		if((((dia == 0) || (dia > 31))) || ((mes == 0) || (mes > 12)) || (ano  < 0))
			System.out.println("Data inv�lida.");
			
		entrada.close();		
	}

	}
