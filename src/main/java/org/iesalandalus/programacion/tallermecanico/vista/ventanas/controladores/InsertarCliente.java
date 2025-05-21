package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;

public class InsertarCliente extends Controlador {

    @FXML    private Button btAceptar;
    @FXML    private TextField tfDni;
    @FXML    private TextField tfNombre;
    @FXML    private TextField tfTelefono;

    @FXML
    void aceptarDatosCliente(ActionEvent event) {

    }

}

