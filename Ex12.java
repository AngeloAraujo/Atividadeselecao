import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String reajuste;
		double ajuste,salarioatualizado;
				
		System.out.print("Informe o salário do colaborador:");
		double salario = entrada.nextDouble();
				
		
		if(salario <= 280) { 
		ajuste = ((salario/100) * 20);
		reajuste = "20%";
		salarioatualizado = salario + ajuste;
		}else if ((salario > 280) && (salario < 700)){
		ajuste = ((salario/100) * 15);
		reajuste = "15%";
		salarioatualizado= (salario + ajuste);
		}else if ((salario >= 700) && (salario < 1500)){ 
		ajuste =  ((salario/100) * 10);
		reajuste = "10%";
		salarioatualizado = salario + ajuste;
		}else { 
		ajuste = ((salario/100) * 5);
		reajuste= "5%";
		salarioatualizado= salario + ajuste;
		}
		System.out.println("Salário anterior: R$ = " +(new DecimalFormat("#,##0.00").format(salario)+" reais."));
		System.out.println("Reajuste salarial: " + reajuste);
		System.out.println("Valor do reajuste= " +(new DecimalFormat("#,##0.00").format(ajuste)+" reais."));
		System.out.println("Salário atualizado = " +(new DecimalFormat("#,##0.00").format(salarioatualizado)+ " reais."));
		
		entrada.close();}
	}



