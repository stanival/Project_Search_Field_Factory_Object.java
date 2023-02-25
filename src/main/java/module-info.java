module com.example.projectsearchfieldfactoryobjectjava {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.projectsearchfieldfactoryobjectjava to javafx.fxml;
    exports com.example.projectsearchfieldfactoryobjectjava;
}