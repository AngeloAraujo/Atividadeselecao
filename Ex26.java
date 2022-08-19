import java.util.Scanner;		
public class Ex26 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite um número. ");
		float num = entrada.nextFloat();
		
		if(num % 1 != 0) {
			System.out.println("Este é um número decimal.");
		}else 
			System.out.println("Este é um número inteiro.");
		
		entrada.close();
	}

}
