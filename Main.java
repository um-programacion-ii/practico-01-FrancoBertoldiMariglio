import entidades.Ingrediente;
import entidades.Despensa;

public class Main {
    public static void main(String[] args) {
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("Harina");
        ingrediente1.setCantidad(500);
        System.out.println(ingrediente1);

        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("Azucar");
        ingrediente2.setCantidad(200);
        System.out.println(ingrediente2);

        Despensa despensa = new Despensa();
        despensa.addIngrediente(ingrediente1);
        despensa.addIngrediente(ingrediente2);
        despensa.getIngrediente("Harina", 100);
        System.out.println(ingrediente1);
        despensa.getIngrediente("Azucar", 300);
        System.out.println(ingrediente2);
    }
}
