package com.upchiapas.texcology.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.upchiapas.texcology.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDonacion;

    @FXML
    private Button btnHistorial;

    @FXML
    void btnDonacionOnMouseClicked(MouseEvent event){
        HelloApplication.setFXML("DonationRegister","Registro - Donacion");
    }

    @FXML
    void initialize() {

    }

    public void btnHistorialOnMouseClicked(MouseEvent mouseEvent) {
        HelloApplication.setFXML("Historial-view","Historial");
    }


    @FXML
    void btnNosotrosOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("SobreNosotros","Nosotros");
    }
}
