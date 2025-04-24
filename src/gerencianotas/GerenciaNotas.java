/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerencianotas;


/*
 * Projeto 2: Gerenciador de Notas de Alunos (Console)
 * Arquivo: GerenciadorNotas.java
 * Descrição: Lê as notas de N alunos, calcula média geral, encontra maior nota e 
lista alunos abaixo da média.
 */
import java.util.Scanner;

public class GerenciaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos? ");
        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nota do aluno %d: ", i + 1);
            notas[i] = sc.nextDouble();
        }

        double media = calculaMedia(notas);
        double maior = encontraMaior(notas);

        System.out.printf("\nM\u00e9dia geral: %.2f\n", media);
        System.out.printf("Maior nota: %.2f\n", maior);

        System.out.println("Alunos abaixo da m\u00e9dia:");
        for (int i = 0; i < n; i++) {
            if (notas[i] < media) {
                System.out.printf("- Aluno %d: %.2f\n", i + 1, notas[i]);
            }
        }
        sc.close();
    }

    static double calculaMedia(double[] v) {
        double soma = 0;
        for (double x : v) soma += x;
        return soma / v.length;
    }

    static double encontraMaior(double[] v) {
        double m = v[0];
        for (double x : v) if (x > m) m = x;
        return m;
    }
}
    


