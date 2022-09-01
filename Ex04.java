import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
      
     System.out.println("Digite um ano para saber se ele é bissexto: ");
     int ano = entrada.nextInt();
        
	if(ano % 400 == 0)
		System.out.println(ano + " é bissexto.");
	else if((ano % 4 == 0) && (ano % 100 != 0))
		System.out.println(ano + " é bissexto.");
	else
	    System.out.println(ano + " não é bissexto");
	entrada.close();
	    
	    }

	}

