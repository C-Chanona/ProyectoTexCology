package com.upchiapas.texcology.Controllers;

import com.upchiapas.texcology.HelloApplication;
import com.upchiapas.texcology.models.AutenticarUsuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private Button btnIniciar;

    @FXML
    private Button btnSalir;

    @FXML
    private PasswordField txtContraseña;

    @FXML
    private TextField txtUsuario;

    @FXML
    void btnIniciarOnMouseClicked(MouseEvent event) {
        //aqui validara usuarios
        AutenticarUsuario user = new AutenticarUsuario();

        if(user.validarUsuario(txtUsuario.getText(),txtContraseña.getText())) {
            HelloApplication.setFXML("Home-view","Menu - Donacion");
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Login- Error");
            alert.setContentText("El usuario no existe");
            alert.showAndWait();
        }
    }

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(0);
    }

}
