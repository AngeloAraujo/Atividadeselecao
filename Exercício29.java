import java.util.Scanner;
public class Exerc�cio29 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int Criminoso = 0;
		System.out.println("Question�rio criminal! Responda as perguntas abaixo com sim ou n�o.");
		System.out.println("Telefonou para v�tima?");
		String resposta1 = entrada.nextLine();
			if(resposta1.equalsIgnoreCase ("sim")) {
			Criminoso =	(Criminoso+1);
			}else {
			Criminoso= (Criminoso+0);	
			}	
		System.out.println("Esteve no local do crime?");
		String resposta2 = entrada.nextLine();
		if(resposta2.equalsIgnoreCase ("sim")) {
		Criminoso =	(Criminoso+1);
		}else {
		Criminoso= (Criminoso+0);}
		
		System.out.println("Mora perto da v�tima?");
		String resposta3 = entrada.nextLine();
		if(resposta3.equalsIgnoreCase ("sim")) {
		Criminoso =	(Criminoso+1);
		}else {
		Criminoso= (Criminoso+0);}
		
		System.out.println("Devia para v�tima?");
		String resposta4 = entrada.nextLine();
		if(resposta4.equalsIgnoreCase ("sim")) {
		Criminoso =	(Criminoso+1);
		}else {
		Criminoso= (Criminoso+0);}
	
		System.out.println("J� trabalhou com a v�tima?");
		String resposta5 = entrada.nextLine();
		if(resposta5.equalsIgnoreCase ("sim")) {
		Criminoso =	(Criminoso+1);
		}else {
		Criminoso= (Criminoso+0);}
		
		if(Criminoso == 2) {
			System.out.println("Suspeita.");
		}else if((Criminoso == 3) || (Criminoso == 4)) {
			System.out.println("C�mplice.");
		}else if(Criminoso == 5) {
			System.out.println("Assassino.");
		}else 
			System.out.println("Inocente.");
		
		entrada.close();
	}

}
