import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author Grupo2
 */
public class Proy3TFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader root =  new FXMLLoader(Proy3TFX.class.getResource("ventanaPrincipal.fxml"));


        Scene scene = new Scene(root.load(), 930.0D, 906.0D);
        stage.setTitle("Proyecto Banco de Sangre");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
    }
º

/***
 * 
 * @param args 
 */
    public static void main(String[] args) {
        AutoRunFromConsole.runYourselfInConsole(true);
        launch();
        

    }
    
}
