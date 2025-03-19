package org.iesalandalus.programacion.tallermecanico.modelo.negocio;

import org.iesalandalus.programacion.tallermecanico.modelo.TallerMecanicoExcepcion;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Clientes {
    private List<Cliente> clientes;

    public Clientes(){
        clientes = new ArrayList<>();
    }

    public List<Cliente> get(){
        List<Cliente> nuevaCliente;
        nuevaCliente = clientes;
        return nuevaCliente;
    }
    public void insertar(Cliente cliente) throws TallerMecanicoExcepcion {
        Objects.requireNonNull(cliente, "No se puede insertar un cliente nulo.");
        if (clientes.contains(cliente)){
            throw new TallerMecanicoExcepcion("Ya existe un cliente con ese DNI.");
        }
        clientes.add(cliente);
    }
    public boolean modificar(Cliente cliente, String nombre, String telefono) throws TallerMecanicoExcepcion {
        Objects.requireNonNull(cliente, "No se puede modificar un cliente nulo.");
        if (clientes.contains(cliente)){
            if (nombre != null && !nombre.isBlank()){
                buscar(cliente).setNombre(nombre);
            }
            if (telefono != null && !telefono.isBlank()){
                buscar(cliente).setTelefono(telefono);
            }
            return true;
        }else {
            throw new TallerMecanicoExcepcion("No existe ningún cliente con ese DNI.");
        }
    }
    public Cliente buscar(Cliente cliente){
        Objects.requireNonNull(cliente, "No se puede buscar un cliente nulo.");
        int clienteInd = clientes.indexOf(cliente);
        if (clienteInd == -1){
            return null;
        }
        return cliente;
    }
    public void borrar(Cliente cliente) throws TallerMecanicoExcepcion {
        Objects.requireNonNull(cliente, "No se puede borrar un cliente nulo.");
        int clienteInd = clientes.indexOf(cliente);
        if (buscar(cliente) != null){
            clientes.remove(clienteInd);
        } else {
            throw new TallerMecanicoExcepcion("No existe ningún cliente con ese DNI.");
        }

    }
}
