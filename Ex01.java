import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira o primeiro n�mero :");
		int num= entrada.nextInt();
		System.out.print("Insira o segundo n�mero :");
		int num2= entrada.nextInt();
		
		if (num > num2) {
		System.out.print("O n�mero maior �: "+num);
		}
		else {	
		System.out.println("O n�mero maior �: "+num2);
		
		}
		entrada.close();
	}
	}

