package Entidades;

public class q5 {
    public q5(double salarioAtual) {
        this.salarioMinimo = 1320.00;
        this.salarioAtual = salarioAtual;
    }

    public void mostraSalario(){
        double mostra = salarioAtual / salarioMinimo;
        System.out.printf("A pessoa tem %.2f salarios minimos",mostra);
    }
    private double salarioMinimo;
    private double salarioAtual;
}
