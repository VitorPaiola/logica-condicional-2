package contagemVogaisV2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
 * Escreva um programa que solicite ao usuário
 * frases e exiba a quantidade de vogais na frase.
 * Usando lista.
*/

public class ContagemVogaisV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeFrases = letInteiroPositivo(entrada);

        List<String> frases = new ArrayList<>();
        List<Integer> qtdVogais = new ArrayList<>();

        processarFrases(quantidadeFrases, entrada, frases, qtdVogais);

        imprimirResultados(frases, qtdVogais);

        entrada.close();
    }

    public static int letInteiroPositivo(Scanner entrada) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Quantas frases vode deseja inserir? ");
                numero = entrada.nextInt();
                entrada.nextLine(); // Consome o newline deixado pelo nextInt()

                if (numero > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Entrada invalida. Digite um numero maior que zero.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
                entrada.nextLine();
            }
        }
        return numero;
    }

    public static void processarFrases(int quantidadeFrases, Scanner entrada, List<String> frases, List<Integer> quantidadeVogais) {
        for (int i = 0; i < quantidadeFrases; i++) {
            String frase = solicitarValor("Digite a " + (i + 1) + " frase: ", entrada);
            int qtdVogais = contarVogais(frase);
            frases.add(frase);
            quantidadeVogais.add(qtdVogais);
        }
    }

    public static void imprimirResultados(List<String> frases, List<Integer> quantidadeVogais) {
        System.out.println("\n=== RESULTADOS ===");
        for (int i = 0; i < quantidadeVogais.size(); i++) {
            System.out.println("Frase " + (i + 1) + ": \"" + frases.get(i) + "\" | Quantidade de vogais: " + quantidadeVogais.get(i));
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

    public static int contarVogais(String frase) {
        int contarVogais = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contarVogais++;
            }
        }
        return contarVogais;
    }
}
