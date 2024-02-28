module com.di.examen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.di.examen to javafx.fxml;
    exports com.di.examen;
    exports com.di.examen.modelos;
}