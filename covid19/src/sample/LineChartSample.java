package sample;

import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class LineChartSample {

    public void initLineChartSample(Stage primaryStage) {
        display(primaryStage);
    }

    public void display(Stage stage) {
        stage.setTitle("Line Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Day");
        final LineChart<String,Number> lineChart =
                new LineChart<String,Number>(xAxis,yAxis);

        lineChart.setTitle("Cases vs Time");
        //Region r = ;
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("National cases");

        series1.getData().add(new XYChart.Data("1", 80));
        series1.getData().add(new XYChart.Data("2", 100));
        series1.getData().add(new XYChart.Data("3", 200));
        series1.getData().add(new XYChart.Data("4", 500));
        series1.getData().add(new XYChart.Data("5", 1000));
        series1.getData().add(new XYChart.Data("6", 2000));
        series1.getData().add(new XYChart.Data("7", 4000));

        Scene scene  = new Scene(lineChart,1334,750);
        lineChart.getData().add(series1);

        stage.setScene(scene);
        stage.show();
    }
}