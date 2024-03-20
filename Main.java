import entidades.*;

public class Main {
    public static void main(String[] args) {
        FideosConCrema fideosConCrema = new FideosConCrema();
        Milanesa milanesa = new Milanesa();
        PastelDePapa pastelDePapa = new PastelDePapa();

        System.out.println(fideosConCrema.toString());
        System.out.println(milanesa.toString());
        System.out.println(pastelDePapa.toString());
    }
}
