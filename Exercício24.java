import java.util.Scanner;
public class Exerc�cio24 {

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
			System.out.println("Voc� est� aprovado com m�dia " + mediaF+".");
		else if(mediaF < 7)
			System.out.println("Voc� est� reprovado com m�dia " + mediaF+"."); 
		else if(mediaF == 10)
			System.out.println("Voc� foi Aprovado com Distin��o."); 
		
		entrada.close();
	}

}
