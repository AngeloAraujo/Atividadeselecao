import java.util.Scanner;
public class Exerc�cio13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String impostorenda=(null);
		double descontoinss,descontofgts,descontosindicato,totaldescontos,salarioliquido;
		double descontoir=0;
		double salariototal;
		
		System.out.println("Digite quanto voc� ganha por hora? ");
		double valorhora = entrada.nextDouble();
		System.out.println("Digite quantas horas voc� trabalha por m�s? ");
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
		
		System.out.println("Sal�rio bruto: ( "+valorhora+" * "+horastrabalhadas+" ): R$ "+salariototal);
		System.out.println("Desconto Imposto de Renda (" +impostorenda+ ") : R$ " + descontoir);
		System.out.println("Desconto INSS (10%) : R$ " + descontoinss);
		System.out.println("Deconto FGTS (11%): R$ " +descontofgts);
		System.out.println("Deconto Sindicato (3%): R$ " +descontosindicato);
		System.out.println("Total de descontos: R$ " + totaldescontos);
		System.out.println("Sal�rio l�quido: R$ " + salarioliquido);
		
		entrada.close();
		}	
	}

