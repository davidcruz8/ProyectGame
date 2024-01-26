/**
 *
 * @author david
 */
package proyectgame;

public class Simulador {

    public static void main(String[] args) {
        Heroe heroe = new Heroe("heroe", 4, 6, 100, 4, 8);
        Heroina heroina = new Heroina("heroina", 2, 9, 100, 2, 10);
        Monstruo monstruo = new Monstruo("monstruo", 8, 3, 100, 6, 3);

        double NumeroRandom = Math.random();
        int NumeroRandomEntero = (int) (NumeroRandom * 2);

        if (NumeroRandomEntero == 0) {

            monstruo.atacar(heroe);
            System.out.println("El monstruo ha atacado");
        } else {

            heroe.atacar(monstruo);
            System.out.println("El heroe ha atacado");
        }

        System.out.println("Vida de monstruo " + monstruo.getVida());
        System.out.println("Vida de heroe " + heroe.getVida());

    }

}
