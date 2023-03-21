package App;

import Entidades.q4;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do IPI");
        double IPI = teclado.nextDouble();
        System.out.println("Digite o codigo da peça 1");
        int codigo = teclado.nextInt();
        System.out.println("Digite o valor da peça 1");
        double valor = teclado.nextDouble();
        System.out.println("Digite a quantidade que deseja");
        int quantidade = teclado.nextInt();
        System.out.println("Digite o codigo da peça 2");
        int codigo2 = teclado.nextInt();
        System.out.println("Digite o valor da peça 2");
        double valor2 = teclado.nextDouble();
        System.out.println("Digite a quantidade que deseja");
        int quantidade2 = teclado.nextInt();
        q4 questao4 = new q4(IPI,codigo,valor,quantidade,codigo2,valor2,quantidade2);
        questao4.resultado();


    }
}
