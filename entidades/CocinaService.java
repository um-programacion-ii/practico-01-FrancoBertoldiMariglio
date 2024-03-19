package entidades;

public class CocinaService {

    public void cocinarReceta(Receta receta) {
        System.out.println("Cocinando receta de: " + receta.getClass().getSimpleName());
        System.out.println("Receta: " + receta.getPreparacion());
    }
}
