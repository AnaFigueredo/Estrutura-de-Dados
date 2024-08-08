package br.com.recursividade;

import java.util.Scanner;

public class View {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControllerVetorNegativos controller = new ControllerVetorNegativos();

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        int totalNegativos = controller.contarNegativos(vetor, tamanho);
        System.out.println("Total de elementos negativos: " + totalNegativos);

        scanner.close();
    }
}
