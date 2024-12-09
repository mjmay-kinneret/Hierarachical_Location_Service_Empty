package il.ac.kinneret.mjmay.hls;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class HLSController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //TODO: Fill in the logic for initializing the GUI

    }

    public void localIPChanged(ActionEvent actionEvent) {
        // TODO: Fill in what to do when the local IP address changes.  Maybe validate it?
    }

    public void automaticIP(ActionEvent actionEvent) {
        // TODO: Fill in getting the local IPv4 address.
    }

    public void localPortChanged(ActionEvent actionEvent) {
        // TODO: What to do if the local port changes.  Maybe validate it or update our listening?
    }

    public void fatherIPChanged(ActionEvent actionEvent) {
        // TODO: What to do if the father IP address changes.  Maybe update it in the model?
    }

    public void rootChanged(ActionEvent actionEvent) {
    }

    public void fatherPortChanged(ActionEvent actionEvent) {
    }

    public void startStopListening(ActionEvent actionEvent) {
    }

    public void searchFile(ActionEvent actionEvent) {
    }

    public void retrieveFile(ActionEvent actionEvent) {
    }

    public void addFile(ActionEvent actionEvent) {
    }

    public void browseFile(ActionEvent actionEvent) {
    }

    public void resendAllAddFile(ActionEvent actionEvent) {
    }

    public void deleteFile(ActionEvent actionEvent) {
    }
}
