import java.util.Scanner;

public class TesteDaForca {
    
    final static Scanner sc = new Scanner(System.in);

    public static void lerVetorInteiro(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
    }

    public static int obterSomaCincoMaioresPosicoes() {
        
    }

    public static void main(String[] args) {
        int quantInteiros;
        int k;
        
        while (sc.hasNext()) {
            quantInteiros = sc.nextInt();
            k = sc.nextInt();

            int[] pontuacoes = new int[quantInteiros];

            lerVetorInteiro(pontuacoes);
        }
    }
}
