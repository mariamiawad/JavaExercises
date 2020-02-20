package chapter15;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_15_36 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

        double limit = 10000;
        for (int i = 10; i <= 80; i++) {

            int deadEndCount = 0;

            for (int j = 0; j < limit; j++) {

                RandomWalkPane pane = new RandomWalkPane(i,i);
                if (!pane.hasHitBorder()) {
                    deadEndCount++;
                }
            }

            String probability = String.format("%.1f", deadEndCount / limit * 100.0);

            System.out.println("For a lattice of size "+i+", the probability of dead-end paths is "+ probability);
        }
	}
	public static void main(String[] args) {
		launch(args);

	}

	private class RandomWalkPane extends Pane {
		Button button = new Button("Start");
		private double size = 20;
		private double squareCount = 16;
		private double w = size * squareCount;
		private double h = w;
		private Point2D centerP = new Point2D(w / 2, h / 2);
		private Point2D currentP = centerP;

		boolean hasHitBorder;

		ArrayList<Point2D> points = new ArrayList<>();

		private RandomWalkPane(double size, double squareCount) {

			this.size = size;
			this.squareCount = squareCount;
			w = size * squareCount;
			h = w;
			if (squareCount % 2 == 0) {
				centerP = new Point2D(w / 2, h / 2);
			} else {
				centerP = new Point2D(w / 2 + (size / 2), h / 2 - (size / 2));
			}
			currentP = centerP;

			setPrefWidth(w);
			setPrefHeight(h);
			drawLayout();

			// Generate path until it hits a border or a dead end
			while (nextPath() && !hasHitBorder)
				;

		}

		private void drawLayout() {
			getChildren().add(button);
			for (int i = 0; i <= squareCount; i++) {
				Line line = new Line(0, i * size, w, i * size);
				line.setOpacity(0.1);

				// add all possible points

				for (int j = 0; j <= squareCount; j++) {
					double x = j * size;
					double y = i * size;

					points.add(new Point2D(x, y));

				}
				getChildren().add(line);
			}

			// since we start at the center
			// remove center point from points
			PaneCollection paneCollection = new PaneCollection();
			paneCollection.removePoint(points, centerP.getX(), centerP.getY());

			// vertical line
			for (int i = 0; i < squareCount; i++) {
				Line line = new Line(i * size, 0, i * size, h);
				line.setOpacity(0.1);
				getChildren().add(line);
			}
		}

		private boolean nextPath() {
			// get possible paths
			Point2D[] possiblePs = new Point2D[4];
			possiblePs[0] = new Point2D(currentP.getX(), currentP.getY() - size); // up
			possiblePs[1] = new Point2D(currentP.getX(), currentP.getY() + size); // down
			possiblePs[2] = new Point2D(currentP.getX() - size, currentP.getY()); // left
			possiblePs[3] = new Point2D(currentP.getX() + size, currentP.getY()); // right

			boolean hasMoved = false;
			boolean[] visted = new boolean[possiblePs.length];

			for (int i = 0; i < 4;) {
				int ranIndex = (int) (Math.random() * 4);

				if (!visted[ranIndex]) {
					visted[ranIndex] = true;
					i++;
					Point2D p = possiblePs[ranIndex];
					PaneCollection paneCollection = new PaneCollection();
					if (paneCollection.containsPoint(points, p.getX(), p.getY())) {

						// draw path
						Line line = new Line(currentP.getX(), currentP.getY(), p.getX(), p.getY());
						currentP = p; // update current Point
						getChildren().add(line);

						// remove point from point tracker
						paneCollection.removePoint(points, p.getX(), p.getY());

						// make the new point the current point
						// update hasMoved
						hasMoved = true;
						checkBorder(currentP);

						break; // break out of loop early
					}

				}
			}

			return hasMoved; // return moved status
		}

		private void checkBorder(Point2D p) {
			double x = p.getX();
			double y = p.getY();

			if (x <= 0 || x >= w)
				hasHitBorder = true;
			if (y <= 0 || y >= h)
				hasHitBorder = true;
		}

		public boolean hasHitBorder() {
			return hasHitBorder;
		}
	}

	class PaneCollection {

		public boolean containsPoint(ArrayList<Point2D> points, double x, double y) {
			for (Point2D p : points) {
				if (p.getX() == x && p.getY() == y)
					return true;
			}
			return false;
		}

		public boolean removePoint(ArrayList<Point2D> points, double x, double y) {

			int index = 0;
			for (Point2D p : points) {
				if (p.getX() == x && p.getY() == y) {
					points.remove(index);
					return true;
				}
				index++;
			}
			return false;
		}

	}

}
