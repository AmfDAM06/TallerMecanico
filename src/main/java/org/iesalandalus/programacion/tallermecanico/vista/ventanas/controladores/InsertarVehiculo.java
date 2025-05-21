package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;

public class InsertarVehiculo extends Controlador {

    @FXML    private Button btAceptar;
    @FXML    private TextField tfMarca;
    @FXML    private TextField tfMatricula;
    @FXML    private TextField tfModelo;

    @FXML
    void aceptarDatosVehiculo(ActionEvent event) {

    }

}
