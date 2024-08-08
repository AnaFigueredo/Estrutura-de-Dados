package br.com.recursividade;

public class ControllerFatorial {

    // Método recursivo para calcular o fatorial de um número
    public int fatorial(int n) {
        // Condição de parada: o fatorial de 0 ou 1 é 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Relação de chamada recursiva: n! = n * (n-1)!
        // Como escrever a função para o termo n em função do termo anterior:
        // fatorial(n) = n * fatorial(n - 1)
        return n * fatorial(n - 1);
    }
}
