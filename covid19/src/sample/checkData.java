package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.layout.Region;
import java.net.URL;
import javafx.scene.media.AudioClip;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * entire window is a stage
 * inside stage is a scene
 */

public class checkData extends Application  {

    private Button b1;
    private Button b2;
    private Button b3;

    /**
     * test for launching welcome.java
     * @param args exists
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CheckData");
        b1 = new Button();
        b1.setText("National Total");
        LineChartSample initScreen1 = new LineChartSample();
        b1.setOnAction(e -> initScreen1.display(this, primaryStage));

        b2 = new Button();
        b2.setText("By Regions");
        BubbleChartSample initScreen2 = new BubbleChartSample();
        b2.setOnAction(e -> initScreen2.display(this, primaryStage));

        b3 = new Button();
        b3.setText("Simulation");
        //Duel duel = new Duel();
        //b3.setOnAction(e -> duel.display(primaryStage));

        HBox layout = new HBox(40);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: #FFC0CB");
        layout.getChildren().addAll(b1, b2, b3);

        Scene scene = new Scene(layout, 1334, 750);
        scene.getStylesheets().addAll(this.getClass().getResource(
                "checkData.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * cmd + N, generate code
     * Handle user event
     * the first trunk is the old-fashion way
     * the second trunk is Anonymous class
     * the third trunk is Lambda expression

     //implements EventHandler<ActionEvent>
     button.setOnAction(this);
     @Override
     public void handle(ActionEvent event) {
     // identify which button for this event to occur
     if (event.getSource() == button) {
     System.out.println("works!");
     }
     }

     //implements EventHandler<ActionEvent>
     button.setOnAction(new EventHandler<ActionEvent>() {
     @Override
     public void handle(ActionEvent actionEvent) {
     System.out.println("works!");
     }
     });
     */
}