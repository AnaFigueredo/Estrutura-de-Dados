package br.com.recursividade;

import java.util.Scanner;

public class View {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControllerSomatoria controller = new ControllerSomatoria();

        System.out.println("Digite um número natural para calcular o somatório dos N primeiros números naturais:");
        int numero = scanner.nextInt();

        int resultado = controller.somatorio(numero);
        System.out.println("O somatório dos " + numero + " primeiros números naturais é: " + resultado);

        scanner.close();
    }
}
