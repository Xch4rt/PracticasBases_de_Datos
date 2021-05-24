module com.mycompany.proyecto_uni {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.proyecto_uni to javafx.fxml;
    exports com.mycompany.proyecto_uni;
}
