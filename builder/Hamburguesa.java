/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author Santiago
 */
import java.util.List;

public class Hamburguesa {

    private final String tipoPan;
    private final String tipoCarne;
    private final String queso;
    private final List<String> ingredientesAdicionales;

    private Hamburguesa(HamburguesaBuilder builder) {
        this.tipoPan = builder.tipoPan;
        this.tipoCarne = builder.tipoCarne;
        this.queso = builder.queso;
        this.ingredientesAdicionales = builder.ingredientesAdicionales;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public String getQueso() {
        return queso;
    }

    public List<String> getIngredientesAdicionales() {
        return ingredientesAdicionales;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" +
                "Pan='" + tipoPan + '\'' +
                ", Carne='" + tipoCarne + '\'' +
                ", Queso='" + (queso != null ? queso : "No") + '\'' +
                ", Ingredientes=" + 
                (ingredientesAdicionales != null ? ingredientesAdicionales : "Ninguno") +
                '}';
    }

    // Builder interno
    public static class HamburguesaBuilder {

        private final String tipoPan;
        private final String tipoCarne;
        private String queso;
        private List<String> ingredientesAdicionales;

        public HamburguesaBuilder(String tipoPan, String tipoCarne) {
            this.tipoPan = tipoPan;
            this.tipoCarne = tipoCarne;
        }

        public HamburguesaBuilder conQueso(String queso) {
            this.queso = queso;
            return this;
        }

        public HamburguesaBuilder conIngredientes(List<String> ingredientes) {
            this.ingredientesAdicionales = ingredientes;
            return this;
        }

        public Hamburguesa build() {
            return new Hamburguesa(this);
        }
    }
}
