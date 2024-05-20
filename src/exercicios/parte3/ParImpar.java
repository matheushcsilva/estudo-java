package exercicios.parte3;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int numero = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o número inteiro que deseja vefrificar: ");
        numero = leitura.nextInt();
        if (numero % 2 == 0 ){
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }
}
