package es.etg.collection;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;


public class PrimaryController {

    @FXML
    private Button btnGreet;

    @FXML
    private Button btnGreet1;


    @FXML
    private TextArea txtContenido;

    @FXML
    void borrar(MouseEvent event) {

        txtContenido.clear();

    }

    @FXML
    void pulsar(MouseEvent event) {
        EjemploSet coleccion = new EjemploSet(SetType.HASH);
        txtContenido.appendText(coleccion.toString());
    }

}