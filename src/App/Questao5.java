package App;

import Entidades.q5;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salario atual: ");
        double salarioAtual = teclado.nextDouble();
        q5 calculasalario = new q5(salarioAtual);
        calculasalario.mostraSalario();


    }
}
