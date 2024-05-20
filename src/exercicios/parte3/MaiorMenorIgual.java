package exercicios.parte3;

import java.util.Scanner;

public class MaiorMenorIgual {
    public static void main(String[] args) {
        int num1 =0;
        int num2 =0;

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        num1 = leitura.nextInt();
        System.out.print("Digite mais um número inteiro: ");
        num2 = leitura.nextInt();

        if(num1 != num2){
            if(num1 > num2){
                System.out.println("O número "+ num1+ " é maior que "+num2);
            }else{
                System.out.println("O núemro "+num2+" é maior que "+num1);
            }
        }else {
            System.out.println("Os dois números são iguais");
        }
    }
}
