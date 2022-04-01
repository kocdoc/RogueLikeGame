package at.kaindorf.roguelikegame;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.ColumnConstraints;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("settingsScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        Label sliderLabel = (Label) scene.getRoot().lookup("#sliderLabel");

        Slider audioSlide = (Slider) scene.getRoot().lookup("#audioSlide");
        sliderLabel.setText(String.valueOf(Math.round(audioSlide.getValue())));

        audioSlide.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                sliderLabel.textProperty().setValue(String.valueOf(number.intValue()));
            }
        });

        stage.setTitle("Settings");
        stage.setScene(scene)  ;
        stage.setMaximized(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}