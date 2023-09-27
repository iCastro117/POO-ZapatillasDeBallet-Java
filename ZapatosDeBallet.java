/**
 * Clase Animal
 */
public class ZapatosDeBallet {
    /**
     * Atributos:
     */
    String tipoCaja;
    String marca;
    double precio;

    /**
     * Constructor de la clase
     * @param tipoCaja Nombre del animal
     * @param marca Marca de la Zpatilla de Ballet
     * @param precio Precio que hace el animal
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    ZapatosDeBallet(String tipoCaja, String marca,double precio ) {
        this.tipoCaja = tipoCaja;
        this.marca = marca;
        this.precio = precio;
    }

    /**
     * Método de imprime los datos referentes a las Zapatillas de Punta de Ballet
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void informacionZapatilla() {
        System.out.println("La Zapatilla de ballet " + marca + " tiene una caja " + tipoCaja + " por ende tiene un precio de $" + precio);
    }
}
