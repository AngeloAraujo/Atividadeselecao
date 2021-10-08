import java.util.Scanner;
public class Exercício14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o dia da semana(1= Domingo, 7= Sábado) ");
		int dia = entrada.nextInt();		
		
		switch (dia) {
		case 1:
		System.out.println("Domingo");
		break;
		case 2: 
		System.out.println("Segunda");
		break;
		case 3: 
			System.out.println("Terça");
		break;
		case 4: 
			System.out.println("Quarta");
		break;
		case 5: 
			System.out.println("Quinta");
		break;	
		case 6: 
			System.out.println("Sexta");
		break;
		case 7: 
			System.out.println("Sábado");
			break;
		default:
	        System.out.println ("Este não é um dia válido");
	        entrada.close();
		}
		}
		}