import java.util.Scanner;
public class Exerc�cio28 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String numeroparimpar = null;
		String posneg = null,intdec;
		float resultadoF = 0;
		System.out.println("Digite o primeiro n�mero:");
		float num1F = entrada.nextFloat();
		System.out.println("Digite o segundo n�mero:");
		float num2F = entrada.nextFloat();
		System.out.println("Qual opera��o matem�tica que deseja realizar?");
		System.out.println("1- Adi��o; 2- Subtra��o; 3- Multiplica��o; 4- Divis�o.");
		int opera��o = entrada.nextInt();
		
		if(opera��o == 1)
			resultadoF = num1F+num2F;
		else if(opera��o == 2)
			resultadoF = num1F-num2F;
		else if(opera��o == 3)
			resultadoF = num1F*num2F;
		else if(opera��o == 4)
			resultadoF = num1F/num2F;
		
		
		
		if(resultadoF % 2 == 0) {
		numeroparimpar="par";
		}else if (resultadoF % 2 != 0 ){
		numeroparimpar="�mpar";}
		if(resultadoF > 0) {
		posneg="positivo";
		}else if (resultadoF < 0) {
		posneg="negativo";}
		
		if (resultadoF % 1 != 0) {
		intdec="decimal";}
		else {
		intdec = "inteiro";}
		
		System.out.println("O resultado da opera��o escolhida � " + resultadoF+" ele � "+ numeroparimpar+", "+posneg+" e "+intdec+".");
		entrada.close();
			
	}

}
