import javafx.application.Application;
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
    public void start(Stage primaryStage) {
        //Welcome screen
        Image imag1 = new Image(getClass().getResourceAsStream("start_button.jpg"));
        Image imag2 = new Image(getClass().getResourceAsStream("sound_button.jpg"));
        Image imag3 = new Image(getClass().getResourceAsStream("start_background.jpg"));
        Image imag4 = new Image(getClass().getResourceAsStream("letter.jpg"));
        Image imag5 = new Image(getClass().getResourceAsStream("letter_background.jpg"));
        Image imag6 = new Image(getClass().getResourceAsStream("continue.jpg"));
        Image imag7 = new Image(getClass().getResourceAsStream("mainScene.jpg"));
        Image imag8 = new Image(getClass().getResourceAsStream("state_ranking.jpg"));
        Image imag9 = new Image(getClass().getResourceAsStream("duel.jpg"));
        Image imag10 = new Image(getClass().getResourceAsStream("data_center.jpg"));
        Image imag11 = new Image(getClass().getResourceAsStream("npc.jpg"));
        Image imag12 = new Image(getClass().getResourceAsStream("plot_description.jpg"));
        Image imag13 = new Image(getClass().getResourceAsStream("choice.jpg"));



        Button begin = new Button("", new ImageView(imag1));
        begin.setOnAction(e -> primaryStage.setScene(letter));// transfer to introduction letter
        Button sound = new Button("", new ImageView(imag2));
        Button con = new Button("", new ImageView(imag6));
        con.setOnAction(e -> primaryStage.setScene(mainPage));// transfer to main storyline module
        Button ranking = new Button("", new ImageView(imag8));
        Button duel = new Button("", new ImageView(imag9));
        Button data = new Button("", new ImageView(imag10));
        Button c1 = new Button("", new ImageView(imag13));
        c1.setPrefSize(600,100);
        Button c2 = new Button("", new ImageView(imag13));
        c2.setPrefSize(600,100);
        Button c3 = new Button("", new ImageView(imag13));
        c3.setPrefSize(600,100);
        Button c4 = new Button("", new ImageView(imag13));
        c4.setPrefSize(600,100);


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


        VBox v = new VBox();
        v.setBackground(b1);

        StackPane sp = new StackPane();
        sp.getChildren().add(new ImageView(imag4));
        sp.setBackground(b2);

        BorderPane bp = new BorderPane();
        HBox h1 = new HBox();
        VBox v2 = new VBox();
        v2.getChildren().add(c1);
        v2.getChildren().add(c2);
        v2.getChildren().add(c3);
        v2.getChildren().add(c4);
        h1.getChildren().add(new ImageView(imag11));
        h1.getChildren().add(v2);
        bp.setBottom(new ImageView(imag12));
        bp.setCenter(h1);
        bp.setBackground(b3);


        Scene welcome = new Scene(v, 1334, 750);
        Scene letter = new Scene(sp,1334,750);
        Scene mainPage = new Scene(bp, 1334, 750);


        primaryStage.setScene(welcome);
        primaryStage.show();
    }

}
