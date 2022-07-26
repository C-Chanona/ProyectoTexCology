package com.upchiapas.texcology.Controllers;

        import java.net.URL;
        import java.util.ResourceBundle;
        import com.upchiapas.texcology.HelloApplication;
        import com.upchiapas.texcology.models.Fichas;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextArea;
        import javafx.scene.input.MouseEvent;

public class HistorialController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCerrar;

    @FXML
    private Button btnHome;

    @FXML
    private TextArea txtHistorial;

    @FXML
    void btnCerrarOnMouseClicked(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    void btnHomeOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Home-view","Home");
    }

    public void visualizarFichas()
    {
        /*for(int i = 0; i< historial.size(); i++)
        {
            txtHistorial.setText(String.valueOf(historial.get(i)));
        }*/

        txtHistorial.setText(String.valueOf(HelloApplication.getListaHistorial()));

    }
    @FXML
    void initialize() {
        visualizarFichas();
    }

}