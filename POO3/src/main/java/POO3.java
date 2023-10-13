import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Clase que demuestra el uso de diferentes estructuras y clases en Java.
 * 
 * @autor Yael Camarena
 */
public class POO3 {

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        // Demostración de arreglos
        System.out.println("############## arreglos ##############");
        int[] nums4 = {1, 2, 3, 4};
        
        // Uso de bucle for para recorrer un arreglo
        System.out.println("############## for ##############");
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }
        
        // Uso de for-each para recorrer un arreglo
        System.out.println("############## for-each ##############");
        for (int i : nums4) {
            System.out.println(i);
        }
        
        // Demostración de concatenación de cadenas
        System.out.println("############## concatenar ##############");
        String s = new String("Hola Mundo");
        String s1 = "Hola Mundo";
        System.out.println(s);
        System.out.println(s1);
        String nombre = "Yael";
        String apellido = "Camarena";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
        System.out.println("num elementos del arreglo: " + nums4.length);
        System.out.println("num elementos del nombre: " + nombre.length());
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombreCompleto);
        
        // Demostración de Wrappers y Autoboxing
        System.out.println("############## Wrappers y Autoboxing ##############");
        int a = 3;
        Integer k = new Integer(50);
        Integer l = 22;
        int r = l;
        int b = 7;
        float c = (float) b; // Conversión de tipo (casting)
        Integer rr = r;
        String s3 = rr.toString();
        System.out.println(s3);
        String s4 = r + ""; // Conversión de entero a cadena
        System.out.println(s4);
        System.out.println(s4.length());
        
        // Demostración de colecciones
        System.out.println("############## Colecciones ##############");
        
        // Uso de ArrayList
        System.out.println("############## arrayList ##############");
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(b);
        miArrayList.add(9);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(0, 20);
        System.out.println(" *** ");
        
        // Uso de Hashtable
        Hashtable<Integer, String> agenda = new Hashtable<Integer, String>();
        agenda.put(1, "Juan");
        agenda.put(2, "María");
        for (String valor : agenda.values()) {
            System.out.println(valor);  
        }
        for (Integer clave : agenda.keySet()) {
            System.out.println(clave);
        }
        
        // Uso de enumeración para recorrer un Hashtable
        System.out.println("############## Enumeracion ##############");
        Integer clave;
        String valor;
        Enumeration<Integer> llaves = agenda.keys();
        while(llaves.hasMoreElements()) {
            clave = llaves.nextElement();
            valor = agenda.get(clave);
            System.out.println("clave: " + clave + " valor: " + valor);
        }
        
        // Demostración de la clase Math
        System.out.println("############## Math ##############");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(9));
        
        // Demostración de la clase Date
        System.out.println("############## Date ##############");
        Date hoy = new Date();
        System.out.println(hoy);
    }
}
