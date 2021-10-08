import java.util.Scanner;
public class Exercício24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		float nota1F = entrada.nextFloat();
		System.out.println("Digite a segunda nota:");
		float nota2F = entrada.nextFloat();
		System.out.println("Digite a terceira nota:");
		float nota3F = entrada.nextFloat();
		
		float mediaF = ((nota1F+nota2F+nota3F)/3);
		
		if((mediaF >= 7) && (mediaF != 10))
			System.out.println("Você está aprovado com média " + mediaF+".");
		else if(mediaF < 7)
			System.out.println("Você está reprovado com média " + mediaF+"."); 
		else if(mediaF == 10)
			System.out.println("Você foi Aprovado com Distinção."); 
		
		entrada.close();
	}

}
