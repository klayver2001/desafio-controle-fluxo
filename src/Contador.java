import java.util.Scanner;


/**
 * A classe Contador imprime uma sequência de números entre dois valores fornecidos.
 * O primeiro valor deve ser menor que o segundo valor.
 */
public class Contador {

    /**
     * Método principal responsável por receber os parâmetros do usuário e chamar o método contar.
     * 
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro : ");
            int inicio = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro : ");
            int fim = terminal.nextInt();

            try {
                // Chamando o método contendo a lógica de contagem
                contar(inicio, fim);
            } catch (ParametrosInvalidosException e) {
                // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(e.getMessage());
            }
        } // O Scanner será fechado automaticamente aqui
    }

    /**
     * Imprime uma sequência de números entre os valores de início e fim (excluindo os limites).
     * 
     * @param inicio O valor inicial da sequência.
     * @param fim O valor final da sequência.
     * @throws ParametrosInvalidosException Se o valor de início for maior ou igual ao valor de fim.
     */
    static void contar(int inicio, int fim) throws ParametrosInvalidosException {
        // Validar se inicio é MAIOR ou IGUAL a fim e lançar a exceção
        if (inicio >= fim) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Realizar o for para imprimir os números entre inicio e fim
        for (int i = inicio + 1; i < fim; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}