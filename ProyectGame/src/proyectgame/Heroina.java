/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectgame;

/**
 *
 * @author david
 */
public class Heroina extends Personaje {

    public Heroina(String nombre, double fuerza, double destreza, double vida,
            double resistencia, double inteligencia) {
        super(nombre, fuerza, destreza, vida, resistencia, inteligencia);
    }

    @Override
    public double recibirAtaque() {
        double impacto;

        impacto = ((inteligencia) + (fuerza * 3) + (destreza - 2) - resistencia);

        if (impacto > 0) {
            this.vida = this.vida - impacto;
        }
        return this.vida;
    }
}
