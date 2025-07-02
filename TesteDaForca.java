import java.util.Scanner;

public class TesteDaForca {
    
    final static Scanner sc = new Scanner(System.in);

    public static void lerVetorInteiro(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
    }

    public static void insertionSort(int[] vetor) {
        int aux;
        for (int i = 1; i < vetor.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (vetor[j] > vetor[j - 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                } else {
                    break;
                }
            }
        }
    }

    public static int obterSomaMaioresPosicoes(int k, int[] pontuacoes) {
        int soma = 0;

        insertionSort(pontuacoes);

        for (int i = 0; i < k; i++) {
            if (i == pontuacoes.length) {
                break;
            }
            soma += pontuacoes[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        int quantInteiros;
        int k;
        
        while (sc.hasNext()) {
            quantInteiros = sc.nextInt();
            k = sc.nextInt();

            int[] pontuacoes = new int[quantInteiros];

            lerVetorInteiro(pontuacoes);

            System.out.println(obterSomaMaioresPosicoes(k, pontuacoes));
        }
    }
}
