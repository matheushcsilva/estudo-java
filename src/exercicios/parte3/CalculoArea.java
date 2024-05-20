package exercicios.parte3;

import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        double raio =0;
        double lado=0;
        int forma = 0;
        double resultado = 0;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Para calcular a area do quadrado digite 1 e para o circulo digite 2: ");
        forma = leitura.nextInt();
        switch (forma){
        case 1 :
            System.out.print("Digite o tamanho do lado do Quadrado: ");
            lado = leitura.nextDouble();
            resultado = lado*lado;
            System.out.println("A area do quadrado é "+resultado);
            break;
        case 2:
            System.out.print("Digite o raio do circulo: ");
            raio =leitura.nextDouble();
            resultado = raio*raio*Math.PI;
            System.out.println("A area do circulo é "+resultado);
            break;
        }
    }
}
