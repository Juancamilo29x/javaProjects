public class ComparadorIgualNoIgual {
    public static void main(String[] args) {
        // Definimos el número de canciones en dos álbumes diferentes
        int cancionesAlbumA = 9;
        int cancionesAlbumB = 9;
        
        // Definimos la duración en minutos de dos álbumes diferentes
        int duracionAlbumA = 41;
        int duracionAlbumB = 53;
        
        // Verificamos si ambos álbumes tienen la misma cantidad de canciones
        boolean mismaCantidadCanciones = cancionesAlbumA == cancionesAlbumB;
        
        // Verificamos si la duración de los álbumes es diferente
        boolean diferenteDuracion = duracionAlbumA != duracionAlbumB;
    }
}
