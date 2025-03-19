package org.iesalandalus.programacion.tallermecanico.vista;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public enum Opcion {
    INSERTAR_CLIENTE(11, "Insertar cliente"),
    BUSCAR_CLIENTE(12, "Buscar cliente"),
    BORRAR_CLIENTE(13, "Borrar cliente"),
    LISTAR_CLIENTES(14, "Listar cliente"),
    MODIFICAR_CLIENTE(15, "Modificar cliente"),
    INSERTAR_VEHICULO(21, "Insertar vehiculo"),
    BUSCAR_VEHICULO(22, "Buscar vehiculo"),
    BORRAR_VEHICULO(23, "Borrar vehiculo"),
    LISTAR_VEHICULOS(24, "Listar vehiculo"),
    INSERTAR_REVISION(31, "Insertar revision"),
    BUSCAR_REVISION(32, "Buscar revision"),
    BORRAR_REVISION(33, "Borrar revision"),
    LISTAR_REVIVIONES(34, "Listar revisiones"),
    LISTAR_REVIVIONES_CLIENTE(35, "Listar revisiones de cliente"),
    LISTAR_REVISIONES_VEHICULO(36, "Listar revisiones de vehiculo"),
    ANADIR_HORAS_REVISION(37, "Añadir horas a la revisión"),
    ANADIR_PRECIO_MATERIAL_REVISION(38, "Añadir el precio del material a la revision"),
    CERRAR_REVISION(39, "Cerrar revision"),
    SALIR(0, "Salir");

    private int numeroOpcion;
    private String mensaje;
    private static Map<Integer, Opcion> opciones = new TreeMap<>();

    static{
        for (Opcion opcion : values()){
            opciones.put(opcion.numeroOpcion, opcion);
        }
    }

    private Opcion(int numeroOpcion, String mensaje){
        this.numeroOpcion = numeroOpcion;
        this.mensaje = mensaje;
    }
    public static boolean esValida(int numeroOpcion){
        return opciones.containsKey(numeroOpcion);
    }
    public static Opcion get(int numeroOpcion){
        if (!esValida(numeroOpcion)){
            throw new IllegalArgumentException("El número no es correcto.");
        }
        return opciones.get(numeroOpcion);
    }

    @Override
    public String toString() {
        return String.format("[Numero de la opción=%s, Mensaje=%s]", numeroOpcion, mensaje);
    }
}
