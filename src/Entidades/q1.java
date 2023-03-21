package Entidades;

public class q1 {
    public q1(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }
    public void conversorIdade(){
        int multAnos = anos * 365;
        int multMeses = meses * 30;
        int resultado  = multMeses + multAnos + dias;
        System.out.println("A pessoa tem: "+resultado);
    }

    private int anos;
    private int meses;
    private int dias;

}
