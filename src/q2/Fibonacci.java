package q2;
/*
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2
valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que
desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando
se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente
definido no código;
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;

        if (belongsToFibonacci(n)) {
            System.out.println(n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(n + " não pertence à sequência de Fibonacci.");
        }

    }

    public static boolean belongsToFibonacci(int numero) {
        int first = 0;
        int second = 1;
        // itera até que o próximo valor na sequência seja menor ou igual ao número fornecido
        while (second <= numero) {
            // verifica se o número fornecido está na sequência
            if (second == numero) {
                return true;
            }
            // calcula o próximo número na sequência
            int temp = first + second;
            first = second;
            second = temp;
        }
        return false;
    }
}
