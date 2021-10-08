import java.util.Scanner;
public class Exercício28 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String numeroparimpar = null;
		String posneg = null,intdec;
		float resultadoF = 0;
		System.out.println("Digite o primeiro número:");
		float num1F = entrada.nextFloat();
		System.out.println("Digite o segundo número:");
		float num2F = entrada.nextFloat();
		System.out.println("Qual operação matemática que deseja realizar?");
		System.out.println("1- Adição; 2- Subtração; 3- Multiplicação; 4- Divisão.");
		int operação = entrada.nextInt();
		
		if(operação == 1)
			resultadoF = num1F+num2F;
		else if(operação == 2)
			resultadoF = num1F-num2F;
		else if(operação == 3)
			resultadoF = num1F*num2F;
		else if(operação == 4)
			resultadoF = num1F/num2F;
		
		
		
		if(resultadoF % 2 == 0) {
		numeroparimpar="par";
		}else if (resultadoF % 2 != 0 ){
		numeroparimpar="ímpar";}
		if(resultadoF > 0) {
		posneg="positivo";
		}else if (resultadoF < 0) {
		posneg="negativo";}
		
		if (resultadoF % 1 != 0) {
		intdec="decimal";}
		else {
		intdec = "inteiro";}
		
		System.out.println("O resultado da operação escolhida é " + resultadoF+" ele é "+ numeroparimpar+", "+posneg+" e "+intdec+".");
		entrada.close();
			
	}

}
