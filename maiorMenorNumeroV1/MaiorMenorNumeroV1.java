package maiorMenorNumeroV1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Escreva um programa que solicite
 * ao usuário uma lista de números, até o
 * usuário digitar o número zero. e exiba o
 * maior e o menor numero da lista usando
 * if-else e for e comparações (> e <).
*/

public class MaiorMenorNumeroV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Integer> numeros = calcularMaiorMenor(entrada);

        exibirMaiorMenorNumero(numeros);

        entrada.close();
    }

    public static List<Integer> calcularMaiorMenor(Scanner entrada) {
        List<Integer> numeros = new ArrayList<>();

        while (true) {
            int numero = solicitarValor("Digite um numero (digite 0 para sair): ", entrada);
            if (numero == 0) {
                break;
            }
            numeros.add(numero);
        }
        return numeros;
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
                if (numero >= 0) {
                    return numero;
                } else {
                    System.out.println("Entrada invalida. Digite um numero valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void exibirMaiorMenorNumero(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            System.out.println("Nenhum numero foi digitado.");
        } else {
            int maior = numeros.get(0);
            int menor = numeros.get(0);

            for (int numero : numeros) {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }

            System.out.println("Maior numero: " + maior);
            System.out.println("Menor numero: " + menor);
        }
    }
}
