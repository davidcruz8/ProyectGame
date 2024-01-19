/**
 *
 * @author david
 */
package proyectgame;

public class Personaje {

    private String nombre;
    private double fuerza;
    private double destreza;
    private double vida;
    private double resistencia;
    private double inteligencia;

    public Personaje(String nombre, double fuerza, double destreza, double vida, double resistencia, double inteligencia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.vida = vida;
        this.resistencia = resistencia;
        this.inteligencia = inteligencia;

    }

    public String getNombre() {
        return nombre;
    }

    public double getFuerza() {
        return fuerza;
    }

    public double getDestreza() {
        return destreza;
    }

    public double getVida() {
        return vida;
    }

    public double getResistencia() {
        return resistencia;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public void setDestreza(double destreza) {
        this.destreza = destreza;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void recibirAtaque(double inteligencia, double fuerza, double destreza) {

        double impacto;

        impacto = ((inteligencia * 2) + (fuerza * 2) + (destreza) - resistencia);

        if (impacto > 0) {

            this.vida = this.vida - impacto;
        }

    }
    public void atacar (Personaje p){
        p.recibirAtaque(this.inteligencia, this.fuerza, this.destreza);
    }
    
}
