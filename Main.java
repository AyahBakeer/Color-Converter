package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Main extends Application {
	@Override
	public void start(Stage stage) {

		Polygon frontwall = new Polygon();

		// Adding coordinates to the frontwall
		frontwall.getPoints()
				.addAll(new Double[] { 900.0, 640.0, 1135.0, 500.0, 1370.0, 640.0, 1370.0, 940.0, 900.0, 940.0, });

		frontwall.setFill(Color.WHITE);

		frontwall.setStroke(Color.BLACK);
		Polygon sidewall = new Polygon();

		// Adding coordinates to the sidewall
		sidewall.getPoints()
				.addAll(new Double[] { 1590.0, 570.0, 1590.0, 840.0, 1370.0, 940.0, 1370.0, 640.0, 1420.0, 670.0

				});

		sidewall.setFill(Color.WHITE);

		sidewall.setStroke(Color.BLACK);

		Polygon frontroof = new Polygon();

		// Adding coordinates to the frontroof
		frontroof.getPoints().addAll(new Double[] { 850.0, 640.0, 1135.0, 460.0, 1420.0, 640.0, 1420.0, 670.0, 1135.0,
				500.0, 850.0, 670.0, });

		frontroof.setFill(Color.WHITE);

		frontroof.setStroke(Color.BLACK);

		Polygon sideroof = new Polygon();

		sideroof.getPoints().addAll(new Double[] { 1625.0, 550.0, 1625.0, 520.0, 1420.0, 640.0, 1420.0, 670.0 });

		sideroof.setFill(Color.WHITE);

		sideroof.setStroke(Color.BLACK);

		Polygon sideroofb = new Polygon();

		sideroofb.getPoints().addAll(new Double[] {

				1625.0, 520.0, 1350.0, 340.0, 1135.0, 460.0, 1420.0, 640.0 });

		sideroofb.setFill(Color.WHITE);

		sideroofb.setStroke(Color.BLACK);

		Polygon rightwindow = new Polygon();

		// Adding coordinates to the right window
		rightwindow.getPoints().addAll(new Double[] { 1330.0, 650.0, 1210.0, 650.0, 1210.0, 750.0, 1330.0, 750.0 });

		rightwindow.setFill(Color.WHITE);

		rightwindow.setStroke(Color.BLACK);

		Polygon rightwindowedge = new Polygon();

		// Adding coordinates to the right window
		rightwindowedge.getPoints().addAll(new Double[] { 1335.0, 760.0, 1205.0, 760.0, 1205.0, 750.0, 1335.0, 750.0 });

		rightwindowedge.setFill(Color.WHITE);

		rightwindowedge.setStroke(Color.BLACK);

		Polygon leftwindow = new Polygon();

		// Adding coordinates to the right window
		leftwindow.getPoints().addAll(new Double[] { 950.0, 650.0, 1060.0, 650.0, 1060.0, 750.0, 950.0, 750.0 });

		leftwindow.setFill(Color.WHITE);

		leftwindow.setStroke(Color.BLACK);

		Polygon ledtwindowedge = new Polygon();

		// Adding coordinates to the right window
		ledtwindowedge.getPoints().addAll(new Double[] { 945.0, 760.0, 1065.0, 760.0, 1065.0, 750.0, 945.0, 750.0 });

		ledtwindowedge.setFill(Color.WHITE);

		ledtwindowedge.setStroke(Color.BLACK);

		Polygon sidewindow = new Polygon();

		// Adding coordinates to the sidewindow
		sidewindow.getPoints()
				.addAll(new Double[] { 1555.0, 590.0, 1420.0, 670.0, 1410.0, 665.0, 1410.0, 735.0, 1555.0, 665.0

				});

		sidewindow.setFill(Color.WHITE);

		sidewindow.setStroke(Color.BLACK);
		Polygon sidewindowedge = new Polygon();

		// Adding coordinates to the sidewindowedge
		sidewindowedge.getPoints().addAll(new Double[] { 1400.0, 740.0, 1565.0, 660.0, 1565.0, 670.0, 1400.0, 750.0

		});

		sidewindowedge.setFill(Color.WHITE);

		sidewindowedge.setStroke(Color.BLACK);
		Polygon leftdoor = new Polygon();

		// Adding coordinates to the right window
		leftdoor.getPoints().addAll(new Double[] { 1060.0, 785.0, 1127.5, 785.0, 1127.5, 940.0, 1060.0, 940.0 });

		leftdoor.setFill(Color.WHITE);

		leftdoor.setStroke(Color.BLACK);
		Polygon rightdoor = new Polygon();

		// Adding coordinates to the right window
		rightdoor.getPoints().addAll(new Double[] { 1195.0, 785.0, 1127.5, 785.0, 1127.5, 940.0, 1195.0, 940.0 });

		rightdoor.setFill(Color.WHITE);

		rightdoor.setStroke(Color.BLACK);

		Circle frontcircle = new Circle();

		// Setting the properties of the circle
		frontcircle.setCenterX(1135.0f);
		frontcircle.setCenterY(600.0f);
		frontcircle.setRadius(30.0f);
		frontcircle.setFill(Color.WHITE);

		frontcircle.setStroke(Color.BLACK);

		Arc bottomrightfrontcirclearc = new Arc();

		// Setting the properties of the bottomrightfrontcirclearc
		bottomrightfrontcirclearc.setCenterX(1140.0f);
		bottomrightfrontcirclearc.setCenterY(605.0f);
		bottomrightfrontcirclearc.setRadiusX(25.0f);
		bottomrightfrontcirclearc.setRadiusY(23.0f);
		bottomrightfrontcirclearc.setStartAngle(-90.0f);
		bottomrightfrontcirclearc.setLength(90.0f);
		bottomrightfrontcirclearc.setType(ArcType.ROUND);
		bottomrightfrontcirclearc.setFill(Color.WHITE);
		bottomrightfrontcirclearc.setStroke(Color.BLACK);

		Arc toprightfrontcirclearc = new Arc();

		// Setting the properties of the toprightfrontcirclearc
		toprightfrontcirclearc.setCenterX(1140.0f);
		toprightfrontcirclearc.setCenterY(595.0f);
		toprightfrontcirclearc.setRadiusX(25.0f);
		toprightfrontcirclearc.setRadiusY(23.0f);
		toprightfrontcirclearc.setStartAngle(0.0f);
		toprightfrontcirclearc.setLength(90.0f);
		toprightfrontcirclearc.setType(ArcType.ROUND);
		toprightfrontcirclearc.setFill(Color.WHITE);
		toprightfrontcirclearc.setStroke(Color.BLACK);

		Arc bottomleftfrontcirclearc = new Arc();

		// Setting the properties of the bottomleftfrontcirclearc
		bottomleftfrontcirclearc.setCenterX(1130.0f);
		bottomleftfrontcirclearc.setCenterY(605.0f);
		bottomleftfrontcirclearc.setRadiusX(25.0f);
		bottomleftfrontcirclearc.setRadiusY(23.0f);
		bottomleftfrontcirclearc.setStartAngle(180.0f);
		bottomleftfrontcirclearc.setLength(90.0f);
		bottomleftfrontcirclearc.setType(ArcType.ROUND);
		bottomleftfrontcirclearc.setFill(Color.WHITE);
		bottomleftfrontcirclearc.setStroke(Color.BLACK);

		Arc topleftfrontcirclearc = new Arc();

		// Setting the properties of the topleftfrontcirclearc
		topleftfrontcirclearc.setCenterX(1130.0f);
		topleftfrontcirclearc.setCenterY(595.0f);
		topleftfrontcirclearc.setRadiusX(25.0f);
		topleftfrontcirclearc.setRadiusY(23.0f);
		topleftfrontcirclearc.setStartAngle(-270.0f);
		topleftfrontcirclearc.setLength(90.0f);
		topleftfrontcirclearc.setType(ArcType.ROUND);
		topleftfrontcirclearc.setFill(Color.WHITE);
		topleftfrontcirclearc.setStroke(Color.BLACK);

		Circle doorcircleright = new Circle();

		// Setting the properties of the circle
		doorcircleright.setCenterX(1115.0f);
		doorcircleright.setCenterY(865.0f);
		doorcircleright.setRadius(5.0f);
		doorcircleright.setFill(Color.WHITE);

		doorcircleright.setStroke(Color.BLACK);

		Circle doorcircleleft = new Circle();

		// Setting the properties of the circle
		doorcircleleft.setCenterX(1139.0f);
		doorcircleleft.setCenterY(865.0f);
		doorcircleleft.setRadius(5.0f);
		doorcircleleft.setFill(Color.WHITE);

		doorcircleleft.setStroke(Color.BLACK);

		Arc leftbottmleftarc = new Arc();

		// Setting the properties of the leftbottmleftarc
		leftbottmleftarc.setCenterX(950.0f);
		leftbottmleftarc.setCenterY(750.0f);
		leftbottmleftarc.setRadiusX(45.0f);
		leftbottmleftarc.setRadiusY(55.0f);
		leftbottmleftarc.setStartAngle(90.0f);
		leftbottmleftarc.setLength(-90.0f);

		leftbottmleftarc.setType(ArcType.ROUND);
		leftbottmleftarc.setFill(Color.WHITE);

		leftbottmleftarc.setStroke(Color.BLACK);

		Arc lefttopleftarc = new Arc();

		// Setting the properties of the lefttopleftarc
		lefttopleftarc.setCenterX(950.0f);
		lefttopleftarc.setCenterY(650.0f);
		lefttopleftarc.setRadiusX(45.0f);
		lefttopleftarc.setRadiusY(55.0f);
		lefttopleftarc.setStartAngle(-90.0f);
		lefttopleftarc.setLength(90.0f);
		lefttopleftarc.setType(ArcType.ROUND);
		lefttopleftarc.setFill(Color.WHITE);

		lefttopleftarc.setType(ArcType.ROUND);
		lefttopleftarc.setFill(Color.WHITE);

		lefttopleftarc.setStroke(Color.BLACK);

		Arc lefttoprightarc = new Arc();

		// Setting the properties of the lefttoprightarc
		lefttoprightarc.setCenterX(1060.0f);
		lefttoprightarc.setCenterY(650.0f);
		lefttoprightarc.setRadiusX(45.0f);
		lefttoprightarc.setRadiusY(55.0f);
		lefttoprightarc.setStartAngle(180.0f);
		lefttoprightarc.setLength(90.0f);
		lefttoprightarc.setType(ArcType.ROUND);
		lefttoprightarc.setFill(Color.WHITE);

		lefttoprightarc.setType(ArcType.ROUND);
		lefttoprightarc.setFill(Color.WHITE);

		lefttoprightarc.setStroke(Color.BLACK);

		Arc leftbottomrightarc = new Arc();

		// Setting the properties of the leftbottomrightarc
		leftbottomrightarc.setCenterX(1060.0f);
		leftbottomrightarc.setCenterY(750.0f);
		leftbottomrightarc.setRadiusX(45.0f);
		leftbottomrightarc.setRadiusY(55.0f);
		leftbottomrightarc.setStartAngle(90.0f);
		leftbottomrightarc.setLength(90.0f);
		leftbottomrightarc.setType(ArcType.ROUND);
		leftbottomrightarc.setFill(Color.WHITE);

		leftbottomrightarc.setType(ArcType.ROUND);
		leftbottomrightarc.setFill(Color.WHITE);

		leftbottomrightarc.setStroke(Color.BLACK);
		Arc rightbottmleftarc = new Arc();

		// Setting the properties of the rightbottmleftarc
		rightbottmleftarc.setCenterX(1210.0f);
		rightbottmleftarc.setCenterY(750.0f);
		rightbottmleftarc.setRadiusX(45.0f);
		rightbottmleftarc.setRadiusY(55.0f);
		rightbottmleftarc.setStartAngle(90.0f);
		rightbottmleftarc.setLength(-90.0f);

		rightbottmleftarc.setType(ArcType.ROUND);
		rightbottmleftarc.setFill(Color.WHITE);

		rightbottmleftarc.setStroke(Color.BLACK);

		Arc righttopleftarc = new Arc();

		// Setting the properties of the righttopleftarc
		righttopleftarc.setCenterX(1210.0f);
		righttopleftarc.setCenterY(650.0f);
		righttopleftarc.setRadiusX(45.0f);
		righttopleftarc.setRadiusY(55.0f);
		righttopleftarc.setStartAngle(-90.0f);
		righttopleftarc.setLength(90.0f);
		righttopleftarc.setType(ArcType.ROUND);
		righttopleftarc.setFill(Color.WHITE);

		righttopleftarc.setType(ArcType.ROUND);
		righttopleftarc.setFill(Color.WHITE);

		righttopleftarc.setStroke(Color.BLACK);

		Arc righttoprightarc = new Arc();

		// Setting the properties of the righttoprightarc
		righttoprightarc.setCenterX(1330.0f);
		righttoprightarc.setCenterY(650.0f);
		righttoprightarc.setRadiusX(45.0f);
		righttoprightarc.setRadiusY(55.0f);
		righttoprightarc.setStartAngle(180.0f);
		righttoprightarc.setLength(90.0f);
		righttoprightarc.setType(ArcType.ROUND);
		righttoprightarc.setFill(Color.WHITE);

		righttoprightarc.setType(ArcType.ROUND);
		righttoprightarc.setFill(Color.WHITE);

		righttoprightarc.setStroke(Color.BLACK);

		Arc rightbottomrightarc = new Arc();

		// Setting the properties of the rightbottomrightarc
		rightbottomrightarc.setCenterX(1330.0f);
		rightbottomrightarc.setCenterY(750.0f);
		rightbottomrightarc.setRadiusX(45.0f);
		rightbottomrightarc.setRadiusY(55.0f);
		rightbottomrightarc.setStartAngle(90.0f);
		rightbottomrightarc.setLength(90.0f);
		rightbottomrightarc.setType(ArcType.ROUND);
		rightbottomrightarc.setFill(Color.WHITE);

		rightbottomrightarc.setType(ArcType.ROUND);
		rightbottomrightarc.setFill(Color.WHITE);

		rightbottomrightarc.setStroke(Color.BLACK);

		Arc sidebottomleftarc = new Arc();

		// Setting the properties of the sidebottomleftarc
		sidebottomleftarc.setCenterX(1410.0f);
		sidebottomleftarc.setCenterY(735.0f);
		sidebottomleftarc.setRadiusX(30.0f);
		sidebottomleftarc.setRadiusY(40.0f);
		sidebottomleftarc.setStartAngle(90.0f);
		sidebottomleftarc.setLength(-69.0f);

		sidebottomleftarc.setType(ArcType.ROUND);
		sidebottomleftarc.setFill(Color.WHITE);

		sidebottomleftarc.setStroke(Color.BLACK);

		Arc sidetopleftarc = new Arc();

		// Setting the properties of the sidetopleftarc
		sidetopleftarc.setCenterX(1410.0f);
		sidetopleftarc.setCenterY(670.0f);
		sidetopleftarc.setRadiusX(35.0f);
		sidetopleftarc.setRadiusY(30.0f);
		sidetopleftarc.setStartAngle(-90.0f);
		sidetopleftarc.setLength(100.0f);
		sidetopleftarc.setType(ArcType.ROUND);
		sidetopleftarc.setFill(Color.WHITE);

		sidetopleftarc.setType(ArcType.ROUND);
		sidetopleftarc.setFill(Color.WHITE);

		sidetopleftarc.setStroke(Color.BLACK);

		Arc sidetoprightarc = new Arc();

		// Setting the properties of the sidetoprightarc
		sidetoprightarc.setCenterX(1555.0f);
		sidetoprightarc.setCenterY(590);
		sidetoprightarc.setRadiusX(35.0f);
		sidetoprightarc.setRadiusY(50.0f);
		sidetoprightarc.setStartAngle(201.0f);
		sidetoprightarc.setLength(70.0f);
		sidetoprightarc.setType(ArcType.ROUND);
		sidetoprightarc.setFill(Color.WHITE);

		sidetoprightarc.setType(ArcType.ROUND);
		sidetoprightarc.setFill(Color.WHITE);

		sidetoprightarc.setStroke(Color.BLACK);

		Arc sidebottomrightarc = new Arc();

		// Setting the properties of the sidebottomrightarc
		sidebottomrightarc.setCenterX(1555.0f);
		sidebottomrightarc.setCenterY(665.0f);
		sidebottomrightarc.setRadiusX(35.0f);
		sidebottomrightarc.setRadiusY(35.0f);
		sidebottomrightarc.setStartAngle(90.0f);
		sidebottomrightarc.setLength(115.0f);
		sidebottomrightarc.setType(ArcType.ROUND);
		sidebottomrightarc.setFill(Color.WHITE);

		sidebottomrightarc.setType(ArcType.ROUND);
		sidebottomrightarc.setFill(Color.WHITE);

		sidebottomrightarc.setStroke(Color.BLACK);


		final Slider red = new Slider(0, 255, 0);
		red.setMinSize(100, 100);
		red.setPrefWidth(500);
		red.setShowTickMarks(true);
		red.setShowTickLabels(true);
		red.setMajorTickUnit(1);
		red.setMinorTickCount(1);
		red.setBlockIncrement(1);
		red.setSnapToTicks(true);
		final Slider green = new Slider(0, 255, 0);
		green.setMinSize(100, 100);
		green.setPrefWidth(500);
		green.setShowTickMarks(true);
		green.setShowTickLabels(true);
		green.setMajorTickUnit(1);
		green.setMinorTickCount(1);
		green.setBlockIncrement(1);
		final Slider blue = new Slider(0, 255, 0);
		blue.setMinSize(100, 100);
		blue.setBlockIncrement(1);
		blue.setPrefWidth(20);
		blue.setShowTickMarks(true);
		blue.setShowTickLabels(true);
		blue.setMajorTickUnit(1);
		blue.setMinorTickCount(1);
		blue.setBlockIncrement(1);
		Label label1 = new Label("RED");
		label1.setFont(new Font("Arial", 24));
		label1.setTextFill(Color.color(1, 0, 0));
		Label label2 = new Label("GREEN");
		label2.setFont(new Font("Arial", 24));
		label2.setTextFill(Color.color(0, 1, 0));
		Label label3 = new Label("BLUE");
		label3.setFont(new Font("Arial", 24));
		label3.setTextFill(Color.color(0, 0, 1));

		TabPane tabPane = new TabPane();
		tabPane.setTabMinWidth(500);
		Tab tab1 = new Tab("RGB");
		Tab tab2 = new Tab("CMV");
		Tab tab3 = new Tab("HSV");

		tabPane.getTabs().add(tab1);
		tabPane.getTabs().add(tab2);
		tabPane.getTabs().add(tab3);
		Group root1 = new Group(frontroof, sidewall, frontwall, sideroof, sideroofb, rightwindow, rightwindowedge,
				leftwindow, ledtwindowedge, leftdoor, rightdoor, sidewindow, sidewindowedge, frontcircle,
				toprightfrontcirclearc, bottomrightfrontcirclearc, topleftfrontcirclearc, bottomleftfrontcirclearc,
				leftbottmleftarc, lefttopleftarc, lefttoprightarc, leftbottomrightarc, rightbottomrightarc,
				righttoprightarc, righttopleftarc, rightbottmleftarc, sidebottomrightarc, sidetoprightarc,
				sidetopleftarc, sidebottomleftarc, doorcircleright, doorcircleleft);

		
		Label label5= new Label("");

		Button btn = new Button();
		btn.setText("cyan value");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				double cyan;
				cyan = 255 - red.getValue() ;
				label5.setText(Integer.toString((int)cyan));

			}
		});
		
		Label label6= new Label("");

		Button btn2 = new Button();
		btn2.setText("yellow value");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				double yellow;
				yellow = 255 - blue.getValue();
				label6.setText(Integer.toString((int)yellow));

			}
		});
		
		Label label4 = new Label("");
		Button btn1 = new Button();
		btn1.setText("Magneta value");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				double magneta;
				magneta = 255 - green.getValue();
				label4.setText(Integer.toString((int)magneta));

			}
		});
		
		Label label7 = new Label();
		Button btn3 = new Button();
		btn3.setText("Hue value");
		btn3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Double Hue;
				Hue = rgb_hsv(red, green, blue);
				label7.setText(Double.toString((double)Hue));

			}
		});
		Label label8 = new Label();
		Button btn4 = new Button();
		btn4.setText("Saturation value");
		btn4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int Saturation;
				Saturation = rgb_hsv3(red, green, blue);
				label8.setText(Integer.toString((int)Saturation));

			}
		});
		Label label9 = new Label();
		Button btn5 = new Button();
		btn5.setText("Value value");
		btn5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				double Value;
				Value = rgb_hsv(red, green, blue);
				label9.setText(Double.toString((double)Value));

			}
		});
		
		
		red.valueProperty().addListener(new ChangeListener<Number>() {
			
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				label1.setText(Integer.toString((int) red.getValue()));
			}
		});

		green.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				label2.setText(Integer.toString((int) green.getValue()));
			}
		});

		blue.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				label3.setText(Integer.toString((int) blue.getValue()));
			}
		});
		
		
		
		Rectangle rect = new Rectangle(20, 20, 200, 200);
		rect.setFill(Color.WHITE);
		rect.setStroke(Color.BLACK);
		Group group = new Group(rect);

		Pane root = new Pane();

		GridPane grid1 = new GridPane();
		grid1.setHgap(80);
		grid1.add(red, 0, 0, 1, 1);
		grid1.add(green, 0, 2, 1, 1);
		grid1.add(blue, 0, 3, 1, 1);
		grid1.add(label1, 2, 1, 4, 1);
		grid1.add(label2, 2, 2, 4, 1);
		grid1.add(label3, 2, 3, 4, 1);
		grid1.add(group, 1, 4, 2, 4);
		grid1.add(root1, 4, 5, 4, 4);
		grid1.add(label4, 5, 2);
		grid1.add(label5,4,2);
		grid1.add(btn, 4, 1);
		grid1.add(btn1,5,1);
		grid1.add(btn2,6,1);
		grid1.add(label6,6,2);
		grid1.add(label7,4,4);
		grid1.add(btn3,4,3);
		grid1.add(label8, 5, 4);
		grid1.add(btn4, 5, 3);
		grid1.add(label9, 6, 4);
		grid1.add(btn5, 6, 3);

		tab1.setContent(grid1);
		

	    
		// Creating a scene object
		root.getChildren().add(tabPane);

		// Setting title to the Stage
		stage.setTitle("");

		Scene scene = new Scene(root, 1800, 1000);

		stage.setScene(scene);
		stage.show();

		getcolor(red, green, blue, rect);

		rightdoor.setOnMousePressed(mouseEvent -> {
			setColor(red, green, blue, rightdoor);
		});

		leftdoor.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, leftdoor);
		});

		frontwall.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, frontwall);
		});

		sidewall.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, sidewall);
		});

		frontroof.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, frontroof);
		});

		sideroof.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, sideroof);
		});

		sideroofb.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, sideroofb);
		});

		rightwindow.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, rightwindow);
		});

		rightwindowedge.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, rightwindowedge);
		});

		leftwindow.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, leftwindow);
		});

		ledtwindowedge.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, ledtwindowedge);
		});

		sidewindow.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, sidewindow);
		});

		frontcircle.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, frontcircle);
		});

		sidewindowedge.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, sidewindowedge);
		});

		bottomrightfrontcirclearc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, bottomrightfrontcirclearc);
		});
		toprightfrontcirclearc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, toprightfrontcirclearc);
		});
		bottomleftfrontcirclearc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, bottomleftfrontcirclearc);
		});
		topleftfrontcirclearc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, topleftfrontcirclearc);
		});
		doorcircleright.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, doorcircleright);
		});
		doorcircleleft.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, doorcircleleft);
		});
		leftbottmleftarc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, leftbottmleftarc);
		});
		lefttopleftarc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, lefttopleftarc);
		});
		lefttoprightarc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, lefttoprightarc);
		});
		leftbottomrightarc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, leftbottomrightarc);
		});
		rightbottmleftarc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, rightbottmleftarc);
		});
		righttopleftarc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, righttopleftarc);
		});
		righttoprightarc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, righttoprightarc);
		});
		rightbottomrightarc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, rightbottomrightarc);
		});
		sidebottomleftarc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, sidebottomleftarc);
		});
		sidetopleftarc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, sidetopleftarc);
		});
		sidetoprightarc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, sidetoprightarc);
		});
		sidebottomrightarc.setOnMouseClicked(mouseEvent -> {
			setColor(red, green, blue, sidebottomrightarc);
		});

	}
	

	public void getcolor(Slider red, Slider green, Slider blue, Shape rect) {
		red.valueProperty().addListener(ov -> setColor(red, green, blue, rect));
		green.valueProperty().addListener(ov -> setColor(red, green, blue, rect));
		blue.valueProperty().addListener(ov -> setColor(red, green, blue, rect));

	}

	public double getred(Slider red) {
		return red.getValue();
	}

	private void setColor(Slider red, Slider green, Slider blue, Shape rect) {
		rect.setFill(Color.color(red.getValue() / 255, green.getValue() / 255, blue.getValue() / 255));
	}

	public double rgb_hsv(Slider r, Slider b, Slider g) {

		double red = r.getValue() / 255;
		double green = g.getValue() / 255;
		double blue = b.getValue() / 255;

		int high = (int) Math.max(red, Math.max(green, blue));
		int Low = (int) Math.min(red, Math.min(green, blue));
		int med = (int) Math.max(Math.min(red, green), Math.min(Math.max(red, green), blue));
		int diff = high - Low;
		  double h = -1, s = -1;
	         
	        // if cmax and cmax are equal then h = 0
	        if (high == Low)
	         return   h = 0;
	 
	        // if cmax equal r then compute h
	        else if (high == red)
	        	return   h = (60 * ((green - blue) / diff) + 360) % 360;
	 
	        // if cmax equal g then compute h
	        else if (high == green)
	        	return   h = (60 * ((blue - red) / diff) + 120) % 360;
	 
	        // if cmax equal b then compute h
	        else if (high == blue)
	        	return   h = (60 * ((red - green) / diff) + 240) % 360;
			return h;
	 

	}
	public int rgb_hsv2(Slider r, Slider b, Slider g) {

		double red = r.getValue() / 255;
		double green = g.getValue() / 255;
		double blue = b.getValue() / 255;

		int high = (int) Math.max(red, Math.max(green, blue));
		int Low = (int) Math.min(red, Math.min(green, blue));
		int med = (int) Math.max(Math.min(red, green), Math.min(Math.max(red, green), blue));
		int diff = high - Low;
		int h = -1, s = -1;
		int alpha = 0;
		int v = high;
		return v;
	}
	public int rgb_hsv3(Slider r, Slider b, Slider g) {

		double red = r.getValue() / 255;
		double green = g.getValue() / 255;
		double blue = b.getValue() / 255;

		int high = (int) Math.max(red, Math.max(green, blue));
		int Low = (int) Math.min(red, Math.min(green, blue));
		int med = (int) Math.max(Math.min(red, green), Math.min(Math.max(red, green), blue));
		int diff = high - Low;
		int h = -1, s = -1;
		int alpha = 0;
		int v = high;
		if (v == 0)

			return s = 0;

		else
		return	s = high - Low;
	}

	public static void main(String args[]) {
		launch(args);

	}
}