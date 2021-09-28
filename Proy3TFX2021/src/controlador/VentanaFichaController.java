/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import modelo.Donante;
import modelo.IOBaseDatos;

/**
 * FXML Controller class
 *
 * @author dam2
 */
public class VentanaFichaController implements Initializable {

    @FXML
    private JFXTextField txtNombre;
    @FXML
    private JFXTextField txtDNI;
    @FXML
    private JFXTextField txtTipSang;
    IOBaseDatos IOB = new IOBaseDatos();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    
    public void initAttributtes(String DNI) {
        
        //IOB.introduceRegistros();
        
    }
    
}
