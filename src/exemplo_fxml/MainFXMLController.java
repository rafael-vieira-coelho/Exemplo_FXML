package exemplo_fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author coelho
 */
public class MainFXMLController implements Initializable {

    private String user;

    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    void setUser(String text) {
        this.user = text;
        label.setText(user);
    }

    @FXML
    public void buttonEvent(ActionEvent e) {
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.close();
        Alert dialogo = new Alert(Alert.AlertType.INFORMATION, "User: " + user + " logged out.");
        dialogo.showAndWait();
    }
}
