package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class CityController {
    @FXML
    public Label locationLabel;
    @FXML
    public Label dateLabel;
    @FXML
    public Label descriptionLabel;
    @FXML
    public Label revisedDescriptionLabel;
    @FXML
    public ImageView eventImageView;
    @FXML
    public Hyperlink citationHyperlink;


    @FXML
    public void onCloseButtonClicked(ActionEvent event) {
        System.out.println("Close");
    }
}
