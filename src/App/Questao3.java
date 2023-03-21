package App;

import Entidades.q3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do seu salario: ");
        double saldo = teclado.nextInt();
        q3 reajustesaldo = new q3(saldo);
        reajustesaldo.incrementoSaldo();


    }
}
