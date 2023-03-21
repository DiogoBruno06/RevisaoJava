package App;

import Entidades.q1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantos anos voce tem: ");
        int anos = teclado.nextInt();
        System.out.println("Digite quantos meses voce tem: ");
        int meses = teclado.nextInt();
        System.out.println("Digite quantos dias voce tem: ");
        int dias  = teclado.nextInt();
        q1 q1 = new q1(anos,meses,dias);
        q1.conversorIdade();
    }
}
