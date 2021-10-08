import java.util.Scanner;
public class Exercício3 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	
	System.out.print("Insira F- para sexo Feminino e M- para sexo masculino: ");
	String sexo = entrada.nextLine();
		
	
	if (sexo.equals("f") || sexo.equals("F")) 
		sexo = ("Sexo = Feminino");
    else if (sexo.equals("m") || sexo.equals("M")) 
    	sexo = ("Sexo = Masculino");
	
	System.out.println(sexo);
   
	entrada.close();

	}

}
