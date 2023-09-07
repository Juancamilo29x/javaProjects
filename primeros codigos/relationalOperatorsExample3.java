public class DesafioIntakeAgua {
    public static void main(String[] args) {
        // Establecemos la cantidad recomendada de ingesta diaria de agua en litros
        double ingestaRecomendadaDiaria = 8;

        // Establecemos la duración del desafío en días
        double duracionDesafio = 30;

        // Registramos la cantidad de agua que has consumido
        double tuIngestaDiaria = 235.5;

        // Calculamos la cantidad total recomendada de agua para todo el desafío
        double cantidadTotalRecomendada = ingestaRecomendadaDiaria * duracionDesafio;

        // Verificamos si has completado el desafío al consumir la cantidad recomendada o más
        boolean desafioCompletado = tuIngestaDiaria >= cantidadTotalRecomendada;

        // Imprimimos en pantalla si has completado el desafío o no
        System.out.println(desafioCompletado);
    }
}
