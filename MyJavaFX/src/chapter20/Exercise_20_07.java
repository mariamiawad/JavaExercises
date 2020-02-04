package chapter20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_20_07 extends Application {

	ArrayList<String> words = new ArrayList<>();
	String word = "";
	int count = 0;
	ArrayList<Character> guess = new ArrayList<>();
	ArrayList<Character> missed = new ArrayList<>();
	ArrayList<Integer> indexes = new ArrayList<>();
	String wrong = "";
	Label label = new Label();
	Label label2 = new Label();
	Character[] charObjectArray;
	Map<String, Character[]> map = new HashMap<>();
//	TextField textField = new TextField();
	private static double HEIGHT = 400;
	private static double WIDTH = 400;
	Pane pane = new Pane();
	Scene scene = new Scene(pane, WIDTH, WIDTH);
	Arc arc = new Arc(WIDTH / 4, HEIGHT - HEIGHT / 12, WIDTH / 5, HEIGHT / 12, 0, 180);
	Line pole = new Line(arc.getCenterX(), arc.getCenterY() - arc.getRadiusY(), arc.getCenterX(),
			pane.getHeight() / 12);
	Line holder = new Line(pole.getEndX(), pole.getEndY(), pane.getWidth() / 1.5, pole.getEndY());
	Line hang = new Line(holder.getEndX(), holder.getEndY(), holder.getEndX(), pane.getHeight() / 6.2);
	Line leftArm;
	Line body;
	Line rightArm;
	Line leftLeg;
	Line rightLeg;
	double radius = WIDTH / 10;
	double factor = 0;
	Arc arc1 = createArc(180, 170);
	Arc arcHang = createArc(180, 170);
	Arc arc2 = createArc(180, 170);
	Arc arc3 = createArc(180, 170);
	Arc arc5 = createArc(180, 170);

	Arc arc6 = createArc(180, 170);
	Arc arc4 = createArc(180, 170);

	Circle c = new Circle(holder.getEndX(), pane.getHeight() / 6 + radius, radius);
	PathTransition pt1 = new PathTransition();
	PathTransition pt = new PathTransition();
	PathTransition pt3 = new PathTransition();
	PathTransition pt4 = new PathTransition();
	PathTransition pt5 = new PathTransition();
	PathTransition pt6 = new PathTransition();
	Timeline timeline;
	boolean isPlaying = true;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Hangman");
		primaryStage.setScene(scene);
		primaryStage.show();
//		timeline.play();
		pane.requestFocus();
		draw();
		getWords();
		setWords();
		arc6.setTranslateX(68);
		arc6.setTranslateY(-180);
		arc2.setTranslateY(-250);
		arc2.setTranslateX(100);
		arc3.setTranslateX(82);
		arc3.setTranslateY(-250);
		arc4.setTranslateX(120);
		arc4.setTranslateY(-250);
		arc5.setTranslateX(133);
		arc5.setTranslateY(-180);
//		pane.getChildren().addAll(textField, label);
		pane.setOnKeyPressed(e -> {
			if (!isPlaying && e.getCode().equals(KeyCode.ENTER)) {
				isPlaying = true;
				stopSwing();
				pane.getChildren().clear();

				draw();
				getWords();
				setWords();

			}
			if (isPlaying && e.getCode().isLetterKey()) {
				play(e.getCode());
			}

		});

	}

	private double[] getPointAtAngle(Circle c, double angle) {
		double x = c.getCenterX() + c.getRadius() * Math.cos(Math.toRadians(angle));
		double y = c.getCenterY() - c.getRadius() * Math.sin(Math.toRadians(angle));

		return new double[] { x, y };
	}

	private Arc createArc(double startAngle, double length) {
		Arc arc = new Arc(0, 0, 0, 0, 250, 50);
		arc.setStroke(Color.BLACK);
		arc.setFill(Color.TRANSPARENT);
		arc.centerXProperty().bind(pane.widthProperty().multiply(0.4));
		arc.centerYProperty().bind(pane.heightProperty().multiply(0.9));
		arc.radiusXProperty().bind(pane.widthProperty().multiply(0.15));
		arc.radiusYProperty().bind(pane.heightProperty().multiply(0.2));
		arc.setTranslateY(-250);
		arc.setTranslateX(150);
		return arc;

	}

	private void redraw() {
		if (!isPlaying) {
			hang.setEndX(arc1.getTranslateX() + arc1.getCenterX() + c.getTranslateX());
			hang.endYProperty().bind(c.translateYProperty().add(c.getCenterY()).subtract(radius));
		} else {
			hang = new Line(holder.getEndX(), holder.getEndY(), holder.getEndX(), pane.getHeight() / 6.2);

		}

	}

	private void drawHead() {
		pane.getChildren().add(c);
	}

	private void drawBody() {
		pane.getChildren().add(body);
	}

	private void drawLeftArm() {
		pane.getChildren().add(leftArm);
	}

	private void drawRightArm() {
		pane.getChildren().add(rightArm);
	}

	private void drawLeftLeg() {
		pane.getChildren().add(leftLeg);

	}

	private void drawRightLeg() {
		pane.getChildren().add(rightLeg);
	}

	private void swing() {
		pathTransation();
		pt.play();
		pt1.play();
		pt3.play();
		pt4.play();
		pt5.play();
		pt6.play();
//		pt7.play();
		timeline.play();
	}

	private void stopSwing() {
		redraw();
		pt.stop();
		pt1.stop();
		pt3.stop();
		pt4.stop();
		pt5.stop();
		pt6.stop();
//			pt7.play();

		timeline.stop();

	}

	private void getWords() {
		words.add("Mariam");
		words.add("Khaled");
		words.add("Dina");
		words.add("Omar");

	}

	private void setWords() {
		int x = ThreadLocalRandom.current().nextInt(0, words.size());
		word = words.get(x);
		guess = new ArrayList<>();
		charObjectArray = word.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
		for (int i = 0; i < word.length(); i++) {
			guess.add('*');
		}
		label.setText(Arrays.toString(guess.toArray()));

	}

	private void draw() {
		c = new Circle(holder.getEndX(), pane.getHeight() / 6 + radius, radius);
		ObservableList<Node> list = pane.getChildren();
		arc1.setTranslateX(100);
		arc1.setTranslateY(-340);
		arcHang.setTranslateX(100);
		arcHang.setTranslateY(-380);
		arc.setFill(Color.TRANSPARENT);
		arc.setStroke(Color.BLACK);
		list.add(arc);
		list.add(pole);
		list.add(holder);

		list.add(hang);

		c.setFill(Color.TRANSPARENT);
		c.setStroke(Color.BLACK);

		double[] p = getPointAtAngle(c, 220);
		leftArm = new Line(WIDTH / 2, WIDTH / 2, p[0], p[1]);

		p = getPointAtAngle(c, 315);
		rightArm = new Line(WIDTH / 1.2, WIDTH / 2, p[0], p[1]);

		p = getPointAtAngle(c, 270);
		body = new Line(p[0], p[1], p[0], WIDTH / 1.6);

		leftLeg = new Line(body.getEndX(), body.getEndY(), WIDTH / 2, WIDTH / 1.3);

		rightLeg = new Line(body.getEndX(), body.getEndY(), WIDTH / 1.2, WIDTH / 1.3);
		HBox hBox = new HBox(10);
		label2.setTranslateX(pole.getStartX());
		label2.setTranslateY(pole.getStartY() - 20);
		label.setTranslateX(pole.getStartX() + 150);
		label.setTranslateY(pole.getStartY());
		label.setWrapText(true);
		label2.setWrapText(true);

		label.setText("");
		label2.setText("");
		hBox.getChildren().addAll(label, label2);
		pane.getChildren().add(hBox);
	}

	private void play(KeyCode e) {
		word = word.toUpperCase();

		indexes = new ArrayList<>();
		char ch = e.getName().charAt(0);
		if (word.indexOf(ch) >= 0) {
			int index = word.indexOf(ch);
			while (index >= 0) {

				indexes.add(index);
				index = word.indexOf(ch, index + 1);

			}
			for (int i = 0; i < indexes.size(); i++) {

				guess.set(indexes.get(i), ch);
				label.setText(Arrays.toString(guess.toArray()));
			}

		}

		else {
			missed.add(ch);
			wrong += ch;

			label2.setText("Missed Letters " + wrong);
			switch (count) {
			case 0:
				drawHead();
				break;
			case 1:
				drawBody();
				break;
			case 2:
				drawLeftArm();
				break;
			case 3:
				drawRightArm();
				break;
			case 4:
				drawLeftLeg();
				break;
			case 5:
				drawRightLeg();
			default:

			}
			count++;
		}

		if (!guess.contains('*')) {
			label.setText("You won");
			label2.setText("To Continue The game Press Enter");
			isPlaying = false;
		}
		if (count >= 7) {
			count = 0;
			missed = new ArrayList<>();
			isPlaying = false;
			label.setText("The word is " + word);
			word = "";
			wrong = "";
			label2.setText("To Continue The game Press Enter");
			swing();
		}

	}

	private void pathTransation() {

		pt.setDuration(Duration.millis(5000));
		pt.setPath(arc2);
		pt.setNode(body);
		pt.setOrientation(PathTransition.OrientationType.NONE);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);

		pt3.setDuration(Duration.millis(5000));
		pt3.setPath(arc3);
		pt3.setNode(leftArm);
		pt3.setOrientation(PathTransition.OrientationType.NONE);
		pt3.setCycleCount(Timeline.INDEFINITE);
		pt3.setAutoReverse(true);

		pt4.setDuration(Duration.millis(5000));
		pt4.setPath(arc4);
		pt4.setNode(rightArm);
		pt4.setOrientation(PathTransition.OrientationType.NONE);
		pt4.setCycleCount(Timeline.INDEFINITE);
		pt4.setAutoReverse(true);

		pt5.setDuration(Duration.millis(5000));
		pt5.setPath(arc5);
		pt5.setNode(rightLeg);
		pt5.setOrientation(PathTransition.OrientationType.NONE);
		pt5.setCycleCount(Timeline.INDEFINITE);
		pt5.setAutoReverse(true);
//		pt5.play();

		pt6.setDuration(Duration.millis(5000));
		pt6.setPath(arc6);
		pt6.setNode(leftLeg);
		pt6.setOrientation(PathTransition.OrientationType.NONE);
		pt6.setCycleCount(Timeline.INDEFINITE);
		pt6.setAutoReverse(true);

		pt1.setDuration(Duration.millis(5000));
		pt1.setPath(arc1);
		pt1.setNode(c);
		pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt1.setCycleCount(Timeline.INDEFINITE);
		pt1.setAutoReverse(true);

		timeline = new Timeline(new KeyFrame(Duration.seconds(0), e -> redraw()), new KeyFrame(Duration.millis(10)));
		timeline.setCycleCount(Animation.INDEFINITE);
	}

}
