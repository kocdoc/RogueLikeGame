package at.kaindorf.roguelikegame;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;

public class HelloController {

    @FXML
    Button btSettingsScene;
    @FXML
    Button btTitleScene;

    public void handleSettingsSceneButton() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("settingsScreen.fxml"));

        Stage window = (Stage) btSettingsScene.getScene().getWindow();
        window.setScene(new Scene(root, 1920,1080));

        //Label sliderLabel = (Label) scene.getRoot().lookup("#sliderLabel");

        //Slider audioSlide = (Slider) scene.getRoot().lookup("#audioSlide");
        //sliderLabel.setText(String.valueOf(Math.round(audioSlide.getValue())));

        //audioSlide.valueProperty().addListener(new ChangeListener<Number>() {
        //    @Override
        //    public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
        //        sliderLabel.textProperty().setValue(String.valueOf(number.intValue()));
        //    }
        //});
    }

    public void handleTitleSceneButton() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("titleScreen.fxml"));

        Stage window = (Stage) btTitleScene.getScene().getWindow();
        window.setScene(new Scene(root, 1920, 1080));
    }
}