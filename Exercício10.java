import java.util.Scanner;
public class Exerc�cio10 {

	public static void main(String[] args) {

	Scanner entrada = new Scanner (System.in);
	int maior=0;
	int menor=0;		
	System.out.println("Digite o 1� n�mero: ");
	int  num1 = entrada.nextInt();
	  System.out.println("Digite o 2� n�mero: ");
	int  num2 = entrada.nextInt();
	  System.out.println("Digite o 3� n�mero: ");
	int  num3 = entrada.nextInt();
	
	{
	if ((num1>num2 && num1>num3)&& (num2>num3)) {
		maior=(maior+num1);
		menor =(menor+num3);
	}
	else if  ((num1>num2 && num1>num3)&& (num3>num2)) {
		maior=(maior+num1);
		menor=(menor+num2);
	}
	else if ((num2>num1 && num2>num3)&& (num1>num3)){
		maior=(maior+num2);
		menor=(menor+num3);
	}
	else if ((num2>num1 && num2>num3)&& (num3>num1)) {
		maior=(maior+num2);
		menor=(menor+num1);
	}
	else if ((num3>num1 && num3>num2)&& (num1>num2)) {
		maior=(maior+num3);
		menor=(menor+num2);
	}
	else if ((num3>num1 && num3>num2)&& (num2>num1))
		maior=(maior+num3);
		menor=(menor+num1);
		System.out.println("O n�muero maior �: "+maior+ " e o n�mero menor �: "+menor+ ".");
	entrada.close();
	}
	}
}
