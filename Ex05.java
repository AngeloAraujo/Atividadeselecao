import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira uma letra do alfabeto: ");
		String letra = entrada.nextLine();
			
		if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") ||letra.equalsIgnoreCase("I") ||letra.equalsIgnoreCase("O") ||letra.equalsIgnoreCase("U")) {
			System.out.println("A letra "+letra+ " é uma vogal");
		}else 
			System.out.println("A letra "+letra+ " não é uma vogal");
	   
		entrada.close();
	}

}
