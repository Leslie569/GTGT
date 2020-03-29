package sample;

import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.stage.Stage;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class BubbleChartSample {

    public void initBubbleChartSample(Stage primaryStage) {
        display(primaryStage);
    }

    public void display(Stage stage) {
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

        Scene scene  = new Scene(bubbleChart,1334,750);
        bubbleChart.getData().add(series);
        stage.setScene(scene);
        stage.show();
    }
}