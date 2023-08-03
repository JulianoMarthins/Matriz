package entities;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos? ");
		int quantAlunos = sc.nextInt();

		System.out.println("Quantas notas por aluno? ");
		int quantNotas = sc.nextInt();

		double[][] notasTurma = new double[quantAlunos][quantNotas];

		double notaTotal = 0.0;
		for (int a = 0; a < notasTurma.length; a++) {
			for (int n = 0; n < notasTurma[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notasTurma[a][n] = sc.nextDouble();
				notaTotal += notasTurma[a][n];
			}
		}

		double media = notaTotal / (quantAlunos * quantNotas);
		System.out.printf("\nMédia da turma: %.2f" , media);
		System.out.println();
		
		for(double[] notasAluno: notasTurma) {
			System.out.println(Arrays.toString(notasAluno));

		}
		

		sc.close();
	}

}
