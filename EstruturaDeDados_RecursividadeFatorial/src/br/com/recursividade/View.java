package br.com.recursividade;

import java.util.Scanner;

public class View {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControllerFatorial controller = new ControllerFatorial();

        int numero = -1;

        // Continuar solicitando ao usuário um número válido até que ele insira um valor entre 0 e 12
        while (numero < 0 || numero > 12) {
            System.out.println("Digite um número para calcular o fatorial (máximo 12):");
            numero = scanner.nextInt();

            if (numero < 0 || numero > 12) {
                System.out.println("Número inválido! Por favor, insira um número entre 0 e 12.");
            }
        }

        int resultado = controller.fatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);

        scanner.close();
    }
}


/*
COMENTÁRIOS DO CÓDIGO:

Condição de Parada:if (n == 0 || n == 1) { return 1; }
COMENTÁRIO: Condição de parada: o fatorial de 0 ou 1 é 1. 
Isso encerra a recursão quando o número é 0 ou 1, retornando 1 como resultado.

Relação de Chamada Recursiva: return n * fatorial(n - 1);
COMENTÁRIO: Relação de chamada recursiva: n! = n * (n-1)!. 
Isso define o passo recursivo onde a função continua a chamar a si mesma com n-1 até que a condição de parada seja atingida.

*Como escrever a função para o termo  𝑛 em função do termo anterior: fatorial(n) = n * fatorial(n - 1)

Loop para Solicitar Número Válido: while (numero < 0 || numero > 12)
COMENTÁRIO: Continuar solicitando ao usuário um número válido até que ele insira um valor entre 0 e 12.





















*/