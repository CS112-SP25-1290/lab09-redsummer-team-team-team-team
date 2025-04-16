package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static cs112.lab09.Constants.*;

public class MainController implements Initializable {
    @FXML
    public VBox mainView;
    @FXML
    public Label titleLabel;
    @FXML
    public Label subtitleLabel;
    @FXML
    public Label introLabel;

    public void onStartButtonClicked() {
        Scene scene = mainView.getScene();
        scene.setRoot(RedSummer.mapViewRoot);
        scene.getWindow().sizeToScene();

    }
    public void onQuitButtonClicked() {
        ((Stage)mainView.getScene().getWindow()).close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        titleLabel.setText(MAIN_VIEW_TITLE);
        subtitleLabel.setText(MAIN_SUBTITLE);
        introLabel.setText(MAIN_DESCRIPTION);
    }
}