import java.util.Scanner;
public class Ex25 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		
		int nota100,nota50, nota10, nota5, nota1;
		int valor100, valor50, valor10, valor5, valor1;
		
		System.out.println ("Digite o valor de saque: \nSaque permitido mínimo= 10  máximo = 600");
		int saque = entrada.nextInt();
		
		if((saque >= 10) && (saque <= 600)) {
			nota100 = saque/100;
			valor100 = saque % 100;
		
			nota50 = valor100/50;
			valor50 = valor100 % 50;
		
			nota10 = valor50/10;
			valor10 = valor50 % 10;
		
			nota5 = valor10 / 5;
			valor5 = valor10 % 5;
		
			nota1 = valor5 / 1;
			valor1 = valor5 % 1;
			
		
		System.out.println("Para sacar o programa fornece: ");
		System.out.println(nota100 + " nota(s) de 100");
		System.out.println(nota50 + " nota(s) de 50");
		System.out.println(nota10 + " nota(s) de 10");
		System.out.println(nota5 + " nota(s) de 5");
		System.out.println(nota1 + " nota(s) de 1");
		System.exit(valor1);
		} else {
			System.out.println("Valor de saque inválido:");
		}
		
		entrada.close();
	}


}
