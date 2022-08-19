import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String impostorenda=(null);
		double descontoinss,descontofgts,descontosindicato,totaldescontos,salarioliquido;
		double descontoir=0;
		double salariototal;
		
		System.out.println("Digite quanto você ganha por hora? ");
		double valorhora = entrada.nextDouble();
		System.out.println("Digite quantas horas você trabalha por mês? ");
		double horastrabalhadas = entrada.nextDouble();
		salariototal=(valorhora * horastrabalhadas);
		
		
			
		if(salariototal <= 900) { 
		descontoir=(0);
		impostorenda= "0%";
		}else if ((salariototal > 900) && (salariototal <= 1500)) {   
		descontoir=((salariototal/100) * 5);
		impostorenda ="5%" ;
		}else if ((salariototal > 1500) && (salariototal <= 2500))  {
		impostorenda ="10%" ;
		descontoir= ((salariototal/100) * 10);
		}else if (salariototal > 2500){  
		impostorenda ="20%" ;
		descontoir= ((salariototal/100) * 20);
		}
		
		descontoinss = ((salariototal/100) * 10);
		descontofgts= ((salariototal/100) * 11);
		descontosindicato= ((salariototal/100) * 3);
		totaldescontos = (descontoir + descontoinss+descontosindicato);
		salarioliquido = (salariototal-totaldescontos);
		
		System.out.println("Salário bruto: ( "+valorhora+" * "+horastrabalhadas+" ): R$ "+(new DecimalFormat("#,##0.00").format(salariototal)+" reais."));
		System.out.println("Desconto Imposto de Renda (" +impostorenda+ ") : R$ " +(new DecimalFormat("#,##0.00").format (descontoir)+ " reais."));
		System.out.println("Desconto INSS (10%) : R$ " + (new DecimalFormat("#,##0.00").format(descontoinss)+ " reais."));
		System.out.println("Deconto FGTS (11%): R$ " + (new DecimalFormat("#,##0.00").format (descontofgts)+ " reais."));
		System.out.println("Deconto Sindicato (3%): R$ " + (new DecimalFormat("#,##0.00").format(descontosindicato)+ " reais."));
		System.out.println("Total de descontos: R$ " + (new DecimalFormat("#,##0.00").format (totaldescontos)+ " reais."));
		System.out.println("Salário líquido: R$ " + (new DecimalFormat("#,##0.00").format(salarioliquido)+" reais."));
		
		entrada.close();
		}	
	}

