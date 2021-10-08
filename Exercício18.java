import java.util.Scanner;
public class Exercício18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a medida do lado A do triângulo: "); 
		float ladoAf = entrada.nextFloat();
		System.out.println("Digite a medida do lado B do triângulo: ");
		float ladoBf = entrada.nextFloat();
		System.out.println("Digite a medida da base do triângulo: "); 
		float basef = entrada.nextFloat();
		String triangulo= entrada.nextLine();
		String lado=entrada.nextLine();
		
		if ((ladoAf + ladoBf)  > basef || (ladoAf + basef)  > ladoBf || (ladoBf + basef ) > ladoAf) {
		triangulo=" triangulo";
		}
		else {
		triangulo="não pode ser um triângulo";
		}		
		if (ladoAf == ladoBf && ladoBf == basef) {
		lado= ("equilátero");
		System.out.println("A soma dos lado deste"+triangulo+ " é um "+lado+".");
		}else  if (ladoAf == ladoBf || ladoAf == basef || basef == ladoBf) {
		lado=("isóceles");
		System.out.println("A soma dos lado deste"+triangulo+ " é um "+lado+".");
		}else if (ladoAf != ladoBf || ladoBf!=basef|| ladoAf!=basef) {
		lado=("escaleno");
		System.out.println("A soma dos lado deste"+triangulo+ " é um "+lado+".");
		}
		else {
			System.out.println("devido as medidas da soma de dois lados serem menor que o terceiro lado, este ");
		}
		entrada.close();
	}
	}


	