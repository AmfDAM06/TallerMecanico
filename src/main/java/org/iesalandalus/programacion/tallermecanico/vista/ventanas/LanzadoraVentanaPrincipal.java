package org.iesalandalus.programacion.tallermecanico.vista.ventanas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Dialogos;


public class LanzadoraVentanaPrincipal extends Application {

    @Override
    public void start(Stage escenarioPrincipal) {
        try {
            VBox raiz = FXMLLoader.load(LocalizadorVentanaPrincipal.class.getResource("vistas/ventanaPrincipal.fxml"));
            Scene escena = new Scene(raiz);
            escenarioPrincipal.setTitle("Taller Mecánico");
            escenarioPrincipal.setScene(escena);
            escenarioPrincipal.setResizable(false);
            escenarioPrincipal.setOnCloseRequest(e->confirmarSalida(escenarioPrincipal,e));
            escenarioPrincipal.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void comenzar(){
        launch();
    }

    private void confirmarSalida(Stage escenarioPrincipal, WindowEvent e) {
        if (Dialogos.mostrarDialogoConfirmacion("Salir de la aplicacion", "Estas seguro que quieres salir", escenarioPrincipal)) {
            escenarioPrincipal.close();
        } else
            e.consume();
    }
}
