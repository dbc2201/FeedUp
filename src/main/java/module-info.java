module io.dbc.github.feedup {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;


    opens io.dbc.github.feedup to javafx.fxml;
    exports io.dbc.github.feedup;
}