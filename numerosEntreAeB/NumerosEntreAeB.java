package numerosEntreAeB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Escreva um programa que solicite ao usuário dois
 * números A e B e exiba todos os números entre A e B.
*/

public class NumerosEntreAeB {
    private static final int TAM_LISTA = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[TAM_LISTA];

        String[] variaveis = { "A", "B" };

        for (int i = 0; i < TAM_LISTA; i++) {
            numeros[i] = solicitarValor("Digite o valor de " + variaveis[i] + ": ", entrada);
        }

        List<Integer> intervalo = obterIntervalo(numeros[0], numeros[1]);
        imprimirIntervaloV3(intervalo);

        entrada.close();
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
                if (numero > 0) {
                    return numero;
                } else {
                    System.out.println("Entrada invalida. Digite um numero valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static List<Integer> obterIntervalo(int A, int B) {
        List<Integer> intervalo = new ArrayList<>();

        // Garantir que A seja sempre menor que B
        int start = Math.min(A, B) + 1; // Iniciar no próximo número após A
        int end = Math.max(A, B); // O limite é B

        for (int i = start; i < end; i++) {
            intervalo.add(i);
        }

        return intervalo;
    }

    public static void imprimirIntervaloV1(List<Integer> intervalo) {
        System.out.print("Os numeros entre A e B sao: ");
        System.out.println(intervalo);
    }

    public static void imprimirIntervaloV2(List<Integer> intervalo) {
        System.out.print("Os numeros entre A e B sao: ");
        System.out.print("[");
        for (int i = 0; i < intervalo.size(); i++) {
            System.out.print(intervalo.get(i));
            if (i < intervalo.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void imprimirIntervaloV3(List<Integer> intervalo) {
        System.out.print("Os numeros entre A e B sao: ");
        for (int i = 0; i < intervalo.size(); i++) {
            System.out.print(intervalo.get(i));
            if (i < intervalo.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
