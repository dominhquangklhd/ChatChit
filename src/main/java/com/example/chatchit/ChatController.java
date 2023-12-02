package com.example.chatchit;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

public class ChatController extends CommonController {

    @FXML
    void backToMenu(MouseEvent event) {
        switchScene("hello-view.fxml");
    }

    @FXML
    void intoCall(MouseEvent event) {
        switchScene("CallFXML.fxml");
    }
}
