import java.util.Scanner;

public class Ex251 {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número para saber se ele é par ou ímpar: ");
		float num = entrada.nextFloat();
		
		if(num % 2 == 0) {
			System.out.println("par");
		}else 
			System.out.println("ímpar");
	
		entrada.close();
	}

}
