public class OrdenDeOperaciones {
    public static void main(String[] args) { 

        // El orden de las operaciones dicta la secuencia en la que se evalúa una expresión (como la que se muestra arriba).
        // Los operadores que comparten la misma precedencia se evalúan de izquierda a derecha dentro de la expresión.

        // El orden es el siguiente:
        // 1. Paréntesis
        // 2. Exponentes
        // 3. Módulo / Multiplicación / División
        // 4. Suma / Resta

        int expresion1 = 5 % 2 - (4 * 2 - 1); // Ejemplo de expresión 1
        // System.out.println(expresion1);

        int expresion2 = (3 + (2 * 2 - 5)) + 6 - 5; // Ejemplo de expresión 2
        // System.out.println(expresion2);

        int expresion3 = 5 * 4 % 3 - 2 + 1; // Ejemplo de expresión 3
        // System.out.println(expresion3);
    }
}
