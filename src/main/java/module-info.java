module es.ieslosmontecillos.appusorectangle {
    requires javafx.controls;
    requires javafx.fxml;
    requires es.ieslosmontecillos.componentes_galvezdiego;


    opens es.ieslosmontecillos.appusorectangle to javafx.fxml;
    exports es.ieslosmontecillos.appusorectangle;
}