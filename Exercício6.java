import java.util.Scanner;
public class Exerc�cio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Insira um n�mero: ");
		int num= entrada.nextInt();
		
		if(num %  2 == 0)
			System.out.println("Este n�mero � par e foi transformado em impar virando o n�mero "+(num+1));
		else 
			System.out.println("Este n�mero � impar e foi transformado em par virando o n�mero "+(num+1));	
	
		entrada.close();
	}
}
