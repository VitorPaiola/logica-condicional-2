package mediaNumeros;

import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um programa que leia números do usuário até que
 * seja digitado zero, e exiba a média dos números digitados.
*/

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double media = calcularMedia(entrada);
        exibirResultado(media);

        entrada.close();
    }

    public static double calcularMedia(Scanner entrada) {
        int soma = 0;
        int qtdNumeros = 0;

        while (true) {
            int numero = solicitarValor("Digite numeros (digite 0 para sair): ", entrada);

            if (numero == 0) {
                break;
            }

            soma += numero;
            qtdNumeros++;
        }

        return (qtdNumeros > 0) ? (double) soma / qtdNumeros : 0;
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                valor = Integer.parseInt(input);
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
