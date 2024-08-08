package br.com.recursividade;

public class ControllerAplicacaoSoma{

    // Função recursiva para calcular a somatória S = 1 + 1/2 + 1/3 + ... + 1/N
    public double somatoria(int n) {
        // Condição de parada: se N for igual a 1, retornamos 1.0, pois 1/1 é o último termo da somatória.
        if (n == 1) {
            return 1.0;
        } else {
            // Relação de chamada dos passos:
            // A função recursiva é definida como S(n) = 1/n + S(n-1)
            return 1.0 / n + somatoria(n - 1);
        }
    }
}
