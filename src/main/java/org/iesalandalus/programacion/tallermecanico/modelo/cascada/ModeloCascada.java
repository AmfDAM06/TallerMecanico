package org.iesalandalus.programacion.tallermecanico.modelo.cascada;

import org.iesalandalus.programacion.tallermecanico.modelo.TallerMecanicoExcepcion;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.*;
import org.iesalandalus.programacion.tallermecanico.modelo.negocio.FabricaFuenteDatos;
import org.iesalandalus.programacion.tallermecanico.modelo.negocio.ficheros.Clientes;
import org.iesalandalus.programacion.tallermecanico.modelo.negocio.ficheros.Trabajos;
import org.iesalandalus.programacion.tallermecanico.modelo.negocio.ficheros.Vehiculos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

    public class ModeloCascada implements org.iesalandalus.programacion.tallermecanico.modelo.Modelo {

        private Clientes clientes;
        private Vehiculos vehiculos;
        private Trabajos trabajos;


        public ModeloCascada(FabricaFuenteDatos fabricaFuenteDatos){
            comenzar();
        }

        @Override
        public void comenzar(){
            clientes = new Clientes();
            vehiculos = new Vehiculos();
            trabajos = new Trabajos();
        }

        @Override
        public void terminar(){
            System.out.println("El modelo ha terminado.");
        }

        @Override
        public void insertar(Cliente cliente) throws TallerMecanicoExcepcion {
            Objects.requireNonNull(cliente,"El cliente no puede ser nulo.");
            Cliente cliente1 = new Cliente(cliente);
            clientes.insertar(cliente1);
        }

        @Override
        public void insertar(Vehiculo vehiculo) throws TallerMecanicoExcepcion{
            Objects.requireNonNull(vehiculo,"El vehiculo no puede ser nulo.");
            vehiculos.insertar(vehiculo);
        }

        @Override
        public void insertar(Trabajo trabajo) throws TallerMecanicoExcepcion{
            Objects.requireNonNull(trabajo,"El trabajo no puede ser nulo.");
            Trabajo trabajo1 = null;
            if (trabajo instanceof Revision){
                trabajo1 = new Revision(clientes.buscar(trabajo.getCliente()),vehiculos.buscar(trabajo.getVehiculo()),trabajo.getFechaInicio());
            }
            if (trabajo instanceof Mecanico){
                trabajo1 = new Mecanico(clientes.buscar(trabajo.getCliente()),vehiculos.buscar(trabajo.getVehiculo()),trabajo.getFechaInicio());
            }
            trabajos.insertar(trabajo1);
        }

        @Override
        public Cliente buscar(Cliente cliente){
            return new Cliente(clientes.buscar(cliente));
        }

        @Override
        public Vehiculo buscar(Vehiculo vehiculo){
            return vehiculos.buscar(vehiculo);
        }

        @Override
        public Trabajo buscar(Trabajo trabajo){
            return trabajos.buscar(trabajo);
        }

        @Override
        public Cliente modificar(Cliente cliente, String nombre, String telefono)throws TallerMecanicoExcepcion{
            Objects.requireNonNull(cliente,"El cliente no puede ser nulo.");
            Objects.requireNonNull(nombre,"El nombre no puede ser nulo.");
            Objects.requireNonNull(telefono,"El teléfono no puede ser nulo.");
            clientes.modificar(cliente,nombre,telefono);
            return new Cliente(cliente);
        }

        @Override
        public Trabajo anadirHoras(Trabajo trabajo, int horas) throws TallerMecanicoExcepcion{
            Objects.requireNonNull(trabajo,"El trabajo no puede ser nulo.");
            Objects.requireNonNull(horas, "Las horas no pueden ser nulas");
            trabajos.anadirHoras(trabajo, horas);
            return Trabajo.copiar(trabajo);
        }

        @Override
        public Trabajo anadirPrecioMaterial(Trabajo trabajo, float precioMaterial) throws TallerMecanicoExcepcion{
            Objects.requireNonNull(trabajo,"El trabajo no puede ser nulo.");
            trabajos.anadirPrecioMaterial(trabajo,precioMaterial);
            return Trabajo.copiar(trabajo);
        }

        @Override
        public Trabajo cerrar(Trabajo trabajo, LocalDate fechaFin) throws TallerMecanicoExcepcion{
            Objects.requireNonNull(trabajo,"El trabajo no puede ser nulo.");
            Objects.requireNonNull(fechaFin,"La fecha no puede ser nula.");
            trabajos.cerrar(trabajo,fechaFin);
            return Trabajo.copiar(trabajo);
        }

        @Override
        public void borrar(Cliente cliente) throws TallerMecanicoExcepcion{
            Objects.requireNonNull(cliente,"El cliente no pude ser nulo.");
            for (Trabajo trabajoCliente : trabajos.get(cliente)){
                vehiculos.borrar(trabajoCliente.getVehiculo());
                trabajos.borrar(trabajoCliente);
            }
            clientes.borrar(cliente);
        }

        @Override
        public void borrar(Vehiculo vehiculo) throws TallerMecanicoExcepcion{
            Objects.requireNonNull(vehiculo,"El vehiculo no puede ser nulo.");
            for (Trabajo trabajo : trabajos.get(vehiculo)){
                trabajos.borrar(trabajo);
            }
            vehiculos.borrar(vehiculo);
        }

        @Override
        public void borrar(Trabajo trabajo) throws TallerMecanicoExcepcion{
            Objects.requireNonNull(trabajo,"El trabajo no puede ser nulo.");
            trabajos.borrar(trabajo);
        }

        @Override
        public List<Cliente> getClientes() {
            List<Cliente> nuevosClientes = new ArrayList<>();
            for (Cliente cliente: clientes.get()){
                nuevosClientes.add(new Cliente(cliente));
            }
            return nuevosClientes;
        }

        @Override
        public List<Vehiculo> getVehiculos() {
            return new ArrayList<>(vehiculos.get());
        }

        @Override
        public List<Trabajo> getTrabajos() {
            List<Trabajo> nuevosTrabajos = new ArrayList<>();
            for (Trabajo trabajo : trabajos.get()){
                nuevosTrabajos.add(Trabajo.copiar(trabajo));
            }
            return nuevosTrabajos;
        }

        @Override
        public List<Trabajo> getTrabajos(Cliente cliente){
            List<Trabajo> nuevosTrabajos = new ArrayList<>();
            for (Trabajo trabajo : trabajos.get(cliente)){
                nuevosTrabajos.add(Trabajo.copiar(trabajo));
            }
            return nuevosTrabajos;
        }

        @Override
        public List<Trabajo> getTrabajos(Vehiculo vehiculo){
            List<Trabajo> nuevosTrabajos = new ArrayList<>();
            for (Trabajo trabajo : trabajos.get(vehiculo)){
                nuevosTrabajos.add(Trabajo.copiar(trabajo));
            }
            return nuevosTrabajos;
        }
    }