import java.util.Scanner;
public class Ex23 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a idade do primeiro aluno:");
		int idade1 = entrada.nextInt();
		System.out.println("Digite a idade do segundo aluno:");
		int idade2 = entrada.nextInt();
		System.out.println("Digite a idade do tercero aluno:");
		int idade3 = entrada.nextInt();

		float mediaF = ((idade1+idade2+idade3)/3);
		
		if(mediaF < 25) {
			System.out.println("Turma Jovem.");
		}else if((mediaF >= 25) && (mediaF <= 40)) {
			System.out.println("Turma Adulta.");
		}else
			System.out.println("Turma Idosa.");
		
		entrada.close();
	}
	
}
