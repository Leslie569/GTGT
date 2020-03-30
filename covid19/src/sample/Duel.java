package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.lang.Thread;
import java.util.Random;

public class Duel {

    public void display(Stage primaryStage) {
        Stage window = new Stage();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinWidth(800);
        window.setMinHeight(600);

        //scene
        Label label = new Label();
        label.setText("Time for Duel! Select a state you wanna have a duel with. \n 5 minutes later, you will" +
                " battle with the state with the most votes. \n The format will be a timed quiz related to COVID-19 " +
                "general knowledge. \n If your state wins, you will get rewards and the state ranking will move up");
        label.setWrapText(true);
        label.setMaxWidth(300);
        Button b1 = new Button("Select a state");
        Button b2 = new Button("No thanks");
        b2.setOnAction(e -> window.close());

        b1.setOnAction(e -> {
            RadioButton r1 = new RadioButton("state1");
            RadioButton r2 = new RadioButton("state2");
            RadioButton r3 = new RadioButton("state3");
            RadioButton r4 = new RadioButton("state4");
            RadioButton r5 = new RadioButton("state5");
            RadioButton r6 = new RadioButton("state6");
            Button b = new Button("Confirm");

            b.setOnAction(e1 -> {
                Label l1 = new Label();
                l1.setText("Waiting for polling result");
                VBox layout1 = new VBox(10);
                layout1.getChildren().add(l1);
                layout1.setAlignment(Pos.CENTER);
                Scene scene1 = new Scene(layout1);

                window.setScene(scene1);
                window.show();

                try {
                    Thread.sleep(5000); // wait for 5 second
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                window.hide();
                Random rand = new Random();
                int encounter = rand.nextInt(6);
                AlertBox.display("result", "You gonna have a battle with state " + encounter);
            });

            VBox states = new VBox(5);
            states.getChildren().addAll(r1, r2, r3, r4, r5, r6, b);
            states.setAlignment(Pos.CENTER);

            Scene scene2 = new Scene(states);
            window.setScene(scene2);
            window.showAndWait();

        });
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(b1, b2);
        hBox.setAlignment(Pos.CENTER);

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, hBox);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
}
