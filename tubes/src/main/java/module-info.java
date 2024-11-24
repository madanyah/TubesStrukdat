module org.example.tubes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.tubes to javafx.fxml;
    exports org.example.tubes;
}