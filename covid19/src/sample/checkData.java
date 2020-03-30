package sample;

import javafx.application.Application;
import javafx.fxml.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.Stage;
import javafx.scene.layout.Region;

import java.io.*;
import java.net.URL;
import javafx.scene.media.AudioClip;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

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
        b3.setText("< Back to Office");
        b3.setOnAction(e -> {
            try {
                Parent tableViewParent = FXMLLoader.load(getClass().getResource("mainScene.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);

                //This line gets the Stage information
                Stage window = (Stage) ((Node) e.getSource()).getScene().getWindow();

                window.setScene(tableViewScene);
                window.show();
            } catch (IOException exp){
                return;
            }
        });

        HBox layout = new HBox(40);
        layout.setId("cute");
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(b3, b1, b2);

        StackPane stack = new StackPane();
        stack.setStyle("-fx-background-color: #FFC0CB");
        stack.getChildren().add(layout);

        Scene scene = new Scene(stack, 1334, 750);
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