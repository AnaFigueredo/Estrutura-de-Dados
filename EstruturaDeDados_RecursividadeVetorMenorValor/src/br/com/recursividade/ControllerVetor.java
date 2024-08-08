package br.com.recursividade;

public class ControllerVetor {

    // Método recursivo para encontrar o menor valor do vetor de números inteiros
    public int menorValor(int[] vetor, int tamanho, int menor) {
        // Condição de parada: quando o tamanho do vetor for igual a 0, retornar o menor valor encontrado
        if (tamanho == 0) {
            return menor;
        }
        // Comparação do último valor do vetor com o menor valor atual
        if (vetor[tamanho - 1] < menor) {
            menor = vetor[tamanho - 1];
        }
        // Relação de chamada recursiva: chamar a função com o tamanho decrementado e o menor valor atualizado
        return menorValor(vetor, tamanho - 1, menor);
    }
}

/*
EXPLICAÇÃO: 
Como foi definida a condição de Parada: if (tamanho == 0) { return menor; }
COMENTÁRIO: Condição de parada: quando o tamanho do vetor for igual a 0, retornar o menor valor encontrado. 
Isso encerra a recursão quando todos os elementos do vetor forem verificados.

Relação de Chamada Recursiva: return menorValor(vetor, tamanho - 1, menor);
COMENTÁRIO: Relação de chamada recursiva: chamar a função com o tamanho decrementado e o menor valor atualizado. 
Isso define o passo recursivo onde a função continua a chamar a si mesma com um valor decrementado de tamanho 
até que a condição de parada seja atingida.












*/