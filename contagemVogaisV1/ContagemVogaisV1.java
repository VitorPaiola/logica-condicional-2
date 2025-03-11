package contagemVogaisV1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Escreva um programa que solicite ao usuário
 * frases e exiba a quantidade de vogais na frase.
 * No seguinte formato String[].
*/

public class ContagemVogaisV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidade = lerInteiroPositivo(entrada);

        String[] frases = new String[quantidade];

        for (int i = 0; i < frases.length; i++) {
            frases[i] = solicitarValor("Digite a " + (i + 1) + " frase: ", entrada);
        }

        contarVogais(frases);

        entrada.close();
    }

    public static int lerInteiroPositivo(Scanner entrada) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Quantas frases voce deseja inserir? ");
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

    public static String solicitarValor(String mensagem, Scanner entrada) {
        String palavra;
        while (true) {
            System.out.print(mensagem);
            palavra = entrada.nextLine().trim();

            if (palavra.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite uma frase valida");
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

    public static void contarVogais(String[] frases) {
        for (String frase : frases) {
            int qtdVogais = quantidadeVogais(frase);
            imprimirResultados(frase, qtdVogais);
        }
    }

    public static int quantidadeVogais(String frase) {
        int contarVogais = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contarVogais++;
            }
        }
        return contarVogais;
    }

    public static void imprimirResultados(String palavra, int qtdVogais) {
        System.out.println("Frase: " + palavra + " | Quantidade de vogais: " + qtdVogais);
    }
}
