package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			root.getChildren().add(new Label("Mitchell's Branch"));
			Label adamsLabel = new Label("Adam's Label");
			Label adamsBranch = new Label("Adam's Branch");
			root.getChildren().addAll(adamsLabel, adamsBranch);
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Mitchell's Project");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
