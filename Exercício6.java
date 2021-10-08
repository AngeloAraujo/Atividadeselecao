import java.util.Scanner;
public class Exercício6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Insira um número: ");
		int num= entrada.nextInt();
		
		if(num %  2 == 0)
			System.out.println("Este número é par e foi transformado em impar virando o número "+(num+1));
		else 
			System.out.println("Este número é impar e foi transformado em par virando o número "+(num+1));	
	
		entrada.close();
	}
}
