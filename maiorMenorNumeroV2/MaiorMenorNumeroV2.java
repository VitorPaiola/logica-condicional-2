package maiorMenorNumeroV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Escreva um programa que solicite
 * ao usuário uma lista de números, até o
 * usuário digitar o número zero. e exiba o
 * maior e o menor numero da lista usando
 * Streams
*/

public class MaiorMenorNumeroV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Integer> numeros = calcularMaiorMenor(entrada);
        exibirMaiorMenorNumeros(numeros);

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

    public static void exibirMaiorMenorNumeros(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            System.out.println("Nenhum numero foi digitado.");
        } else {
            int maior = numeros.stream().max(Integer::compareTo).get();
            int menor = numeros.stream().min(Integer::compareTo).get();

            System.out.println("Maior numero: " + maior);
            System.out.println("Menor numero: " + menor);
        }
    }
}
