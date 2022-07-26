package com.upchiapas.texcology.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.upchiapas.texcology.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class NosotrosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInicio;

    @FXML
    void btnInicioOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Home-view","Home");
    }

    @FXML
    void initialize() {
        assert btnInicio != null : "fx:id=\"btnInicio\" was not injected: check your FXML file 'SobreNosotros.fxml'.";

    }

}
