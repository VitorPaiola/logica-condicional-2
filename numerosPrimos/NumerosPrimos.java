package numerosPrimos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Crie um programa que exiba os primeiros N números primos,
 * onde N é informado pelo usuário, utilizando um laço de repetição.
*/

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroDesejado = solicitarValor("Digite a quantidade de numeros primos desejados: ", entrada);

        List<Integer> primos = obterNumerosPrimos(numeroDesejado);
        imprimirPrimos(primos);

        entrada.close();
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int numeroDesejado;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                numeroDesejado = Integer.parseInt(input);
                if (numeroDesejado > 0) {
                    return numeroDesejado;
                } else {
                    System.out.println("Entrada invalida. Digite um numero valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static List<Integer> obterNumerosPrimos(int quantidade) {
        List<Integer> primos = new ArrayList<>();
        int numero = 2;

        while (primos.size() < quantidade) {
            if (numeroPrimo(numero)) {
                primos.add(numero);
            }
            numero++;
        }

        return primos;
    }

    public static boolean numeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void imprimirPrimos(List<Integer> primos) {
        System.out.printf("Primeiros (%d) numeros primos: ", primos.size());
        System.out.print("[");
        for (int i = 0; i < primos.size(); i++) {
            System.out.print(primos.get(i));
            if (i < primos.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
