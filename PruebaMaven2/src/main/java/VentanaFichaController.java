/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

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
    
    
    public void initAttributtes(String DNI) throws SQLException {
        
        ResultSet r = this.IOB.introduceRegistros("SELECT * FROM DONANTES where DNI = '"+DNI+"'");
        
        r.next();
        System.out.println(r.getString("Nombre"));


        this.txtNombre.setText(r.getString("Nombre"));
        this.txtTipSang.setText(r.getString("GrupoSang")+r.getString("FactorRH"));
        this.txtDNI.setText(DNI);
    
    }
    
}
