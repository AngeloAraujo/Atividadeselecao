import java.util.Scanner;
public class Ex33 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int pontuacao = 0;
		System.out.println("Informe os resultados assinalados pelo candidato:");
		String Gabarito1 = entrada.nextLine();
		String Gabarito2 = entrada.nextLine();
		String Gabarito3 = entrada.nextLine();
		String Gabarito4 = entrada.nextLine();
		String Gabarito5 = entrada.nextLine();
		String Gabarito6 = entrada.nextLine();
		String Gabarito7 = entrada.nextLine();
		String Gabarito8 = entrada.nextLine();
		String Gabarito9 = entrada.nextLine();
		String Gabarito10 = entrada.nextLine();
		
		if("a".equals(Gabarito1)) {
			System.out.println("Questão 1: " + Gabarito1 + " : Correto");
			pontuacao = pontuacao+1;
		}else {
			System.out.println("Questão 1: " + Gabarito1 + " : Errada, resposta correta(a)");
		}
		if("a".equals(Gabarito2)) {
			System.out.println("Questão 2: " + Gabarito2 + " : Correto");
			pontuacao = pontuacao+1;
		}else {
			System.out.println("Questão 2: " + Gabarito2 + " : Errada, resposta correta(a)");
		}
		if("b".equals(Gabarito3)) {
			System.out.println("Questão 3: " + Gabarito3 + " : Correto");
			pontuacao = pontuacao+1;
		}else {
			System.out.println("Questão 3: " + Gabarito3 + " : Errada, resposta correta(b)");
		}
		if("b".equals(Gabarito4)) {
			System.out.println("Questão 4: " + Gabarito4 + " : Correto");
			pontuacao = pontuacao+1;
		}else {
			System.out.println("Questão 4: " + Gabarito4 + " : Errada, resposta correta(b)");
		}
		if("c".equals(Gabarito5)) {
			System.out.println("Questão 5: " + Gabarito5 + " : Correto");
			pontuacao = pontuacao+1;
		}else {
			System.out.println("Questão 5: " + Gabarito5 + " : Errada, resposta correta(c)");
		}
		if("c".equals(Gabarito6)) {
			System.out.println("Questão 6: " + Gabarito6 + " : Correto");
			pontuacao = pontuacao+1;
		}else {
			System.out.println("Questão 6: " + Gabarito6 + " : Errada, resposta correta(c)");
		}
		if("d".equals(Gabarito7)) {
			System.out.println("Questão 7: " + Gabarito7 + " : Correto");
			pontuacao = pontuacao+1;
		}else {
			System.out.println("Questão 7: " + Gabarito7 + " : Errada, resposta correta(d)");
		}
		if("d".equals(Gabarito8)) {
			System.out.println("Questão 8: " + Gabarito8 + " : Correto");
			pontuacao = pontuacao+1;
		}else {
			System.out.println("Questão 8: " + Gabarito8 + " : Errada, resposta correta(d)");
		}
		if("e".equals(Gabarito9)) {
			System.out.println("Questão 9: " + Gabarito9 + " : Correto");
			pontuacao = pontuacao+1;
		}else {
			System.out.println("Questão 9: " + Gabarito9 + " : Errada, resposta correta(e)");
		}
		if("e".equals(Gabarito10)) {
			System.out.println("Questão 10: " + Gabarito10 + " : Correto");
			pontuacao = pontuacao+1;
		}else {
			System.out.println("Questão10: " + Gabarito10 + " : Errada, resposta correta(e)");
		}
		System.out.println("Pontuação final: " + pontuacao);
		
		entrada.close();
	}

}
