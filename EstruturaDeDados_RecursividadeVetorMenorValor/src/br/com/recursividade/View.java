package br.com.recursividade;

import java.util.Scanner;

public class View {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControllerVetor controller = new ControllerVetor();

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];
        System.out.println("Digite valores inteiros para preenchimento do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        // O valor inicial de menor é o último elemento do vetor
        int menor = vetor[tamanho - 1];
        int resultado = controller.menorValor(vetor, tamanho, menor);
        System.out.println("O menor valor deste vetor é: " + resultado);

        scanner.close();
    }
}
