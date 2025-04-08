package org.iesalandalus.programacion.tallermecanico.modelo.negocio.ficheros;

import org.iesalandalus.programacion.tallermecanico.modelo.negocio.IClientes;
import org.iesalandalus.programacion.tallermecanico.modelo.negocio.ITrabajos;
import org.iesalandalus.programacion.tallermecanico.modelo.negocio.IVehiculos;

public class FuenteDatosMemoria implements org.iesalandalus.programacion.tallermecanico.modelo.negocio.IFuenteDatos {
    @Override
    public IClientes crearCliente(){
        return new Clientes();
    }
    @Override
    public IVehiculos crearVehiculos(){
        return new Vehiculos();
    }
    @Override
    public ITrabajos crearTrabajos(){
        return new Trabajos();
    }
}
