import java.util.Scanner;
public class Exercício9 {

	public static void main(String[] args) {

	Scanner entrada = new Scanner (System.in);
	
	Double pesoidealf = (0.0);
	String idealpeso;
	
	System.out.println("Digite o sexo do indivíduo: ");
	String sexo = entrada.nextLine();
	System.out.println("Digite a altura do indivíduo: ");
	float alturaF = entrada.nextFloat();
	System.out.println("Digite o peso do indivíduo: ");
	double pesoF = entrada.nextFloat();
	
	
	if (sexo.equals("f") || sexo.equals("F")) {
	pesoidealf= ((62.1*alturaF)-44.7);
	sexo= ("feminino");
	}
	else if (sexo.equals("m") || sexo.equals("M")){  
	pesoidealf= ((72.7*alturaF)-58);
	sexo= ("masculino");
	}
	if (pesoidealf>pesoF) 
		idealpeso= (" você está abaixo do peso recomendado");
	else if (pesoidealf == pesoF) 
		idealpeso=(" voce esta com o peso recomendado");
	else 
		idealpeso= (" você está acima do peso recomendado");
	
	System.out.println("O indivíduo do sexo "+sexo+ " peso: "+pesoF+" alturaF: "+alturaF+idealpeso+" para a sua altura." );
	
	entrada.close();
	}
	}


