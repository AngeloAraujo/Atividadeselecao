import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {

	Scanner entrada = new Scanner (System.in);

	System.out.print("Insira a primeira nota do aluno: ");
	Float nota1f= entrada.nextFloat();
	System.out.print("Insira a segunda nota do aluno");
	Float nota2f= entrada.nextFloat();
	Float mediaf= ((nota1f+nota2f)/2);
	
	if (mediaf >= 7.0) {
		System.out.println("Sua média é "+mediaf+" você está aprovado!");
	}else 
	System.out.println("Sua média é "+mediaf+" você está reprovado!");	
	
	entrada.close();
	}

}
