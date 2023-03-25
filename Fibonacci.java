import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Danilo
 */

public class Fibonacci {

    public static void main(String[] args) {
        // Solicita que o usuário informe um número
        Scanner mykb = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = mykb.nextInt();
        mykb.close();
        
        // Calcula a sequência de Fibonacci até o número informado
        ArrayList<Integer> fibSeq = new ArrayList<Integer>();
        int n = 0;
        while (fibonacci(n) <= num) {
            fibSeq.add(fibonacci(n));
            n++;
        }
        
        // Imprime a sequência de Fibonacci
        System.out.println("A sequência de Fibonacci até o número informado é: " + fibSeq);
        
        // Verifica se o número informado pertence à sequência de Fibonacci
        if (pertenceFibonacci(num)) {
            System.out.println("O número informado pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número informado não pertence à sequência de Fibonacci.");
        }
    }
        // Método para calcular o n-ésimo número da sequência de Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean pertenceFibonacci(int num) {
        int n = 0;
        while (fibonacci(n) <= num) {
            if (fibonacci(n) == num) {
                return true;
            }
            n++;
        }
        return false;
    }
}