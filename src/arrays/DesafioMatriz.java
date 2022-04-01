package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos ?");
        int qntAlunos = sc.nextInt();

        System.out.println("Quantas notas por aluno ?");
        int qntNotas = sc.nextInt();

        double[][] notasDaTurma = new double[qntAlunos][qntNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {

                System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
                notasDaTurma[i][j] = sc.nextDouble();
                total += notasDaTurma[i][j];
            }
        }
        double media = total / (qntAlunos * qntNotas);
        System.out.println("Media da turma sera " + media);

        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));

        }

        sc.close();
    }
}
