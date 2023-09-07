public class CalculadoraImpuestos {
    public static void main(String[] args) {
        double precioProducto = 30;
        double tasaImpuesto = 0.0875;
        double precioTotalConImpuestos = precioProducto + (precioProducto * tasaImpuesto);
        double costoPorPersona = precioTotalConImpuestos / 4;

        System.out.println("Precio total con impuestos: " + precioTotalConImpuestos);
        System.out.println("Costo por persona: " + costoPorPersona);
    }
}
