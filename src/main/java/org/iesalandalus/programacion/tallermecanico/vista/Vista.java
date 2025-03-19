package org.iesalandalus.programacion.tallermecanico.vista;

import org.iesalandalus.programacion.tallermecanico.controlador.Controlador;

import java.util.Objects;

public class Vista {
    private Controlador controlador;

    public void setControlador(Controlador controlador){
        Objects.requireNonNull(controlador, "ERROR: el controlador no puede ser nulo");
        this.controlador = controlador;
    }

    public void comenzar(){
        Opcion opcion;
        do {
            Consola.mostrarMenu();
            opcion = Consola.elegirOpcion();
            ejecutar(opcion);
        } while (opcion != Opcion.SALIR);
        controlador.terminar();
    }
    public void terminar(){
        System.out.println("Hasta luego");
    }
    private void ejecutar(Opcion opcion){
        switch (opcion){
            case INSERTAR_CLIENTE -> insertarCliente()
        }
    }
    private void insertarCliente(){
        Consola.mostrarCabecera("Insertar cliente");
        controlador.insertar(Consola.leerCliente());
        System.out.println("Cliente insertado correctamente");
    }
    private void insertarVehiculo(){
        Consola.mostrarCabecera("Insertar vehiculo");
        controlador.insertar(Consola.leerVehiculo());
        System.out.println("Vehículo insertado correctamente");
    }
    private void insertarRevision(){
        Consola.mostrarCabecera("Insertar revisión");
        controlador.insertar(Consola.leerRevision());
        System.out.println("Revisión insertada correctamente");
    }
    private void buscarCliente(){
        Consola.mostrarCabecera("Buscar cliente");
        controlador.buscar(Consola.leerCliente());
        System.out.println("Cliente buscado correctamente");
    }
    private void buscarVehiculo(){
        Consola.mostrarCabecera("Buscar vehiculo");
        controlador.buscar(Consola.leerVehiculo());
        System.out.println("Vehículo buscado correctamente");
    }
    private void buscarRevision(){
        Consola.mostrarCabecera("Buscar Revisión");
        controlador.buscar(Consola.leerRevision());
        System.out.println("Revisión buscada correctamente");
    }


}
