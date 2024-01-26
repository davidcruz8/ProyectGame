/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectgame;

/**
 *
 * @author david
 */
public abstract class Personaje {
    
    protected double vida;
    
    protected String nombre;
    protected double fuerza;
    protected double destreza;
    protected double resistencia;
    protected double inteligencia;
    
     public Personaje(String nombre, double fuerza, double destreza, double vida, double resistencia, double inteligencia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.vida = vida;
        this.resistencia = resistencia;
        this.inteligencia = inteligencia;

    }

    public void atacar(Personaje p) {
        p.recibirAtaque();
    }

    abstract public double recibirAtaque();
    
   
    
    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getDestreza() {
        return destreza;
    }

    public void setDestreza(double destreza) {
        this.destreza = destreza;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }
    
    

   
}
