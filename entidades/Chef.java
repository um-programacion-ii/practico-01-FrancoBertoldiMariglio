package entidades;

import com.sun.net.httpserver.Request;

public class Chef {

    private String nombre;
    private int estrellasMichelin;

    private CocinaService cocinaService;

    public Chef() {
    }

    public Chef(String nombre, int estrellasMichelin) {
        this.nombre = nombre;
        this.estrellasMichelin = estrellasMichelin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEstrellasMichelin() {
        return estrellasMichelin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstrellasMichelin(int estrellasMichelin) {
        this.estrellasMichelin = estrellasMichelin;
    }

    @Override
    public String toString() {
        return "Chef{" + "nombre=" + nombre + ", estrellasMichelin=" + estrellasMichelin + '}';
    }

    public void cocinar(Despensa despensa, Receta receta) {
        Ingrediente[] ingredientesDespensa = despensa.getIngredientes();
        Ingrediente[] ingredientesReceta = receta.getIngredientes();
        boolean canCook = true;


        for (Ingrediente ingredienteReceta : ingredientesReceta) {
            for (Ingrediente ingredienteDespensa : ingredientesDespensa) {
                if (ingredienteReceta.getNombre().equals(ingredienteDespensa.getNombre())) {
                    canCook = ingredienteDespensa.sacar(ingredienteReceta.getCantidad());
                    if (!canCook) {
                        break;
                    }
                }
            }
        }

        if (canCook) {
            for (Ingrediente ingredienteDespensa : ingredientesReceta) {
                System.out.println("Van a quedar " + ingredienteDespensa.getCantidad() + " " + ingredienteDespensa.getNombre() +
                " al finalizar la receta");;
            }
        }
        else {
            System.out.println("No se puede cocinar la receta");
        }

        cocinaService.cocinarReceta(receta);
    }
}