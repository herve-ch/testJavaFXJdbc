package pf.chpf.chpftools;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button primaryButton;
    @FXML
    private Button searchButton;
    @FXML
    private TextField fromTextField;
    @FXML
    private TextArea resultTextArea;
    @FXML
    private TextArea errorTextArea;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void search() throws IOException {
    }
    

}
