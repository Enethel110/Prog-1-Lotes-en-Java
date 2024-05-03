package programa1;

import java.io.File;
import java.util.Random;

/**
 * @author Daniel Marin
 */
public class Proceso {

    public void BorrarArchivos() {
        File archivo = new File("datos.txt");
        if (archivo.exists()) {
            archivo.delete();
        }
        File archivo2 = new File("Resultados.txt");
        if (archivo2.exists()) {
            archivo2.delete();
        }
    }

    public double generarNumeroAleatorio() {
        // Crear una instancia de la clase Random
        Random random = new Random();
        // Generar un número aleatorio en el rango del 1 al 9
        double numeroAleatorio = random.nextInt(9) + 1;
        return numeroAleatorio;
    }

    public String generarNombreAleatorio() {
        // Lista de nombres
        String[] nombres = {"José", "Carlos", "Carolina", "Juan", "María", "Luis", "Ana", "Pedro", "Laura", "Miguel"};
        // Crear una instancia de la clase Random
        Random random = new Random();
        // Generar un índice aleatorio para seleccionar un nombre de la lista
        int indiceAleatorio = random.nextInt(nombres.length);
        // Obtener el nombre aleatorio seleccionado
        String nombreAleatorio = nombres[indiceAleatorio];
        return nombreAleatorio;
    }

    public String obtenerOperadorAleatorio() {
        Random random = new Random();
        int indice = random.nextInt(4); // Genera un número aleatorio entre 0 y 3

        switch (indice) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2:
                return "*";
            case 3:
                return "/";
            default:
                return null; // En caso de que ocurra algo inesperado
        }
    }

    // Esta función devuelve un número aleatorio mayor o igual a 6 pero menor que 13.
    public int tiempoMaximoEstimado() {
        Random random = new Random();
        // Genera un número aleatorio entre 6 (inclusive) y 12 (exclusive)
        int numero = random.nextInt(13 - 6) + 6;
        return numero;
    }

}
