package br.com.recursividade;

public class ControllerSomatoria {

    // Método recursivo para calcular o somatório dos N primeiros números naturais
    public int somatorio(int n) {
        // Condição de parada: se o número for menor que 0, retornar 0
        if (n < 0) {
            return 0;
        }
        // Condição de parada: se o número for 0, retornar 0
        if (n == 0) {
            return 0;
        }
        // Relação de chamada recursiva: somar n ao resultado da função chamada com (n - 1)
        return n + somatorio(n - 1);
    }
}

/*
Condição de Parada: 
if (n < 0) { return 0; }
Comentário: Condição de parada: se o número for menor que 0, retornar 0. Isso evita somar números negativos.

if (n == 0) { return 0; }
Comentário: Condição de parada: se o número for 0, retornar 0. Isso encerra a recursão quando se atinge 0.

Relação de Chamada Recursiva:
return n + somatorio(n - 1);
Comentário: Relação de chamada recursiva: somar n ao resultado da função chamada com (n - 1). 
Isso define o passo recursivo onde a função continua a chamar a si mesma com um valor decrementado 
de n até que a condição de parada seja atingida.



*/