package mediaExemploFuncionamento;

import java.util.Arrays;
import java.util.List;

public class MediaExemploFuncionamento {
    public static void main(String[] args) {
        primeiroExemplo();

        segundoExemplo();
    }

    // ? List.of -> Não permite (adicionar, remover, modificar elementos e null)
    // ! Use List.of() se quiser uma lista totalmente imutável e não precisar de null.
    public static void primeiroExemplo() {
        List<Integer> numeros = List.of(10, 20, 30);

        double media = numeros.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Media: " + media);
    }

    // ? Arrays.asList -> Permite null e modificar elementos existentes (mas não pode adicionar/remover)
    // ! Use Arrays.asList() se precisar modificar os elementos, mas não o tamanho.
    public static void segundoExemplo() {
        List<Integer> numeros = Arrays.asList(10, 20, 30);

        double media = numeros.isEmpty() ? 0 : numeros.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Media: " + media);
    }
}
