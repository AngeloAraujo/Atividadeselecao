import java.util.Scanner;
public class Exerc�cio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Insira um n�mero: ");
		int num= entrada.nextInt();
		if(num > 0)
			System.out.println("Positivo");
		else if (num<0)
		System.out.println("Negativo");
		else
			System.out.println("Zero");
		entrada.close();

	}

}
