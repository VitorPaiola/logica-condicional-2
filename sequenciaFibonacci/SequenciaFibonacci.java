package sequenciaFibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Faça um programa que solicite ao usuário um
 * número e exiba a sequência de Fibonacci até o número
 * informado utilizando um laço de repetição.
*/

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidade = solicitarValor("Digite um numero: ", entrada);

        List<Integer> numerosFibonacci = obterSequenciaFibonacci(quantidade);
        imprimirSequenciaFibonacci(numerosFibonacci, quantidade);

        entrada.close();
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int quantidade;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                quantidade = Integer.parseInt(input);
                if (quantidade > 0) {
                    return quantidade;
                } else {
                    System.out.println("Entrada invalida. Digite um numero valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static List<Integer> obterSequenciaFibonacci(int quantidade) {
        List<Integer> sequenciaFibonacci = new ArrayList<>();

        int primeiroTermo = 0;
        int segundoTermo = 1;

        sequenciaFibonacci.add(primeiroTermo);
        sequenciaFibonacci.add(segundoTermo);

        while (true) {
            int proximoTermo = primeiroTermo + segundoTermo;

            if (proximoTermo > quantidade) {
                break;
            }

            sequenciaFibonacci.add(proximoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        return sequenciaFibonacci;
    }

    public static void imprimirSequenciaFibonacci(List<Integer> numeros, int quantidade) {
        System.out.printf("Sequencia de Fibonacci ate %d: ", quantidade);
        System.out.print("[");

        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
