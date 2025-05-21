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
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;

import java.io.IOException;

public class VentanaPrincipal extends Controlador {

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

        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/AcercaDe.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Acerca de");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void pulsarBorrarClientes(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/BorrarCliente.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Borrar Cliente");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void pulsarBorrarTrabajos(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/BorrarTrabajo.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Borrar Trabajo");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void pulsarBorrarVehiculos(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/BorrarVehiculo.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Borrar Vehículo");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void pulsarBuscarCliente(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/BuscarCliente.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Buscar Cliente");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void pulsarBuscarTrabajo(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/BuscarTrabajo.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Buscar Trabajo");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void pulsarBuscarVehiculo(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/BuscarVehiculo.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Buscar Vehículo");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
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
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/InsertarTrabajo.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Insertar Trabajo");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void pulsarInsertarVehiculos(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/InsertarVehiculo.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Insertar Vehículo");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void pulsarListarClientes(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/ListarClientes.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Listar Cliente");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void pulsarListarTrabajos(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/ListarTrabajos.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Listar Trabajos");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void pulsarListarVehiculos(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorVentanaPrincipal.class.getResource("vistas/ListarVehiculos.fxml"));
        try {
            Parent raiz = fxmlLoader.load();

            Scene escena = new Scene(raiz);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Listar Vehículos");
            escenario.setResizable(false);
            escenario.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void pulsarSalir(ActionEvent event) {
        getEscenario().close();
    }

}
