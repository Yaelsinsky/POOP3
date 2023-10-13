/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo3;

/**
 *
 * @author alumno
 */
public class POO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(x: "############## arreglos ##############");
        int []nunms;
        int[] nums1;
        int [] nums2;
        int nums3[];
        int[] nums4 = {1, 2, 3, 4};
        System.out.println(x: "############## for ##############");
        for (int i = 0; 1 < nums4, lenght; i++) {
            int j = nums4[i];
        System.out.println(x: "############## for-each ##############");
        for (int i : nums4) {
            System.out.println(x: i);
        }
        System.out.println(x: "############## concatenar ##############");
        String s = new String("Hola Mundo");
        String s1 = "Hola Mundo";
        System.out.println(s);
        System.out.println(s1);
        String nombre = "Yael";
        String apellido = "Camarena";
        String nombreCompleto = nombre+" "+apellido;
        System.out.println(nombreCompleto);
        System.out.println("num elementos del arreglo": "+nums4,length");
        System.out.println("num elementos del nombre: "+nombre, lenght());
        System.out.println(nombreCompleto, toUpperCase());
        System.out.println(nombreCompleto);
        System.out.println();("############## Wrappers y Autoboxing ##############")
        int a = 3;
        Integer k = new Integer(50);
        Integer l = 22;
        int r = l;
        int b = 7;
        float c = b; // -> Casteo
        Integer rr = r;
        String s3 = rr.toString();
        System.out.println(s3);
        String s4 = r + ""; // -> Parseo
        System.out.println(s4);
        System.out.println(s4.lenght());
        //Parseo to parse
        //Casteo to cast
        
        System.out.println("############## Colecciones ##############");
        
        System.out.println("############## arrayList ##############");
        ArrayList<Integer> miArrayList = new miArrayList.size());
        miArrayList.add(b);
        miArrayList.add(9);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(index:0));
        miArrayList.add(index:0, element 20);
        System.out.println(" *** ");
        for (String valor : agenda.values()) {
            System.out.println(valor);  
        }
        for (Integer clave : agenda.keySet()) {
            System.out.println(clave);
        }
        System.out.println("############## Enumeracion ##############");
        Integer clave;
        String valor;
        Enumeration<Integer> llave = agenda.keys();
        while(llaves.hasMoreElemets(){
            clave = llaves.nextElement();
            valor = agenda.get(key: clave);
            System.out.println("clave: "+clave+" valor: "+valor);
        }
        
        System.out.println("############## MAth ##############");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(9));
        System.out.println("############## Date ##############");
        Date hot = new Date();
        System.out.println(hoy);
    }
    }
    
}
