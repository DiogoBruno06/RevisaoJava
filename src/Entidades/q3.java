package Entidades;

public class q3 {
    public q3(double saldo) {
        this.saldo = saldo;
    }

    public void incrementoSaldo(){
        double resultado = saldo + saldo * 0.01;
        System.out.println(resultado);
    }

    private double saldo;

}
