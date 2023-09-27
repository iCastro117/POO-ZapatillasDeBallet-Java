/**
 * Primera clase que es ejecutada
 */
public class Principal {
    /**
     * Primer método que se ejecuta en mi aplicación
     * @param args
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public static void main(String[] args) {
        ZapatosDeBallet Sansha = new ZapatosDeBallet("Ancha", "Sansha", 550.000);
        ZapatosDeBallet gato = new ZapatosDeBallet("Angosta", "Grishko", 800.000);
        ZapatosDeBallet vaca = new ZapatosDeBallet("Redonda", "Gaynor", 400.000);

        Sansha.informacionZapatilla();
        gato.informacionZapatilla();
        vaca.informacionZapatilla();
    }
}