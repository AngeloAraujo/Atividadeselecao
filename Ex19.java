import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float deltaF;
				
		System.out.println("Digite o valor de a:");
		float valoraF = entrada.nextFloat();
		if(valoraF == 0) {
			System.out.println("N�o � uma equa��o de segundo grau.");
			System.exit(0);		
		}
		System.out.println("Digite o valor de b:");
		float valorbF = entrada.nextFloat();
		System.out.println("Digite o valor de c:");
		float valorcF = entrada.nextFloat();
		
		deltaF = (valorbF*valorbF) + (-4 * (valoraF*valorcF)); 
		if (deltaF < 0 ) {
			System.out.println("Delta negativo! Ent�o, a equa��o n�o possui raizes reais.");
			System.exit(0);	
		}else if(deltaF == 0) {
			System.out.println("Delta positivo! A equa��o possui apenas uma raiz real.");
		}else if(deltaF > 0) {
			System.out.println("Delta positivo!  equa��o possui duas raizes reais.");
		}
		
		float valorx1F = (float) ((-(valorbF) + Math.sqrt(deltaF)) / 2 * valoraF);
		float valorx2F = (float) ((-(valorbF) - Math.sqrt(deltaF)) / 2 * valoraF);
		
		System.out.println("valor de x1 = " + valorx1F);
		System.out.println("valor de x2 = " + valorx2F);
	
		entrada.close();
	}

}