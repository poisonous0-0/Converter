package com.example.converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class NextPage {

    @FXML
    private Button Back;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent Login = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene log_scene= new Scene(Login);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(log_scene);
        window.show();
    }

}
