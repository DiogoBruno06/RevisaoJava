package Entidades;

public class q2 {
    int n1 ;
    int n2 ;
    int n3 ;

    public q2(int n1, int n2, int n3, int n4, int n5, int n6) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
    }

    public void media(){
        int media = n1+n2+n3 / 3;
        int media2 = n4+n5+n6 / 3;
        int mediaGeral = media+media2 / 2;
        System.out.println(media);
        System.out.println(media2);
        System.out.println(mediaGeral);
    }

    int n4 ;
    int n5 ;

    int n6 ;






}
