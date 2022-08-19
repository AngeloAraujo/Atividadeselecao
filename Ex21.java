import java.util.Scanner;
public class Ex21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite uma data no formato dd/mm/aaaa: ");
		System.out.println("Dia:");
		int dia = entrada.nextInt();
		System.out.println("Mês:");
		int mes = entrada.nextInt();
		System.out.println("Ano:");
		int ano = entrada.nextInt();
		
		if ((dia == 0) || (dia > 31) || ((mes == 0) || (mes > 12)) || (ano  < 0)|| ((dia==30) && (mes==2))) {
			System.out.println("Data inválida.");
		}
		else if((dia >= 1) && (dia <= 31)&&(mes >= 1) && (mes <= 12)&&(ano  > 0)) {
					System.out.println("Data válida.");
		}		
			
		entrada.close();		
	}

	}
