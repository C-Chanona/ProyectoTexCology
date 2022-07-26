package com.upchiapas.texcology;

import com.upchiapas.texcology.Controllers.FichaConfirmacionController;
import com.upchiapas.texcology.models.Fichas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    private static Stage stage;
    private static Scene scene;

    private static ArrayList<Fichas> historial = new ArrayList<>();


    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        scene = new Scene(loadFXML("l0gin-view"));
        stage.setTitle("Login-TexCology!");
        stage.setScene(scene);
        stage.centerOnScreen(); //Centra la pantalla en tiempo de ejecucion
        stage.setResizable(false); //impide que el usuario pueda modificar el tamaño del formulario
        stage.show();
    }

    public static Parent loadFXML(String nameView)
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(nameView + ".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setFXML(String nameView,String title){
        scene.setRoot(loadFXML(nameView)); //sustituir en el objeto scene el archivo de vista
        stage.setResizable(true); //Redimensionate
        stage.sizeToScene(); //Renderizar el tamaño del stage con las dimensiones de la nueva vista
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setTitle(title);
    }
    public static Stage getStage(){
        return stage;
    }

    public static ArrayList<Fichas> getListaHistorial()
    {
        return historial;
    }


    public static void main(String[] args) {
        launch();
    }
}