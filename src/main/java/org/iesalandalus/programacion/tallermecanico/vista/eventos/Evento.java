
package org.iesalandalus.programacion.tallermecanico.vista.eventos;

import java.util.HashMap;
import java.util.Map;

public enum Evento {

    INSERTAR_CLIENTE(10,"Insertar un cliente."),
    BUSCAR_CLIENTE(11,"Buscar un cliente."),
    BORRAR_CLIENTE(12,"Borrar un cliente."),
    LISTAR_CLIENTES(13,"Listar clientes."),
    MODIFICAR_CLIENTE(14,"Modificar un cliente."),
    INSERTAR_VEHICULO(20,"Insertar un vehiculo."),
    BUSCAR_VEHICULO(21,"Buscar un vehiculo."),
    BORRAR_VEHICULO(22,"Borrar un vehiculo."),
    LISTAR_VEHICULOS(23,"Listar vehículos."),
    INSERTAR_REVISION(30,"Insertar una revisión."),
    INSERTAR_MECANICO(31,"Insertar un trabajo mecánico."),
    BUSCAR_TRABAJO(32, "Buscar una revisión."),
    BORRAR_TRABAJO(33,"Borrar una revisión."),
    LISTAR_TRABAJOS(34,"Listar revisiones."),
    LISTAR_TRABAJOS_CLIENTE(35,"Listar revisiones de un cliente."),
    LISTAR_TRABAJOS_VEHICULO(36,"Listar revisiones de un vehiculo."),
    ANADIR_HORAS_TRABAJO(40,"Añadir horas a una revisión."),
    ANADIR_PRECIO_MATERIAL_MECANICO(41,"Añadir precio de material a una revisión."),
    CERRAR_TRABAJO(42,"Cerrar una revisión."),
    MOSTRAR_ESTADISTICAS_MENSUALES(50,"Mostrar estadísticas mensuales"),
    SALIR(0,"Salir."),;


    private static final Map<Integer, Evento> opciones = new HashMap<>();
    private String mensaje;
    private int numeroOpcion;

    private Evento(int numeroOpcion, String mensaje) {
        this.mensaje = mensaje;
        this.numeroOpcion = numeroOpcion;
    }
    //Ahora mismo solo tenemos el mapa creado hay que inicializaro y rellenarlo con las opciones asi:

    static {
        //esto abre un bloque static

        for (Evento evento : values()){
            //Hacemos un bucle que recorre todas las opciones del enumerado colocando values() recorre el enum
            opciones.put(evento.numeroOpcion, evento);
            //con esto le digo que por cada opcion coja el número de opcion asociado y lo coloque

        }
    }

    public static boolean esValido(int numeroOpcion){
        return opciones.containsKey(numeroOpcion);
        //Para un mapa el constainskey toma como si ese número que funciona como CLAVE existe.
    }

    public static Evento get(int numeroOpcion){
        if (esValido(numeroOpcion)) {
            return opciones.get(numeroOpcion);
        } else throw new IllegalArgumentException("El número de opción no es valido.");
    }

    @Override
    public String toString() {
        return String.format("%s: %s",numeroOpcion, mensaje);
    }

}
