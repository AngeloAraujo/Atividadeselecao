import java.util.Scanner;
public class Exerc�cio20 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
      
     System.out.println("Digite o ano: ");
     int ano = entrada.nextInt();
        
	if(ano % 400 == 0)
		System.out.println("Este ano "+ano + " � bissexto.");
	else if((ano % 4 == 0) && (ano % 100 != 0))
		System.out.println("Este ano " +ano + " � bissexto.");
	else
	    System.out.println("Este ano "+ano + " n�o � bissexto");
	entrada.close();
	    
	    }

	}

