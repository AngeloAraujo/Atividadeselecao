import java.util.Scanner;
public class Exerc�cio9 {

	public static void main(String[] args) {

	Scanner entrada = new Scanner (System.in);
	
	Double pesoidealf = (0.0);
	String idealpeso;
	
	System.out.println("Digite o sexo do indiv�duo: ");
	String sexo = entrada.nextLine();
	System.out.println("Digite a altura do indiv�duo: ");
	float alturaF = entrada.nextFloat();
	System.out.println("Digite o peso do indiv�duo: ");
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
		idealpeso= (" voc� est� abaixo do peso recomendado");
	else if (pesoidealf == pesoF) 
		idealpeso=(" voce esta com o peso recomendado");
	else 
		idealpeso= (" voc� est� acima do peso recomendado");
	
	System.out.println("O indiv�duo do sexo "+sexo+ " peso: "+pesoF+" alturaF: "+alturaF+idealpeso+" para a sua altura." );
	
	entrada.close();
	}
	}


