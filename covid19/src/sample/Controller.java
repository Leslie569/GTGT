package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.*;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML private CategoryAxis x;
    @FXML private NumberAxis y;
    @FXML private LineChart<?,?> LineChart;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nationalButtonAction();
    }

    @FXML
    private void nationalButtonAction() {
        XYChart.Series series = new XYChart.Series();

        series.getData().add(new XYChart.Data("1", 80));
        series.getData().add(new XYChart.Data("2", 100));
        series.getData().add(new XYChart.Data("3", 200));
        series.getData().add(new XYChart.Data("4", 500));
        series.getData().add(new XYChart.Data("5", 1000));
        series.getData().add(new XYChart.Data("6", 2000));
        series.getData().add(new XYChart.Data("7", 4000));

        LineChart.getData().addAll(series);
    }
}

