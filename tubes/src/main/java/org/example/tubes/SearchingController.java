package org.example.tubes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class SearchingController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField searchbar;
    @FXML
    private Button cariEek;
    @FXML
    private Label hasil;
    @FXML
    private Button backButton;
    @FXML
    private AnchorPane searchPane;

    public HashMap data = new HashMap(); //ganti jadi rbt yak nanti, ini aku nyoba aja pake hashmap

    public void click(ActionEvent actionEvent) {
        System.out.println("hello");
    }
    public void fill(ActionEvent actionEvent) {
        System.out.println("jisung ganteng");
    }
    public void search(ActionEvent actionEvent) { //ini contoh bentuk validation teks nya juga
        data.put("rahmah", "uga"); //coba ntr running aja, terus ketik "rahmah" di text field nya, ntr kluar uga.
        if (data.containsKey(searchbar.getText())) {
            hasil.setText(data.get(searchbar.getText()).toString());
            //rahmah as a key, uga as a value.
        }
    }

    public void backclick(ActionEvent actionEvent) throws IOException {
        System.out.println("mamah cantik");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/tubes/view/hello-view.fxml")));
        Scene mainPageScene = new Scene(root);

        Stage stage = (Stage) searchPane.getScene().getWindow();
        double prevWidth = stage.getWidth();
        double prevHeight = stage.getHeight();

        stage.setScene(mainPageScene);
        stage.setWidth(prevWidth);
        stage.setHeight(prevHeight);

    }
}

