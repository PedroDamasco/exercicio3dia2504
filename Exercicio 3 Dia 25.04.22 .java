package Lista2;

import java.util.Scanner;

public class Exercicio3dia2504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner basico de input de dados
		Scanner sc=new Scanner(System.in);
		
		// Dados a serem adquiridos
		int psic,leg,dire;
		
		// interação basica com uruario informando o objetivo
		System.out.println("Ola, para entrega da sua carta de habilitacao sera necessario 3 perguntas");
		
		// fazendo primeira pergunta utilizando numero um para resposta afirmativa
			System.out.println("Primeira pergunta: Voce foi aprovado no teste psicotecnico ? Caso positivo digite -> 1 <-");
		psic = sc.nextInt(); // <- adquirindo e armazenando dados.
		
		// fazendo segunda pergunta utilizando mesmo mecanismo de 1 para positivo
			System.out.println("Aprovado na prova de legislacao? Caso positivo digite -> 1 <-");
		leg = sc.nextInt(); // <- adquirindo e armazendando dados da segunda pergunta
		
		// fazendo a ultima pergunta para avaliacao do usuario
			System.out.println("Aprovado na prova de direção? Caso positivo digite -> 1 <-");
		dire = sc.nextInt();// <- novo e ultimo dado imputado pelo cliente  
		
		// como utilizei o numero 1 para respostas positivas caso o usuario tenha colocado 1 em todas as perguntas ira receber a habilitacao
		if (psic == 1 && leg == 1 && dire == 1)
			System.out.println("Parabens, voce ja pode coletar sua carteira de motorista.");
			else // caso negativo recebera que infelizmente tera que refazer os testes e nao recebera a habilitacao
				System.out.println("infelizmente você terá que refazer seus testes.");
	}

}
