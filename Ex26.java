import java.util.Scanner;		
public class Ex26 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite um n�mero. ");
		float num = entrada.nextFloat();
		
		if(num % 1 != 0) {
			System.out.println("Este � um n�mero decimal.");
		}else 
			System.out.println("Este � um n�mero inteiro.");
		
		entrada.close();
	}

}
