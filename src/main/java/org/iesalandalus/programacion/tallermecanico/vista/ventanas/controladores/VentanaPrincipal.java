package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.LocalizadorVentanaPrincipal;

import java.io.IOException;

public class VentanaPrincipal {

    @FXML    private Button btBorrarCliente;
    @FXML    private Button btBorrarTrabajo;
    @FXML    private Button btBorrarVehiculo;
    @FXML    private Button btInsertarCliente;
    @FXML    private Button btInsertarTrabajo;
    @FXML    private Button btInsertarVehiculo;
    @FXML    private Button btListarCliente;
    @FXML    private Button btListarTrabajo;
    @FXML    private Button btListarVehiculo;
    @FXML    private ImageView ivBorrarCliente;
    @FXML    private ImageView ivBorrarTrabajo;
    @FXML    private ImageView ivBorrarVehiculo;
    @FXML    private ImageView ivInsertarCliente;
    @FXML    private ImageView ivInsertarTrabajo;
    @FXML    private ImageView ivInsertarVehiculo;
    @FXML    private ImageView ivListarCliente;
    @FXML    private ImageView ivListarTrabajo;
    @FXML    private ImageView ivListarVehiculo;
    @FXML    private MenuItem miAcercaDe;
    @FXML    private MenuItem miBuscarCliente;
    @FXML    private MenuItem miBuscarTrabajo;
    @FXML    private MenuItem miBuscarVehiculo;
    @FXML    private MenuItem miSalir;

    @FXML
    void pulsarAcercaDe(ActionEvent event) {

    }

    @FXML
    void pulsarBorrarClientes(ActionEvent event) {

    }

    @FXML
    void pulsarBorrarTrabajos(ActionEvent event) {

    }

    @FXML
    void pulsarBorrarVehiculos(ActionEvent event) {

    }

    @FXML
    void pulsarBuscarCliente(ActionEvent event) {

    }

    @FXML
    void pulsarBuscarTrabajo(ActionEvent event) {

    }

    @FXML
    void pulsarBuscarVehiculo(ActionEvent event) {

    }

    @FXML
    void pulsarInsertarClientes(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/InsertarCliente.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Insertar Cliente");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void pulsarInsertarTrabajos(ActionEvent event) {

    }

    @FXML
    void pulsarInsertarVehiculos(ActionEvent event) {

    }

    @FXML
    void pulsarListarClientes(ActionEvent event) {

    }

    @FXML
    void pulsarListarTrabajos(ActionEvent event) {

    }

    @FXML
    void pulsarListarVehiculos(ActionEvent event) {

    }

    @FXML
    void pulsarSalir(ActionEvent event) {

    }

}
