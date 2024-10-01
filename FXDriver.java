
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXDriver extends Application {
	   
	
		   
	public void start(Stage stage) throws IOException {
		//student Task #1:
		FXMainPane root = new FXMainPane();
		stage.setScene(new Scene(root, 500,500));  
		//  instantiate the FXMainPane, name it root
		//  set the scene to hold root
		//set stage title
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();

	}
	public static void main(String[] args) {
		launch(args);   
	}
}
