package exercicios.parte3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numero;

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o número para saber a tabuada: ");
        numero = leitura.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i +" = " + numero*i );
        }
    }
}
