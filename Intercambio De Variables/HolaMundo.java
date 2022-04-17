/**
 * HolaMundo
 */
public class HolaMundo {
    public static void main(String[] args) {
        // INTERCAMBIO DE VARIABLES EN JAVA
        System.out.println("Intercambio de VARIABLES");
        String nombreUno = "Andres";
        String nombreDos = "Joel";
        String temporal = "";

        System.out.println(nombreUno + " : " + nombreDos);

        temporal = nombreUno;
        nombreUno = nombreDos;
        nombreDos = temporal;
        temporal = "";

        System.out.println(nombreUno + " : " + nombreDos);

    }
}