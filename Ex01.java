import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira o primeiro número :");
		int num= entrada.nextInt();
		System.out.print("Insira o segundo número :");
		int num2= entrada.nextInt();
		
		if (num > num2) {
		System.out.print("O número maior é: "+num);
		}
		else {	
		System.out.println("O número maior é: "+num2);
		
		}
		entrada.close();
	}
	}

