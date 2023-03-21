package Entidades;

public class q4 {
    public q4(double IPI,int codigo, double valor, int quantidade,int codigo2,double valor2, int quantidade2) {
        this.IPI = IPI;
        this.codigo = codigo;
        this.valor = valor;
        this.quantidade = quantidade;
        this.codigo2 = codigo2;
        this.valor2 = valor2;
        this.quantidade2 = quantidade2;
    }


    public void resultado(){
        double Formula = (valor * quantidade + valor2 *quantidade2)*(IPI/100 + 1);
        System.out.printf("O resultado é: %.2f",Formula);
    }

    private double IPI;
    private int codigo;
    private double valor;

    private int quantidade;

    private int codigo2;
    private double valor2;
    private int quantidade2;

}
