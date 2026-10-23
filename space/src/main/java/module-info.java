module br.com.joaocarloslima {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;

    opens br.com.joaocarloslima to javafx.fxml;
    exports br.com.joaocarloslima;
}
