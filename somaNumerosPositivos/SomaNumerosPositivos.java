package somaNumerosPositivos;

import java.util.Scanner;

/*
 * Escreva um programa que leia números do
 * usuário até que seja digitado um número negativo,
 * e exiba a soma dos números positivos.
*/

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = calcularValoresPositivos(entrada);
        exibirResultado(soma);

        entrada.close();
    }

    public static int calcularValoresPositivos(Scanner entrada) {
        int soma = 0;

        while (true) {
            int numero = solicitarValor("Digite um numero (negativo para sair): ", entrada);

            if (numero < 0) {
                break;
            }

            soma = somarValoresPositivos(soma, numero);
        }

        return soma;
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int numero;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                numero = Integer.parseInt(input);
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static int somarValoresPositivos(int soma, int numero) {
        if (numero >= 0) {
            soma += numero;
        }
        return soma;
    }

    public static void exibirResultado(int soma) {
        System.out.println("A soma entre os numeros positivos e: " + soma);
    }
}
