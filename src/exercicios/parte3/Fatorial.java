package exercicios.parte3;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numero =0;
        int resultado =1;

        Scanner leitura = new Scanner(System.in);

        System.out.print("Qual numero quer calcular o fatorial? ");
        numero = leitura.nextInt();

        if (numero == 1 || numero == 0){
            resultado = 1;
        }else {
            for (int i = numero; i > 0; i--) {
                resultado *= i;
            }
        }
        System.out.println("O resultado do fatorial é: "+resultado);
    }
}
