import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digíte o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digíte o segundo número: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;

        double subtracao = num1 - num2;

        double multiplicacao = num1 * num2;

        double divisao = num1 / num2;

        System.out.println("Soma: "+ soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        scanner.close();
    }
}
