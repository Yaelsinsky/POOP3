import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Hashtable;

/**
 * Clase que demuestra el uso de una agenda con Hashtable y Calendar.
 * 
 * @autor Yael Camarena
 */
public class AgendaCumpleanosDemo {

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        // Creación de una agenda usando Hashtable y Calendar
        System.out.println("############## Agenda ##############");
        Hashtable<String, Calendar> agendaCumpleanos = new Hashtable<String, Calendar>();
        agendaCumpleanos.put("Juan", new GregorianCalendar(1990, Calendar.JANUARY, 10));
        agendaCumpleanos.put("María", new GregorianCalendar(1985, Calendar.FEBRUARY, 20));
        agendaCumpleanos.put("Pedro", new GregorianCalendar(2000, Calendar.MARCH, 15));
        agendaCumpleanos.put("Ana", new GregorianCalendar(1995, Calendar.APRIL, 5));
        agendaCumpleanos.put("Luis", new GregorianCalendar(1988, Calendar.MAY, 25));

        // Imprimir todos los registros de la agenda
        for (String nombre : agendaCumpleanos.keySet()) {
            Calendar fecha = agendaCumpleanos.get(nombre);
            System.out.println(nombre + ": " + fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.YEAR));
        }
    }
}
