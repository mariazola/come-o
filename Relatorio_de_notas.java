package exercicios;
import java.util.Scanner;
public class Relatorio_de_notas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		byte N, i; 
		System.out.println("Quantidade de alunos na turma");
		N = leia.nextByte();
		
		String[] nome = new String[N];
		String[] situacao = new String[N];
		float[] nota1 = new float[N];
		float[] nota2 = new float[N];
		float[] media = new float[N];
		
		for(i=0; i<N; i++) {
			
			System.out.print("Nome do aluno " + (i+1) + " : ");
			nome[i] = leia.next();
			
			System.out.print("Nota 1 : ");
			nota1[i] = leia.nextFloat();
			
			System.out.print("Nota 2 : ");
			nota2[i] = leia.nextFloat();
			
			media[i] = (nota1[i] + nota2[i])/2;
			
			if(media[i]>=6) {
				situacao[i] = "APROVADO";
			} else {
				situacao[i] = "REPROVADO";
			}
		}
		
		System.out.println("-----RELATÓRIO DA TURMA-----");
		
		for (i=0; i<N; i++) {
			System.out.println("Nome do aluno: " + nome[i] );
			System.out.println("Nota 1 do aluno: " + nota1[i] );
			System.out.println("Nota 2 do aluno: " + nota2[i] );
			System.out.println("Média do aluno: " + media[i] );
			System.out.println("Situação do aluno: " + situacao[i] );
			
		}
		
		
	
		leia.close();
	}

}
