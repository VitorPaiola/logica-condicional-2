package fraseReversaV3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Escreva um programa que solicite ao usuário
 * frases e exiba a frase de trás para frente.
 * Usando Map.
*/

public class FraseReversaV3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtdFrases = lerInteiroPositivo(entrada);

        Map<Integer, String> frases = new HashMap<>();

        processarFrases(qtdFrases, entrada, frases);

        imprimirResultados(frases);

        entrada.close();
    }

    public static int lerInteiroPositivo(Scanner entrada) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Quantas frases voce deseja inserir? ");
            String linha = entrada.nextLine().trim();

            if (linha.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero maior que zero.");
                continue;
            }

            try {
                numero = Integer.parseInt(linha);
                if (numero > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Entrada invalida. Digite um numero maior que zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
        return numero;
    }

    public static void processarFrases(int qtdFrases, Scanner entrada, Map<Integer, String> frases) {
        for (int i = 0; i < qtdFrases; i++) {
            String frase = solicitarValor("Digite a" + (i + 1) + " frase: ", entrada);
            frases.put(i, frase);
        }
    }

    public static void imprimirResultados(Map<Integer, String> frases) {
        System.out.println("\n=== RESULTADOS ===");
        for (Map.Entry<Integer, String> entry : frases.entrySet()) {
            int numeroFrase = entry.getKey();
            String frase = entry.getValue();
            String fraseReversa = new StringBuilder(frase).reverse().toString();
            System.out.println("Frase " + numeroFrase + " de tras para frente: \"" + fraseReversa + "\"");
        }
    }

    public static String solicitarValor(String mensagem, Scanner entrada) {
        String palavra;
        while (true) {
            System.out.print(mensagem);
            palavra = entrada.nextLine().trim();

            if (palavra.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite uma frase valida.");
            } else if (validarEntrada(palavra)) {
                return palavra;
            } else {
                System.out.println("Entrada invalida. Digite apenas letras, sem numeros ou caracteres especiais.");
            }
        }
    }

    public static boolean validarEntrada(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                return false;
            }
        }
        return true;
    }
}
