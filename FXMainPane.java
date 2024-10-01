


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	static //student Task #2:
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Label label1;
	TextField text1;
	HBox box1;
	HBox box2;
	




	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager data;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		button1 = new Button("Hello");
		button2 = new Button("Howdy");
		button3 = new Button("Chinese");
		button4 = new Button("Clear");
		 button5 = new Button("Exit");
		label1 = new Label("Feedback");
		text1 = new TextField();
		box1 = new HBox();
		box2 = new HBox();
		//student Task #4:
		//  instantiate the DataManager instance
		data = new DataManager();
		//  set margins and set alignment of the components
		Insets inset = new Insets(10);
		HBox.setMargin(button1, inset); 
		HBox.setMargin(button2, inset); 
		HBox.setMargin(button3, inset); 
		HBox.setMargin(button4, inset); 
		HBox.setMargin(button5, inset); 
		box1.setAlignment(Pos.CENTER); 
		box2.setAlignment(Pos.CENTER); 

		button1.setOnAction(new ButtonHandler());
		button2.setOnAction(new ButtonHandler());
		button3.setOnAction(new ButtonHandler());
		button4.setOnAction(new ButtonHandler());
		button5.setOnAction(new ButtonHandler());
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		box1.getChildren().addAll(text1, label1);
		//  add the buttons to the other HBox
		box1.getChildren().addAll(button1, button2, button3, button4, button5);

		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(box1, box2);
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	
	private class ButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent event)
		{
			Object click = event.getTarget();
			if(click instanceof Button)
			{
				Button clicked = (Button) click;
				
				if(clicked.getText().equals("Hello"))
				{
					text1.setText(data.getHello());
				}
				else if(clicked.getText().equals("Howdy"))
				{
					text1.setText(data.getHowdy());
				}
				else if(clicked.getText().equals("Chinese"))
				{
					text1.setText(data.getChinese());
				}
				else if(clicked.getText().equals("Clear"))
				{
					text1.setText("");
				}
				else if(clicked.getText().equals("Exit"))
				{
					Platform.exit();
	                System.exit(0);
				}
			}
			
		}
	}
	
}
	
