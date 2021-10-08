import java.util.Scanner;
public class Exercício22 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro menor que 1000:");
		int num = entrada.nextInt();
		
		int unidade = num %10;
		int dezena = (((num-unidade)/10)%10);
		int centena = num / 100;		
		System.out.println(unidade + " unidade(s)");
		System.out.println(dezena + " dezena(s)");
		System.out.println(centena + " centena(s)");
		
		entrada.close();
	}

}
