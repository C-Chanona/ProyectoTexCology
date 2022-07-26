package com.upchiapas.texcology.Controllers;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;


import com.upchiapas.texcology.HelloApplication;
import com.upchiapas.texcology.models.Fichas;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class DonationRegisterController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnConfirmar;

    @FXML
    private CheckBox checkPaqueteria;

    @FXML
    private ComboBox comboLugar;

    @FXML
    private ComboBox comboPaqueteria;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextArea txtComent;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtFech;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPrendaInferior;

    @FXML
    private TextField txtPrendaSuperior;


    @FXML
    void btnConfirmarOnMouseClicked(MouseEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmación");
        alert.setContentText("¿La informacion es correcta?");
        Optional<ButtonType> action = alert.showAndWait();
        // Si hemos pulsado en aceptar
        if (action.get() == ButtonType.OK) {
            String nombre = txtNombre.getText();
            String apellidos = txtApellidos.getText();
            String correo = txtCorreo.getText();
            String lugar = comboLugar.getSelectionModel().getSelectedItem().toString();
            String fecha = txtFech.getText();
            String comentario = txtComent.getText();

            //Instancia de objeto fichas
            Fichas fichaGenerada = new Fichas(nombre,apellidos,correo,fecha,comentario,lugar);

            //Esta guardando un objeto de tipo fichaGenerada en el atributo data del stage
            HelloApplication.getStage().setUserData(fichaGenerada);

            //Guarda el objeto en el arraylist para no perderlo
            HelloApplication.getListaHistorial().add(fichaGenerada);

            this.txtNombre.setText(null);
            this.txtApellidos.setText(null);
            this.txtCorreo.setText(null);
            this.txtFech.setText(null);
            this.txtComent.setText(null);



            HelloApplication.setFXML("FichaConfirmacion-view","Ficha-Confirmada");
        }
        else {
            this.txtNombre.setText(null);
            this.txtApellidos.setText(null);
            this.txtCorreo.setText(null);
            this.txtFech.setText(null);
            this.txtComent.setText(null);
            this.txtNombre.requestFocus();
        }
    }


    @FXML
    void checkPaqueteriaOnMouseClicked(MouseEvent event) {
        //Cuando retorne true aparece y cuando retorne falso desaparace
        comboPaqueteria.setVisible(checkPaqueteria.isSelected());
    }

    @FXML
    void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList("Texcology Mision", "Texcology Parque Central", "Texcology 5 de mayo");
        comboLugar.setItems(list);
        comboPaqueteria.setVisible(false);
        ObservableList<String> paqueteria = FXCollections.observableArrayList("DHL", "FEDEX", "Estafeta");
        comboPaqueteria.setItems(paqueteria);

    }

}
