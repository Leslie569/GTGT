package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class TGTG extends Application{
    Scene letter, mainPage;


    @Override
    public void start(Stage primaryStage) throws Exception{
        //Welcome screen
        Image imag1 = new Image(getClass().getResourceAsStream("start_button.png"));
        Image imag2 = new Image(getClass().getResourceAsStream("sound_button.png"));
        Image imag3 = new Image(getClass().getResourceAsStream("start_background.jpg"));
        Image imag4 = new Image(getClass().getResourceAsStream("letter.jpg"));
        Image imag5 = new Image(getClass().getResourceAsStream("letter_background.jpg"));
        Image imag6 = new Image(getClass().getResourceAsStream("continue.png"));
        Image imag7 = new Image(getClass().getResourceAsStream("main_scene.jpg"));
        Image imag8 = new Image(getClass().getResourceAsStream("state_ranking.png"));
        Image imag9 = new Image(getClass().getResourceAsStream("duel.png"));
        Image imag10 = new Image(getClass().getResourceAsStream("info_center.png"));
        Image imag11 = new Image(getClass().getResourceAsStream("npc.jpg"));
        Image imag12 = new Image(getClass().getResourceAsStream("plot_description.jpg"));
        Image imag13 = new Image(getClass().getResourceAsStream("choice.jpg"));


        Button begin = new Button("", new ImageView(imag1));
        begin.setLayoutX(250);
        begin.setLayoutY(220);
        begin.setStyle(
                "-fx-border-color: transparent;" +
                        "-fx-border-width: 0;" +
                        "-fx-background-radius: 0;" +
                        "-fx-background-color: transparent;"
        );

        Button sound = new Button("", new ImageView(imag2));
        sound.setLayoutX(1000);
        sound.setLayoutY(600);
        sound.setStyle(
                "-fx-background-radius: 10em; " +
                        "-fx-min-width: 20px; " +
                        "-fx-min-height: 20px; " +
                        "-fx-max-width: 20px; " +
                        "-fx-max-height: 20px;"
        );
        Button con = new Button("", new ImageView(imag6));
        con.setStyle(
                "-fx-border-color: transparent;" +
                        "-fx-border-width: 0;" +
                        "-fx-background-radius: 0;" +
                        "-fx-background-color: transparent;"
        );
        Button ranking = new Button("", new ImageView(imag8));
        Button duel = new Button("", new ImageView(imag9));
        Button data = new Button("", new ImageView(imag10));
        ImageView choice1 = new ImageView(imag13);
        choice1.setFitHeight(100);
        choice1.setFitWidth(200);
        Button c1 = new Button("", choice1);
        c1.setStyle(
                "-fx-border-color: transparent;" +
                        "-fx-border-width: 0;" +
                        "-fx-background-radius: 0;" +
                        "-fx-background-color: transparent;"
        );
        ImageView choice2 = new ImageView(imag13);
        choice2.setFitHeight(100);
        choice2.setFitWidth(200);
        Button c2 = new Button("", choice2);
        c2.setStyle(
                "-fx-border-color: transparent;" +
                        "-fx-border-width: 0;" +
                        "-fx-background-radius: 0;" +
                        "-fx-background-color: transparent;"
        );
        ImageView choice3 = new ImageView(imag13);
        choice3.setFitHeight(100);
        choice3.setFitWidth(200);
        Button c3 = new Button("", choice3);
        c3.setStyle(
                "-fx-border-color: transparent;" +
                        "-fx-border-width: 0;" +
                        "-fx-background-radius: 0;" +
                        "-fx-background-color: transparent;"
        );
        ImageView choice4 = new ImageView(imag13);
        choice4.setFitHeight(100);
        choice4.setFitWidth(200);
        Button c4 = new Button("", choice4);
        c4.setStyle(
                "-fx-border-color: transparent;" +
                        "-fx-border-width: 0;" +
                        "-fx-background-radius: 0;" +
                        "-fx-background-color: transparent;"
        );


        BackgroundImage welcomeBackground = new BackgroundImage(imag3,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background b1 = new Background(welcomeBackground);
        BackgroundImage letterBackground = new BackgroundImage(imag5,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background b2 = new Background(letterBackground);
        BackgroundImage mainBackground = new BackgroundImage(imag7,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background b3 = new Background(mainBackground);

        //welcome scene
        VBox v = new VBox();
        v.setSpacing(20);
        v.setBackground(b1);
        v.getChildren().addAll(begin);
        v.getChildren().add(sound);

        //letter
        BorderPane bp1 = new BorderPane();
        HBox h2 = new HBox();
        h2.getChildren().add(con);
        bp1.setBottom(h2);
        bp1.setCenter(new ImageView(imag4));
        bp1.setBackground(b2);


        //main scene
        BorderPane bp2 = new BorderPane();
        HBox h1 = new HBox();
        VBox v2 = new VBox();
        v2.getChildren().add(c1);
        v2.getChildren().add(c2);
        v2.getChildren().add(c3);
        v2.getChildren().add(c4);
        h1.getChildren().add(new ImageView(imag11));
        h1.getChildren().add(v2);
        ImageView textBox = new ImageView(imag12);
        bp2.setCenter(h1);
        bp2.setBottom(textBox);
        bp2.setAlignment(textBox, Pos.CENTER);
        bp2.setBackground(b3);


        Scene welcome = new Scene(v, 1334, 750);
        Scene letter = new Scene(bp1,1334,750);
        begin.setOnAction(e -> primaryStage.setScene(letter));// transfer to introduction letter
        Scene mainPage = new Scene(bp2, 1334, 750);
        con.setOnAction(e -> primaryStage.setScene(mainPage));// transfer to main storyline module


        primaryStage.setScene(welcome);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
