package mediaNumerosV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um programa que leia números do usuário até que
 * seja digitado zero, e exiba a média dos números digitados.
 * Usando IntStream.
*/

public class MediaNumerosV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double media = calcularMedia(entrada);
        exibirResultado(media);

        entrada.close();
    }

    public static double calcularMedia(Scanner entrada) {
        List<Integer> numeros = new ArrayList<>();

        while (true) {
            int numero = solicitarValor("Digite numeros (digite 0 para sair): ", entrada);

            if (numero == 0) {
                break;
            }
            numeros.add(numero);
        }

        // Convertemos List<Integer> para IntStream (int primitivo), average retorna um
        // OptionalDouble vazio, para evitar erros usamos o orElse(0);
        return numeros.isEmpty() ? 0 : numeros.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                int valor = Integer.parseInt(input);
                if (valor >= 0) {
                    return valor;
                } else {
                    System.out.println("Entrada invalida. Digite um numero valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void exibirResultado(double media) {
        if (media == 0) {
            System.out.println("Nenhum numero valido foi digitado.");
        } else {
            System.out.printf(Locale.US, "A media dos numeros digitados e: %.2f%n", media);
        }
    }
}
