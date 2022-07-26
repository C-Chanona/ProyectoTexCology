module com.upchiapas.texcology {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.upchiapas.texcology to javafx.fxml;
    exports com.upchiapas.texcology;
    exports com.upchiapas.texcology.Controllers;
    opens com.upchiapas.texcology.Controllers to javafx.fxml;
}