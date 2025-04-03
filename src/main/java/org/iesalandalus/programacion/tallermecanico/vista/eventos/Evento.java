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
    INSERTAR_REVISION(30,"Insertar un trabajo."),
    INSERTAR_MECANICO(31, "Insertar un mecánico"),
    BUSCAR_TRABAJO(32, "Buscar un trabajo."),
    BORRAR_TRABAJO(33,"Borrar un trabajo."),
    LISTAR_TRABAJOS(34,"Listar trabajos."),
    LISTAR_TRABAJOS_CLIENTE(35,"Listar trabajos de un cliente."),
    LISTAR_TRABAJOS_VEHICULO(36,"Listar trabajos de un vehiculo."),
    ANADIR_HORAS_TRABAJO(40,"Añadir horas a un trabajo."),
    ANADIR_PRECIO_MATERIAL_TRABAJO(41,"Añadir precio de material a un trabajo."),
    CERRAR_TRABAJO(42,"Cerrar un trabajo."),
    SALIR(0,"Salir.");


    private static final Map<Integer, Evento> eventos = new HashMap<>();
    private String mensaje;
    private int codigo;

    private Evento(int numeroOpcion, String mensaje) {
        this.mensaje = mensaje;
        this.codigo = numeroOpcion;
    }
    //Ahora mismo solo tenemos el mapa creado hay que inicializaro y rellenarlo con las eventos asi:

    static {
        //esto abre un bloque static

        for (Evento opcion : values()){
            //Hacemos un bucle que recorre todas las eventos del enumerado colocando values() recorre el enum
            eventos.put(opcion.codigo,opcion);
            //con esto le digo que por cada opcion coja el número de opcion asociado y lo coloque

        }
    }

    public static boolean esValido(int numeroOpcion){
        return eventos.containsKey(numeroOpcion);
        //Para un mapa el constainskey toma como si ese número que funciona como CLAVE existe.
    }

    public static Evento get(int numeroOpcion){
        if (esValido(numeroOpcion)) {
            return eventos.get(numeroOpcion);
        } else throw new IllegalArgumentException("El número de opción no es valido.");
    }

    @Override
    public String toString() {
        return String.format("%s: %s", codigo, mensaje);
    }

}
