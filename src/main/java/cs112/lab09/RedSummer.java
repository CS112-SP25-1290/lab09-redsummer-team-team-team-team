package cs112.lab09;

import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class RedSummer extends Application {

    public static Parent mainViewRoot;
    public static Parent mapViewRoot;
    public static RevisedHistoricalEvent sanFranEvent;
    public static RevisedHistoricalEvent bisbeeEvent;

    @Override
    public void start(Stage stage) throws IOException {
        mainViewRoot = new FXMLLoader(RedSummer.class.getResource("main-view.fxml")).load();
        mapViewRoot = new FXMLLoader(RedSummer.class.getResource("map-view.fxml")).load();
        Scene scene = new Scene(mainViewRoot);
        stage.setScene(scene);
        stage.setTitle(MAIN_TITLE);
        stage.show();
    }

    public static void main(String[] args) {
        sanFranEvent = new RevisedHistoricalEvent(HISTORICAL_DATA[0]);
        bisbeeEvent = new RevisedHistoricalEvent(HISTORICAL_DATA[1]);
        launch();
    }
}