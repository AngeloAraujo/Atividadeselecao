import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Em qual período você estuda? Digite a letra  M para matutino; V para vespertino; N para noturno");
		
		String periodo = entrada.nextLine();
		
		if(periodo.equalsIgnoreCase ("m")) {
			System.out.println("Bom dia!");
		}else if (periodo.equalsIgnoreCase ("v")) {
			System.out.println("Boa tarde!");
		}else if (periodo.equalsIgnoreCase ("n")) {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Erro - Período informado não existe.");
		}
		entrada.close();
		}
	}