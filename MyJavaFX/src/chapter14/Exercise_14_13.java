package chapter14;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercise_14_13 extends Application {

	public Exercise_14_13() {
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String[] pieColors = { "blue", "red", "green", "orange" };

		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Project-20", 20), new PieChart.Data("Quiz-10", 10),
				new PieChart.Data("Midterm-30", 30), new PieChart.Data("Final-40", 40));
		int i = 0;

		PieChart pieChart = new PieChart(pieChartData);

		pieChart.setClockwise(false);
		pieChart.setLabelsVisible(true);
		Scene scene = new Scene(pieChart);

		for (PieChart.Data data : pieChartData) {
			data.getNode()
					.setStyle(" -fx-pie-color:" + pieColors[i] + "; -fx-border-width: 0;-fx-background-insets: 0;");
			i++;
		}
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
