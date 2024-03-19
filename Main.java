public class Main {
    public static void main(String[] args) {
        Ingredientes ingrediente1 = new Ingredientes();
        ingrediente1.setNombre("Harina");
        ingrediente1.setCantidad(500);
        System.out.println(ingrediente1);

        Ingredientes ingrediente2 = new Ingredientes();
        ingrediente2.setNombre("Azucar");
        ingrediente2.setCantidad(200);
        System.out.println(ingrediente2);
    }
}
