import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a medida do lado A do tri�ngulo: "); 
		float ladoAf = entrada.nextFloat();
		System.out.println("Digite a medida do lado B do tri�ngulo: ");
		float ladoBf = entrada.nextFloat();
		System.out.println("Digite a medida da base do tri�ngulo: "); 
		float basef = entrada.nextFloat();
		String lado=null;
		
			
		if (ladoAf == ladoBf && ladoBf == basef) {
		lado= ("Equil�tero");
		System.out.println("A soma dos lado formam um tri�ngulo "+lado+".");
		}else  if (ladoAf == ladoBf || ladoAf == basef || basef == ladoBf) {
		lado=("Is�celes");
		System.out.println("A soma dos lado formam um tri�ngulo "+lado+".");
		}else if (ladoAf != ladoBf || ladoBf!=basef|| ladoAf!=basef) {
		lado=("escaleno");
		System.out.println("A soma dos lado formam um tri�ngulo "+lado+".");
		}
		entrada.close();
	}
	}


	