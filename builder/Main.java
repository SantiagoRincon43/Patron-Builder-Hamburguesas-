/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author Santiago
 */
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Hamburguesa hamburguesa1 = new Hamburguesa.HamburguesaBuilder("Pan Brioche", "Carne de Res")
                .conQueso("Cheddar")
                .conIngredientes(Arrays.asList("Lechuga", "Tomate", "Tocineta"))
                .build();

        Hamburguesa hamburguesa2 = new Hamburguesa.HamburguesaBuilder("Pan Integral", "Pollo")
                .build();

        System.out.println(hamburguesa1);
        System.out.println(hamburguesa2);
    }
}
