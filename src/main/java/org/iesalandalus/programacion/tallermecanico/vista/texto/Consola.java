package org.iesalandalus.programacion.tallermecanico.vista.texto;
import org.iesalandalus.programacion.tallermecanico.vista.eventos.Evento;
import org.iesalandalus.programacion.utilidades.Entrada;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Consola {
    private static final String CADENA_FORMATO_FECHA = "dd/MM/yyyy";
    private Consola(){}

    public static void mostrarCabecera(String mensaje){
        System.out.println(mensaje);
        System.out.println("-".repeat(mensaje.length()).concat(""));
        //Esto lo que hace es poner una cadena y despues el comanodo repetir por lo larga que sea la cadena del mensaje.

    }

    public static void mostrarMenu(){
        mostrarCabecera("Gestor de Taller de Reparación de Vehículos.");
        mostrarCabecera("Menú de opciones: ");
        for (Evento opcion : Evento.values()){
            System.out.println(opcion);
        }
    }

    public static Evento elegirOpcion(){
        Evento opcion = null;
        do {
            try {
                opcion = Evento.get(leerEntero("Introduzca el número de opción:"));
            } catch (IllegalArgumentException e) {
                System.out.printf("ERROR: %s%n", e.getMessage());
            }

        } while (opcion == null);


        return opcion;
    }

    static float leerReal(String mensaje){
        System.out.println(mensaje);
        return Entrada.real();

    }

    static int leerEntero(String mensaje){
        System.out.println(mensaje);
        return Entrada.entero();

    }

    static String leerCadena(String mensaje){
        System.out.println(mensaje);
        return Entrada.cadena();
    }

    static LocalDate leerFecha(String mensaje){
        LocalDate fecha;
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern(CADENA_FORMATO_FECHA);
        try {
            fecha = LocalDate.parse(leerCadena(mensaje), formatoFecha);
        }catch (DateTimeParseException e){
            fecha = null;
        }
        return fecha;
    }
}