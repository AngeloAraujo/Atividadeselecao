import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");  
		float nota1f = entrada.nextFloat(); 
		System.out.print("Digite a segunda nota: ");
		float nota2f = entrada.nextFloat();
		
		float mediaf = ((nota1f + nota2f) / 2);
		
		if((mediaf >= 0) && (mediaf < 3)) {
			System.out.println("Reprovado!");
		}else if((mediaf >= 3) && (mediaf <= 6.9)) {
			System.out.println("Em exame!");
		}else if((mediaf >= 7) && (mediaf <= 10)) {
			System.out.println("Aprovado!");
		}
		entrada.close();

	}

}