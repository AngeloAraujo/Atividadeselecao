import java.util.Scanner;

public class Ex251 {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero para saber se ele � par ou �mpar: ");
		float num = entrada.nextFloat();
		
		if(num % 2 == 0) {
			System.out.println("par");
		}else 
			System.out.println("�mpar");
	
		entrada.close();
	}

}
