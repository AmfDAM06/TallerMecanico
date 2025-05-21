package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;

public class InsertarTrabajo extends Controlador {

    @FXML    private Button btAceptar;
    @FXML    private TextField tfDniTrabajo;
    @FXML    private TextField tfFechaInicioTrabajo;
    @FXML    private TextField tfMatriculaTrabajo;

    @FXML
    void aceptarDatosTrabajo(ActionEvent event) {

    }

}
