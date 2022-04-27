module io.dbc.github.feedup {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.dbc.github.feedup to javafx.fxml;
    exports io.dbc.github.feedup;
    exports io.dbc.github.feedup.controller;
    opens io.dbc.github.feedup.controller to javafx.fxml;
}