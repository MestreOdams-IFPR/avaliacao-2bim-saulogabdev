import java.util.Scanner;

public class FraseCompleta {
    
    final static Scanner sc = new Scanner(System.in);

    public static int[] preencherVetorFrequencia(String frase) {
        char[] vetFrase = frase.toCharArray();
        int[] vetorFrequencia = new int[26];
        for (int i = 0; i < vetFrase.length; i++) {
            if (Character.isLetter(vetFrase[i])) {
                vetorFrequencia[(int)vetFrase[i] - 97]++;
            } 
        }
        return vetorFrequencia;
    }

    public static String verificarTipoFrase(String frase) {
        int contador = 0;
        int[] vetorFrequencia = preencherVetorFrequencia(frase);
        for (int i = 0; i < vetorFrequencia.length; i++) {
            if (vetorFrequencia[i] != 0) {
                contador++;
            }
        }

        if (contador == 26) {
            return "frase completa";
        } else if (contador >= 13) {
            return "frase quase completa";
        } else {
            return "frase mal elaborada";
        }
    }

    public static void main(String[] args) {
        int cont = 0;
        String frase;
        int quantFrases = sc.nextInt();
        
        while (cont < quantFrases) {
            frase = sc.next().toLowerCase();
            System.out.println(verificarTipoFrase(frase));
            cont++;
        }
    }
}
