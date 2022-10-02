module com.example.freizeitcodeui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.freizeitcodeui to javafx.fxml;
    exports com.example.freizeitcodeui;
}