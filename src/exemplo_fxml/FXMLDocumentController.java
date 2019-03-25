package exemplo_fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author coelho
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField user;

    @FXML
    public void handleSubmitButtonAction(ActionEvent event) throws IOException {
        Alert dialogo = new Alert(Alert.AlertType.INFORMATION, "User: " + user.getText() + " logged in.");
        dialogo.showAndWait();
        Stage stage2 = (Stage) user.getScene().getWindow();
        stage2.close();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainFXML.fxml"));        
        Parent root = (Parent) fxmlLoader.load();
        MainFXMLController controller = fxmlLoader.<MainFXMLController>getController();        

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        controller.setUser(user.getText());        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
