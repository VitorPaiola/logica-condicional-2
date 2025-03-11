package quadradosPerfeitos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Crie um programa que exiba os primeiros N
 * primeiros quadrados perfeitos, onde N é informado
 * pelo usuário, utilizando um laço de repetição.
*/

public class QuadradosPerfeitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidade = solicitarValor("Digite a quantidade de quadrados perfeitos desejados: ", entrada);

        List<Integer> quadradoPerfeito = obterQuadradoPerfeito(quantidade);
        imprimirQuadradoPerfeitoV1(quadradoPerfeito);

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

    public static List<Integer> obterQuadradoPerfeito(int quantidade) {
        List<Integer> quadradoPerfeito = new ArrayList<>();

        int numero = 1;
        int contador = 0;

        while (contador < quantidade) {
            if (verificarQuadradoPerfeito(numero)) {
                quadradoPerfeito.add(numero);
                contador++;
            }
            numero++;
        }

        return quadradoPerfeito;
    }

    public static boolean verificarQuadradoPerfeito(int numero) {
        int raiz = (int) Math.sqrt(numero);
        return Math.pow(raiz, 2) == numero;
    }

    public static void imprimirQuadradoPerfeitoV1(List<Integer> quadradoPerfeito) {
        System.out.printf("Os primeiros %d quadrados perfeitos sao: ", quadradoPerfeito.size());
        System.out.print("[");
        for (int i = 0; i < quadradoPerfeito.size(); i++) {
            System.out.print(quadradoPerfeito.get(i));
            if (i < quadradoPerfeito.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void imprimirQuadradoPerfeitoV2(List<Integer> quadradoPerfeito) {
        System.out.printf("Os primeiros %d quadrados perfeitos sao: ", quadradoPerfeito.size());
        System.out.print(quadradoPerfeito);
    }
}
