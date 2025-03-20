package org.iesalandalus.programacion.tallermecanico.modelo.dominio;

import org.iesalandalus.programacion.tallermecanico.modelo.TallerMecanicoExcepcion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Revision extends Trabajo {
    private static final float PRECIO_HORA = 30F;
    private static final float PRECIO_DIA = 10F;
    private static final float PRECIO_MATERIAL = 1.5F;
    private float precioMaterial;

    public Revision(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio){
        setCliente(cliente);
        setVehiculo(vehiculo);
        setFechaInicio(fechaInicio);
        fechaFin = null;
        horas = 0;
        precioMaterial = 0;
    }
    public Revision(Revision revision){
        Objects.requireNonNull(revision, "La revisión no puede ser nula.");
        this.setCliente(new Cliente(revision.cliente));
        this.setVehiculo(revision.vehiculo);
        this.setFechaInicio(revision.fechaInicio);
        this.horas = revision.horas;
        this.precioMaterial = revision.precioMaterial;
        this.fechaInicio = revision.fechaInicio;
        this.fechaFin = revision.fechaFin;
    }


    public float getPrecioMaterial() {
        return precioMaterial;
    }

    public void setPrecioMaterial(float precioMaterial) {
        this.precioMaterial = precioMaterial;
    }

    public void anadirPrecioMaterial(float precioMaterial) throws TallerMecanicoExcepcion {
        Objects.requireNonNull(precioMaterial,"El precio material no puede ser nulo.");
        if (fechaFin != null){
            throw new TallerMecanicoExcepcion("No se puede añadir precio del material, ya que la revisión está cerrada.");
        }
        if (precioMaterial <= 0){
            throw new IllegalArgumentException("El precio del material a añadir debe ser mayor que cero.");
        }
        this.precioMaterial += precioMaterial;

    }

    @Override
    public String toString() {
        String fechaIF = fechaInicio.format(FORMATO_FECHA);

        if (fechaFin == null){

            return String.format("%s - %s (%s) - %s %s - %s: (%s - ), %s horas, %.2f € en material", cliente.getNombre(), cliente.getDni(), cliente.getTelefono(), vehiculo.marca(), vehiculo.modelo(), vehiculo.matricula(), fechaIF, getHoras(), getPrecioMaterial());
        }

        String fechaFF = fechaFin.format(FORMATO_FECHA);
        return String.format("%s - %s (%s) - %s %s - %s: (%s - %s), %s horas, %.2f € en material, %.2f € total", cliente.getNombre(), cliente.getDni(), cliente.getTelefono(), vehiculo.marca(), vehiculo.modelo(), vehiculo.matricula(), fechaIF, fechaFF, getHoras(), getPrecioMaterial(), getPrecio());
    }
}

