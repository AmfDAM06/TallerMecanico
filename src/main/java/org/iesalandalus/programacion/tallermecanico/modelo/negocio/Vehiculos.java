package org.iesalandalus.programacion.tallermecanico.modelo.negocio;

import org.iesalandalus.programacion.tallermecanico.modelo.TallerMecanicoExcepcion;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vehiculos {
    private List<Vehiculo> vehiculos;
    public Vehiculos(){
        vehiculos = new ArrayList<>();
    }
    public List<Vehiculo> get(){
        List<Vehiculo> nuevoVehiculo;
        nuevoVehiculo = vehiculos;
        return nuevoVehiculo;
    }
    public void insertar(Vehiculo vehiculo) throws TallerMecanicoExcepcion {
        Objects.requireNonNull(vehiculo, "No se puede insertar un vehículo nulo.");
        if (vehiculos.contains(vehiculo)){
            throw new TallerMecanicoExcepcion("Ya existe un vehículo con esa matrícula.");
        }
        vehiculos.add(vehiculo);
    }
    public Vehiculo buscar(Vehiculo vehiculo){
        Objects.requireNonNull(vehiculo, "No se puede buscar un vehículo nulo.");
        int vehiculoInd = vehiculos.indexOf(vehiculo);
        if (vehiculoInd == -1){
            return null;
        }
        return vehiculo;
    }
    public void borrar(Vehiculo vehiculo) throws TallerMecanicoExcepcion {
        Objects.requireNonNull(vehiculo, "No se puede borrar un vehículo nulo.");
        int clienteInd = vehiculos.indexOf(vehiculo);
        if (buscar(vehiculo) != null){
            vehiculos.remove(clienteInd);
        } else {
            throw new TallerMecanicoExcepcion("No existe ningún vehículo con esa matrícula.");
        }
    }
}
