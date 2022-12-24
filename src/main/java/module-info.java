module com.rk.gxtv.galaxytravellerjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.rk.gxtv.galaxytravellerjava to javafx.fxml;
    exports com.rk.gxtv.galaxytravellerjava;
}