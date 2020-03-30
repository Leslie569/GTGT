package sample;

import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class BubbleChartSample {


    public void display(checkData checkpage, Stage stage) {
        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("longitude");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("latitude");

        //Creating the Bubble chart
        BubbleChart bubbleChart = new BubbleChart(xAxis, yAxis);

        //Prepare XYChart.Series objects by setting data
        XYChart.Series series = new XYChart.Series();
        series.setName("cases");

        series.getData().add(new XYChart.Data(10,80,8));
        series.getData().add(new XYChart.Data(12,40,5));
        series.getData().add(new XYChart.Data(30,50,3));
        series.getData().add(new XYChart.Data(55,10,7));
        series.getData().add(new XYChart.Data(70,70,2));
        series.getData().add(new XYChart.Data(85,10,1));

        Button b1 = new Button();
        b1.setText("< Back");
        b1.setOnAction(e -> checkpage.start(stage));

        Button b2 = new Button();
        b2.setText("National Total");
        LineChartSample initScreen2 = new LineChartSample();
        b2.setOnAction(e -> initScreen2.display(checkpage, stage));

        Button b3 = new Button();
        b3.setText("Simulation");

        BorderPane layout = new BorderPane();
        VBox group = new VBox(40);
        group.getChildren().addAll(b1, b2, b3);

        StackPane hbox = new StackPane();
        hbox.setMaxSize(1100, 750);
        hbox.setId("pane");
        hbox.getChildren().add(bubbleChart);

        layout.setLeft(group);
        layout.setCenter(hbox);

        Scene scene  = new Scene(layout,1334,750);
        scene.getStylesheets().addAll(this.getClass().getResource(
                "checkData.css").toExternalForm());
        bubbleChart.getData().add(series);

        stage.setScene(scene);
        stage.show();
    }
}