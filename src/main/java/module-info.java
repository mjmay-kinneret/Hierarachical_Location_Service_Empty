module il.ac.kinneret.mjmay.hls {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.logging;

    opens il.ac.kinneret.mjmay.hls to javafx.fxml;
    opens il.ac.kinneret.mjmay.hls.model to javafx.base;
    exports il.ac.kinneret.mjmay.hls;
}