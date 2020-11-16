module com.mycompany.pickinglist {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.activation;
    requires java.annotation;   
    requires java.persistence;
    requires javafx.base;
    requires javafx.graphics;
    
    exports com.mycompany.Main;
    opens com.mycompany to javafx.fxml;  
    opens com.mycompany.Main to javafx.fml;  
}
