package sample;

import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class LineChartSample {

    public void display(checkData checkpage, Stage stage) {
        stage.setTitle("Line Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Day");
        final LineChart<String,Number> lineChart =
                new LineChart<String,Number>(xAxis,yAxis);

        lineChart.setTitle("Cases vs Time");
        //Region r = ;
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Confirmed cases");
        series1.getData().add(new XYChart.Data("1", 80));
        series1.getData().add(new XYChart.Data("2", 100));
        series1.getData().add(new XYChart.Data("3", 200));
        series1.getData().add(new XYChart.Data("4", 500));
        series1.getData().add(new XYChart.Data("5", 1000));
        series1.getData().add(new XYChart.Data("6", 2000));
        series1.getData().add(new XYChart.Data("7", 4000));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Death");
        series2.getData().add(new XYChart.Data("1", 1));
        series2.getData().add(new XYChart.Data("2", 3));
        series2.getData().add(new XYChart.Data("3", 6));
        series2.getData().add(new XYChart.Data("4", 10));
        series2.getData().add(new XYChart.Data("5", 30));
        series2.getData().add(new XYChart.Data("6", 50));
        series2.getData().add(new XYChart.Data("7", 100));

        Button b1 = new Button();
        b1.setText("< Back");
        b1.setOnAction(e -> checkpage.start(stage));

        Button b2 = new Button();
        b2.setText("By Regions");
        BubbleChartSample initScreen2 = new BubbleChartSample();
        b2.setOnAction(e -> initScreen2.display(checkpage, stage));

        Button b3 = new Button();
        b3.setText("Simulation");


        BorderPane layout = new BorderPane();
        VBox group = new VBox(40);
        group.getChildren().addAll(b1, b2, b3);

        layout.setLeft(group);
        layout.setCenter(lineChart);

        Scene scene  = new Scene(layout,1334,750);
        scene.getStylesheets().addAll(this.getClass().getResource(
                "checkData.css").toExternalForm());
        lineChart.getData().addAll(series1, series2);

        stage.setScene(scene);
        stage.show();
    }
}