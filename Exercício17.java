import java.util.Scanner;
public class Exercício17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		String resultado = null;
		System.out.println("Digite a primeira nota do semestre: ");  
		float nota1f = entrada.nextFloat(); 
		System.out.println("Digite a segunda nota do semestre: ");
		float nota2f = entrada.nextFloat();
		
		float mediaf = ((nota1f + nota2f) / 2);
		String conceito= entrada.nextLine();
		
		if((mediaf >= 9) && (mediaf <= 10)) {
		conceito = "A";
		resultado = "APROVADO";
		}else if((mediaf >= 7.5) && (mediaf < 9)) {
		conceito = "B";
		resultado = "APROVADO";
		}else if((mediaf >= 6) && (mediaf < 7.5)) {
		conceito = "C";
		resultado = "APROVADO";
		}else if((mediaf >= 4) && (mediaf < 6)) {
		conceito = "D";
		resultado= "REPROVADO";
		}else if((mediaf >= 0) && (mediaf < 4)) {
		conceito = "E";
		resultado= "REPROVADO";
		}
		
		System.out.println("Notas: " + nota1f + " e " + nota2f);
		System.out.println("Média: " + mediaf); 
		System.out.println("Conceito: "+conceito);
		System.out.println(resultado); 
		
		entrada.close();
	}

}
