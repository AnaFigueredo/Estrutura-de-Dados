package br.com.recursividade;

public class ControllerVetorNegativos {

    // Função recursiva para contar os elementos negativos em um vetor
    public int contarNegativos(int[] vetor, int n) {
        // Condição de parada: se n for 0, todos os elementos foram verificados
        if (n == 0) {
            return 0;
        }

        // Relação de chamada recursiva:
        // Se o elemento atual (vetor[n-1]) for estritamente menor que 0, incrementa o contador
        if (vetor[n - 1] < 0) {
            return 1 + contarNegativos(vetor, n - 1);
        } else {
            return contarNegativos(vetor, n - 1);
        }

        // Como escrever a função para o termo n em função do termo anterior:
        // Se vetor[n-1] < 0, contarNegativos(n) = 1 + contarNegativos(n-1)
        // Caso contrário, contarNegativos(n) = contarNegativos(n-1)
    }
}

/*
Explicação:

Condição de Parada: A condição de parada é quando n (o tamanho atual do vetor sendo examinado) é 0. 
Nesse ponto, todos os elementos foram verificados, e a função retorna 0.

Relação de Chamada Recursiva: Se o elemento atual vetor[n-1] for negativo, 
adicionamos 1 ao contador e chamamos a função recursiva para n-1. Caso contrário, simplesmente
 chamamos a função recursiva para n-1 sem adicionar ao contador.
















*/