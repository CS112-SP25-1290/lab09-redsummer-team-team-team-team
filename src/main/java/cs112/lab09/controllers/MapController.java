package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MapController {
    @FXML
    public Pane mapView;

    private Stage popupWindow = null;
    private CityController popupController;

    @FXML
    public void onSanFranButtonClicked() throws IOException {
        updatePopup(RedSummer.sanFranEvent);
    }

    @FXML
    public void onBisbeeButtonClicked() throws IOException {
        updatePopup(RedSummer.bisbeeEvent);
    }

    private void updatePopup(RevisedHistoricalEvent event) throws IOException {
        if (popupWindow == null) {
            popupWindow = new Stage();
            FXMLLoader loader = new FXMLLoader(RedSummer.class.getResource("city-view.fxml"));
            popupWindow.setScene(new Scene(loader.load()));
            popupController = loader.getController();
        }

        // if the window is showing and we click on the same button, hide it instead
        if (popupWindow.isShowing() && popupController.currentEvent.equals(event)) {
            popupWindow.hide();
        }
        else {
            popupController.initData(event.getLocation(), event);
            popupWindow.show();
        }
    }
}
