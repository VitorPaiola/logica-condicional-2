package contagemVogaisV3;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Escreva um programa que solicite ao usuário
 * frases e exiba a quantidade de vogais na frase.
 * Usando Map.
*/

public class ContagemVogaisV3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeFrases = lerInteiroPositivo(entrada);

        // LinkedHashMap: Mantém a ordem de inserção | HashMap: Não mantém a ordem de inserção
        Map<String, Integer> frases = new LinkedHashMap<>();

        processarFrases(quantidadeFrases, entrada, frases);

        imprimirResultados(frases);

        entrada.close();
    }

    public static int lerInteiroPositivo(Scanner entrada) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Quantas frases voce deseja inserir? ");
                numero = entrada.nextInt();
                entrada.nextLine();

                if (numero > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Entrada invalida. Digite um numero maior que zero");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
                entrada.nextLine();
            }
        }
        return numero;
    }

    public static void processarFrases(int quantidadeFrases, Scanner entrada, Map<String, Integer> frases) {
        for (int i = 0; i < quantidadeFrases; i++) {
            String frase = solicitarValor("Digite a " + (i + 1) + " frase: ", entrada);
            frases.put(frase, contarVogais(frase));
        }
    }

    public static void imprimirResultados(Map<String, Integer> frases) {
        System.out.println("\n=== RESULTADOS ===");
        int i = 1;
        for (Map.Entry<String, Integer> entry : frases.entrySet()) {
            System.out.println("Frase " + i + ": \"" + entry.getKey() + "\" | Quantidade de vogais: " + entry.getValue());
            i++;
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
