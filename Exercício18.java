import java.util.Scanner;
public class Exerc�cio18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a medida do lado A do tri�ngulo: "); 
		float ladoAf = entrada.nextFloat();
		System.out.println("Digite a medida do lado B do tri�ngulo: ");
		float ladoBf = entrada.nextFloat();
		System.out.println("Digite a medida da base do tri�ngulo: "); 
		float basef = entrada.nextFloat();
		String triangulo= entrada.nextLine();
		String lado=entrada.nextLine();
		
		if ((ladoAf + ladoBf)  > basef || (ladoAf + basef)  > ladoBf || (ladoBf + basef ) > ladoAf) {
		triangulo=" triangulo";
		}
		else {
		triangulo="n�o pode ser um tri�ngulo";
		}		
		if (ladoAf == ladoBf && ladoBf == basef) {
		lado= ("equil�tero");
		System.out.println("A soma dos lado deste"+triangulo+ " � um "+lado+".");
		}else  if (ladoAf == ladoBf || ladoAf == basef || basef == ladoBf) {
		lado=("is�celes");
		System.out.println("A soma dos lado deste"+triangulo+ " � um "+lado+".");
		}else if (ladoAf != ladoBf || ladoBf!=basef|| ladoAf!=basef) {
		lado=("escaleno");
		System.out.println("A soma dos lado deste"+triangulo+ " � um "+lado+".");
		}
		else {
			System.out.println("devido as medidas da soma de dois lados serem menor que o terceiro lado, este ");
		}
		entrada.close();
	}
	}


	