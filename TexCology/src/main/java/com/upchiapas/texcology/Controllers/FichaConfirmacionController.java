package com.upchiapas.texcology.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.upchiapas.texcology.HelloApplication;
import com.upchiapas.texcology.models.Fichas;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class FichaConfirmacionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCerrar;

    @FXML
    private TextArea txtFicha;

    @FXML
    void btnCerrarOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btnregresar(MouseEvent event) {
        HelloApplication.setFXML("Home-view", "Home");

    }

    


    public void mostrarFicha()
    {
        Fichas ficha = (Fichas)HelloApplication.getStage().getUserData();
        txtFicha.setText(ficha.toString());
    }
    

    @FXML
    void initialize() {
        mostrarFicha();
    }

}
