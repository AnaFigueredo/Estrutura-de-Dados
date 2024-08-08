package br.com.recursividade;

import java.util.Scanner;

public class View {

    public static void main(String[] args) {
        ControllerAplicacaoSoma controller = new ControllerAplicacaoSoma();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro (N):");
        int n = scanner.nextInt();

        // Chamando a função recursiva e exibindo o resultado
        double resultado = controller.somatoria(n);
        System.out.println("A somatória S é: " + resultado);

        scanner.close();
    }
}
