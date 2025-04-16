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
import javafx.scene.layout.BorderPane;
import javafx.stage.Popup;
import javafx.stage.Stage;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class CityController {
    @FXML
    public BorderPane cityView;
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

    public RevisedHistoricalEvent currentEvent;

    public void initData(String location, RevisedHistoricalEvent event) {
        locationLabel.setText(location);
        dateLabel.setText(event.getEventDay().toString());
        descriptionLabel.setText(event.getDescription());
        revisedDescriptionLabel.setText(event.getRevisedDescription());
        eventImageView.setImage(event.getImage());
        currentEvent = event;
    }

    @FXML
    public void onCloseButtonClicked() {
        ((Stage)(cityView.getScene().getWindow())).close();
    }

    @FXML
    public void onHyperlinkClicked() throws IOException, URISyntaxException {
        Desktop.getDesktop().browse(new URL(currentEvent.getCitation()).toURI());
    }
}
