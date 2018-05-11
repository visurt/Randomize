package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("RandomizeUI.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.sizeToScene();
			stage.setResizable(false);
			stage.setTitle("Randomize");
			stage.show();
		} catch (Exception e) {
			System.out.println("Exception creating scene: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
