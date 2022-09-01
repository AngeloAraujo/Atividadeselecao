import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a medida do lado A do triângulo: "); 
		float ladoAf = entrada.nextFloat();
		System.out.println("Digite a medida do lado B do triângulo: ");
		float ladoBf = entrada.nextFloat();
		System.out.println("Digite a medida da base do triângulo: "); 
		float basef = entrada.nextFloat();
		String lado=null;
		
			
		if (ladoAf == ladoBf && ladoBf == basef) {
		lado= ("Equilátero");
		System.out.println("A soma dos lado formam um triângulo "+lado+".");
		}else  if (ladoAf == ladoBf || ladoAf == basef || basef == ladoBf) {
		lado=("Isóceles");
		System.out.println("A soma dos lado formam um triângulo "+lado+".");
		}else if (ladoAf != ladoBf || ladoBf!=basef|| ladoAf!=basef) {
		lado=("escaleno");
		System.out.println("A soma dos lado formam um triângulo "+lado+".");
		}
		entrada.close();
	}
	}


	