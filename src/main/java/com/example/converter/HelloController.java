package com.example.converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

        @FXML
        private Button binary = new Button();

        @FXML
        private Button clear = new Button();

        @FXML
        private Button exit = new Button();

        @FXML
        private Button hexa = new Button();

        @FXML
        private TextField input = new TextField();

        @FXML
        private Button nextScreen = new Button();

        @FXML
        private Button octal = new Button();

        @FXML
        private TextArea output = new TextArea();

        @FXML
        void clearPage(ActionEvent event) {
                input.clear();
                output.clear();
        }

        @FXML
        void converOctal(ActionEvent event) {
                String decimal = input.getText();
                try{
                        int n;
                        double d;
                        d = Float.parseFloat(decimal);
                        n = (int)d;
                        if(n == d){
                                output.setText((Integer.toOctalString(Integer.parseInt(decimal))));
                        }
                        else{
                                output.setText("No input given");
                        }

                }catch(NumberFormatException e){
                        output.setText("Not a Number");
                }
        }

        @FXML
        void convertBinary(ActionEvent event) {
                String decimal = input.getText();
                try{
                        int n;
                        double d;
                        d = Float.parseFloat(decimal);
                        n = (int)d;
                        if(n == d){
                                output.setText((Integer.toBinaryString(Integer.parseInt(decimal))));
                        }
                        else{
                                output.setText("No input given");
                        }

                }catch(NumberFormatException e){
                        output.setText("Not a Number");
                }

        }

        @FXML
        void convertHexa(ActionEvent event) {
                String decimal = input.getText();
                try{
                        int n;
                        double d;
                        d = Float.parseFloat(decimal);
                        n = (int)d;
                        if(n == d){
                                output.setText((Integer.toHexString(Integer.parseInt(decimal))));
                        }
                        else{
                                output.setText("No input given");
                        }

                }catch(NumberFormatException e){
                        output.setText("Not a Number");
                }
        }

        @FXML
        void exitPage(ActionEvent event) {
             System.exit(0);
        }

        @FXML
        void next(ActionEvent event) throws IOException {
                Parent Login = FXMLLoader.load(getClass().getResource("nextPage.fxml"));
                Scene log_scene= new Scene(Login);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(log_scene);
                window.show();

        }

}
