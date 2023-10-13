import java.util.Hashtable;

/**
 * Clase que demuestra el uso de un diccionario con Hashtable.
 * 
 * @autor Yael Camarena
 */
public class DiccionarioDemo {

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        // Creación de un diccionario usando Hashtable
        System.out.println("############## Diccionario ##############");
        Hashtable<String, String> diccionario = new Hashtable<String, String>();
        diccionario.put("libro", "Objeto con páginas que contiene texto o imágenes.");
        diccionario.put("computadora", "Dispositivo electrónico utilizado para procesar información.");
        diccionario.put("lápiz", "Instrumento para escribir o dibujar.");
        diccionario.put("silla", "Objeto en el que una persona puede sentarse.");
        diccionario.put("mesa", "Mueble con superficie plana sostenida por patas.");

        // Imprimir todos los elementos del diccionario
        for (String palabra : diccionario.keySet()) {
            System.out.println(palabra + ": " + diccionario.get(palabra));
        }
    }
}
