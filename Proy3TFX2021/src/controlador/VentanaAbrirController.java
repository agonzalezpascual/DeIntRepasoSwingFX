/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dam2
 */
public class VentanaAbrirController implements Initializable {

    @FXML
    private Button botCam;
    @FXML
    private AnchorPane rootPane;
    @FXML
    private Button botCam1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cambiaVentana(ActionEvent event) throws IOException {
        
        /*AnchorPane pane = FXMLLoader.load(getClass().getResource("vista/ventanaPrincipal.fxml"));
        rootPane.getChildren().setAll(pane);*/
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/ventanaPrincipal.fxml"));
        Parent root = loader.load();
        VentanaPrincipalController controlador = loader.getController();
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide(); 
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.NONE);
        stage.setScene(scene);
        stage.showAndWait();
        
    
    
}

}
